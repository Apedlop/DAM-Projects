#!/bin/bash


es_numero() {
    local input="$1"
    if expr "$input" : '^[0-9]\+$' >/dev/null; then
        echo "true"
    else
        echo "false"
    fi
}

TRASH_CREATE() {
    # Comprobar si $HOME/TRASHDIR existe
    if [ ! -d "$HOME/TRASHDIR" ]; then
        # Si no existe, crear el directorio
        mkdir -p "$HOME/TRASHDIR"
        echo "Directorio de la papelera creado correctamente en $HOME/TRASHDIR."
        
        # Crear el archivo .logs vacío
        touch "$HOME/TRASHDIR/.logs"
        echo "Archivo .logs creado correctamente."
         touch "$HOME/TRASHDIR/.history"
        echo "Archivo .history creado correctamente."
        
        # Solicitar al usuario que ingrese un número para el archivo .quote
        read -p "Introduce un número para el archivo .quote: " numero
        if [ "$(es_numero $numero)" = "true"  ]; then
        	echo "$numero" > "$HOME/TRASHDIR/.quote"
        	echo "Archivo .quote creado correctamente con el número $numero."
        else
        	echo "No es un numero válido"
        fi
    else
        echo "El directorio de la papelera ya existe en $HOME/TRASHDIR."
    fi
}

TRASH_ADD() {
    # Verifica si la papelera existe
    if [ -d "$HOME/TRASHDIR" ]; then
        # Solicita al usuario la ruta del archivo o directorio a mover a la papelera
        read -p "Introduzca la ruta del archivo o directorio: " ruta
        
        # Verifica si la ruta especificada existe
        if [ -e "$ruta" ]; then
            # Verifica si hay suficiente espacio en la papelera
            if [ "$(Tamano_Papelera "$ruta")" = "0" ]; then
                # Genera un código único para el archivo o directorio
                codigo=$(code_file)
                
                # Comprime el archivo o directorio
                ZIP_FILE "$ruta"
                
                # Verifica si es un directorio o archivo y lo mueve a la papelera
                if [ -d "$ruta" ]; then
                    mv "$ruta.tar.gz" "$HOME/TRASHDIR/$codigo.tar.gz"
                    log_action "add" "$ruta" "$HOME/TRASHDIR/$codigo.tar.gz"
                    rm -R "$ruta"
                else
                    mv "$ruta.gz" "$HOME/TRASHDIR/$codigo.gz"
                    log_action "add" "$ruta" "$HOME/TRASHDIR/$codigo.gz"
                fi
                
                # Actualiza la lista de acciones
                lista_action "$codigo" "$ruta"

                # Mensaje de éxito
                echo "Se ha añadido correctamente el archivo o directorio a la papelera."
            else
                # Mensaje de error si no hay suficiente espacio en la papelera
                echo "Tamaño de papelera insuficiente."
            fi
        else
            # Mensaje de error si la ruta especificada no existe
            echo "La ruta especificada no existe."
        fi
    else
        # Mensaje de error si la papelera no existe
        echo "La papelera no existe."
    fi
}

TRASH_RESTORE() {
    # Verifica si la papelera existe
    if [ -d "$HOME/TRASHDIR" ]; then
        # Solicita al usuario el ID del archivo o directorio a restaurar
        read -p "Introduzca el id del archivo que quiere restaurar: " id
        
        # Verifica si el ID proporcionado es un número válido
        if [ "$(es_numero $id)" = "true" ]; then
            # Verifica si el archivo comprimido con el ID especificado existe en la papelera
            if [ "$(id_existe "$id.gz")" = "0" ] || [ "$(id_existe "$id.tar.gz")" = "0" ]; then
                # Obtiene la ruta original del archivo o directorio
                ruta=$(obtener_ruta_por_codigo "$id")
                
                # Descomprime el archivo o directorio
                UNZIP_FILE "$id"
                
                # Mueve el archivo o directorio restaurado a su ubicación original
                if [ -e "$HOME/TRASHDIR/$id" ] || [ -e "$HOME/TRASHDIR/$id.gz" ] || [ -e "$HOME/TRASHDIR/$id.tar.gz" ]; then
                    sudo mv "$HOME/TRASHDIR/$id" "$ruta"
                    
                    # Elimina la línea correspondiente al ID en los logs
                    eliminar_linea_logs "$id"
                    
                    # Registra la acción de restaurar el archivo o directorio
                    log_action "Restore" "$ruta" "$ruta"
                    
                    echo "Se ha restaurado correctamente el archivo o directorio."
                else
                    echo "Error al descomprimir el archivo o directorio."
                fi
            else
                echo "No existe el archivo o directorio con el ID especificado."
            fi
        else
            echo "El ID proporcionado no es un número válido."
        fi
    else
        echo "La papelera no existe."
    fi
}

TRASH_REMOVE() {
    # Verifica si la papelera existe
    if [ -d "$HOME/TRASHDIR" ]; then
        # Solicita al usuario el ID del fichero que desea eliminar
        read -p "Introduzca el ID del fichero que desea eliminar: " id_fichero
        
        # Verifica si el ID del fichero existe en la papelera
        if [ "$(id_existe "$id_fichero.gz")" = "0" ]; then
            # Define la ruta completa del fichero en la papelera
            nombre_fichero="$HOME/TRASHDIR/$id_fichero.gz"

            # Descomprime el fichero o directorio
            UNZIP_FILE "$id_fichero"
            
            # Verifica si la descompresión fue exitosa
            if [ $? -eq 0 ]; then
                # Elimina el fichero de la papelera
                rm -r "$nombre_fichero"
                
                # Verifica si la eliminación fue exitosa
                if [ $? -eq 0 ]; then
                    echo "El fichero '$nombre_fichero' se ha eliminado correctamente de la papelera."
                    
                    # Registra la acción de eliminación en el historial
                    log_action "remove" "$nombre_fichero" "$HOME/TRASHDIR/$nombre_fichero"
                    
                    # Elimina la línea correspondiente al fichero en los registros
                    eliminar_linea_logs "$id_fichero"
                else
                    echo "Error: No se pudo eliminar el fichero de la papelera."
                fi
            else
                echo "Error: No se pudo descomprimir el fichero o directorio."
            fi
        else
            echo "Error: El ID del fichero no es válido o no se encuentra en la papelera."
        fi
    else
        echo "Error: La papelera no existe."
    fi
}


TRASH_LIST() {
	ImprimirTamano
	cat "$HOME/TRASHDIR/.logs"

}

TRASH_HISTORY() {

	listarHistorial
}

archivo_existe() {
    local archivo="$1"
    if [ -e "$archivo" ]; then
        echo "0"  # true
    else
        echo "1"  # false
    fi
}
eliminar_linea_logs() {
    local codigo="$1"
    sed -i "/code=$codigo#/d" "$HOME/TRASHDIR/.logs"
}

code_file() {
    local i=1
    local carpeta=$HOME/TRASHDIR
    while [ -e "$carpeta/$i.gz" ]; do
        ((i++))
    done
    echo $i
}
ZIP_FILE() {
    file="$1"
    
    if [ -d "$file" ]; then
        # Si es un directorio, usar tar y gzip para comprimirlo
        tar -czvf "$file.tar.gz" -C "$(dirname "$file")" "$(basename "$file")"
    else
        # Si es un archivo regular, usar gzip para comprimirlo
        gzip "$file"
    fi
}

ImprimirTamano() {
    # Nombre del archivo que contiene el tamaño máximo permitido en KB
    archivo_max_size="$HOME/TRASHDIR/.quote"
    
    # Nombre de la carpeta a comprobar    
    carpeta="$HOME/TRASHDIR"
    
    # Leer el tamaño máximo permitido desde el archivo
    if [ -f "$archivo_max_size" ]; then
        max_size=$(cat "$archivo_max_size")
    else
        echo "El archivo de tamaño máximo permitido no existe."
        return 1
    fi
    
    # Verificar que el valor leído es un número
    if ! [[ "$max_size" =~ ^[0-9]+$ ]]; then
        echo "El archivo de tamaño máximo permitido contiene un valor no válido."
        return 1
    fi
    
    # Obtener el tamaño actual de la carpeta en KB
    current_size=$(du -sk "$carpeta" | cut -f1)
    
    # Calcular el tamaño disponible
    available_size=$((max_size - current_size))
    
    # Verificar que el tamaño disponible es un número
    if [ "$available_size" -lt 0 ]; then
        available_size=0
    fi
    
    echo "$available_size KB"
}
listarHistorial() {
    # Verifica si el archivo de historial no existe
    if [ ! -f "$HOME/TRASHDIR/.history" ]; then
        # Imprime un mensaje de error si el archivo de historial no existe
        echo "El archivo de historial $HOME/TRASHDIR/.history no existe."
        # Retorna 1 indicando un error
        return 1
    fi

    # Verifica si el archivo de historial no tiene permisos de lectura
    if [ ! -r "$HOME/TRASHDIR/.history" ]; then
        # Imprime un mensaje de error si el archivo de historial no se puede leer
        echo "No se puede leer el archivo de historial $HOME/TRASHDIR/.history."
        # Retorna 1 indicando un error
        return 1
    fi

    # Muestra el contenido del archivo de historial en la terminal
    cat "$HOME/TRASHDIR/.history"
}

Tamano_Papelera() {
    # Nombre del archivo que contiene el tamaño máximo permitido en KB
    archivo_max_size="$HOME/TRASHDIR/.quote"
    
    # Nombre de la carpeta a comprobar    
    carpeta="$HOME/TRASHDIR"
    
    # Leer el tamaño máximo permitido desde el archivo
    max_size=$(cat "$archivo_max_size")
    
    # Obtener el tamaño actual de la carpeta en KB
    current_size=$(du -sk "$carpeta" | cut -f1)
    
    # Ruta del archivo que se desea añadir
    ruta_archivo="$1.gz"
    
    # Obtener el tamaño del archivo en bytes
    tamano_bytes=$(stat -c%s "$ruta_archivo")
    
    # Convertir el tamaño a kilobytes (con dos decimales)
    tamano_kb=$(echo "scale=2; $tamano_bytes/1024" | bc)
    
    # Sumar el tamaño en KB al tamaño actual de la carpeta
    current_size=$(echo "$current_size + $tamano_kb" | bc)
    
    # Mostrar el tamaño acumulado
    
    # Comparar los tamaños
    if (( $(echo "$current_size > $max_size" | bc -l) )); then
        echo "1"
    else
        echo "0"
    fi
}
log_action() {
    local operacion="$1"
    local nombre_archivo="$2"
    local ruta_archivo="$3"
    echo "$operacion: $nombre_archivo ## $ruta_archivo ## $(date "+%Y-%m-%d %H:%M:%S")" >> "$HOME/TRASHDIR/.history"
}
lista_action(){
	local codigo="$1"
	local ruta="$2"
	echo "code=$codigo#$ruta#$(date "+%Y-%m-%d %H:%M:%S")" >> "$HOME/TRASHDIR/.logs"
}

obtener_ruta_por_codigo() {
    local codigo="$1"
    local ruta=$(grep "code=$codigo" "$HOME/TRASHDIR/.logs" | cut -d"#" -f2)
    echo "$ruta"
}
id_existe() {
    local id="$1"
    if [ -e "$HOME/TRASHDIR/$id" ]; then
        echo "0"  # true
    else
        echo "1"  # false
    fi
}
UNZIP_FILE() {
    file="$1"  # El archivo o directorio a descomprimir
    
    if [ -e "$HOME/TRASHDIR/$file.gz" ]; then
        gunzip "$HOME/TRASHDIR/$file.gz"
    elif [ -e "$HOME/TRASHDIR/$file.tar.gz" ]; then
        tar -xzvf "$HOME/TRASHDIR/$file.tar.gz" -C "$HOME/TRASHDIR"
    else
        echo "No se encontró un archivo comprimido con el nombre especificado en la papelera."
    fi
}


main() {
    while true; do
        # Mostrar el menú
        echo "Menú:"
        echo "1. Crear Papelera"
        echo "2. Añadir archivo a la papelera"
        echo "3. Recuperar archivo de la papelera"
        echo "4. Eliminar archivo para siempre de la papelera"
        echo "5. Listar espacio libre y papelera"
        echo "6. Listar Historial"
        echo "7. Salir"

        # Leer la opción del usuario
        read -p "Seleccione una opción (1-7): " opcion

	 if [ "$(es_numero $opcion)" = "true"  ]; then
        	# Manejar la opción del usuario
        	case $opcion in
            	1)
               	TRASH_CREATE
                ;;
            	2)
                TRASH_ADD
                ;;
            	3)
                TRASH_RESTORE
                ;;
            	4)
                TRASH_REMOVE
                ;;
            	5)
                TRASH_LIST
                ;;
                6)
                TRASH_HISTORY
                ;;
            	7)
                echo "Saliendo del programa."
                exit
                ;;
            	*)
                echo "Opción inválida. Por favor, seleccione una opción del 1 al 6."
                ;;
        esac
        else
        	exit
        fi
    done
}

main


