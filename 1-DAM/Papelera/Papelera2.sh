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
	 if [ -d "$HOME/TRASHDIR" ]; then
	 	read -p "Introduzca la ruta del archivo o directorio: " ruta
	 	if [ "$(archivo_existe "$ruta")" = "0"  ]; then
	 		codigo=$(code_file)
	 		ZIP_FILE "$ruta"
	 		if [ "$(Tamano_Papelera "$ruta")" = "0"  ]; then
	 			if [ -d "$ruta" ]; then 
	 				mv "$ruta.tar.gz" "$HOME/TRASHDIR/$codigo.tar.gz"
	 				log_action "add" "$ruta" "$ruta"
	 				lista_action "$codigo" "$ruta"
	 			elif [ -f "$ruta" ]; then
	 				mv "$ruta.gz" "$HOME/TRASHDIR/$codigo.gz"
	 				log_action "add" "$ruta" "$ruta"
	 				lista_action "$codigo" "$ruta"
	 			else 
	 				echo "La ruta que ha proporcionado no es válida."
	 			fi
	 			
	 		else
	 			echo "Tamaño de papelera insuficiente"
	 		fi
	 	else
	 		echo "No existe"
	 	fi
	 else
	 	echo "La papelera no existe"
	 fi
}



ZIP_FILE() {
    local file="$1"
    if [ -d "$file" ]; then
        # Si es un directorio, comprimir recursivamente
        tar -czf "$file.tar.gz" -C "$(dirname "$file")" "$(basename "$file")" && rm -r "$file"
    elif [ -f "$file" ]; then
        # Si es un archivo, comprimir normalmente
        gzip "$file"
    else
        echo "La ruta proporcionada no es válida"
    fi
}


TRASH_RESTORE(){
	if [ -d "$HOME/TRASHDIR" ]; then
		read -p "Introduzca el id del archivo que quiere restaurar: " id
		if [ "$(es_numero $id)" = "true"  ]; then
			if [ "$(id_existe "$id.gz")" = "0"  ]; then
			ruta=""
				ruta=$(obtener_ruta_por_codigo "$id")
				UNZIP_FILE "$id"
				echo "$ruta"
			sudo mv "$HOME/TRASHDIR/$id"	"$ruta"
			eliminar_linea_logs "$id"
			log_action "Restore" "$ruta" "$ruta"
			
			else
				echo "No existe"
			fi
		else
			echo "No es un numero correcto el id"
		fi
	else
		echo "La papelera no existe"
	fi
	 
}
TRASH_REMOVE() {
    if [ -d "$HOME/TRASHDIR" ]; then
        read -p "Introduzca el ID del fichero que desea eliminar: " id_fichero
        if [ "$(id_existe "$id_fichero.gz")" = "0"  ]; then
            nombre_fichero="$HOME/TRASHDIR/$id_fichero.gz"

            # Borrar el fichero de la papelera
            rm -r "$nombre_fichero"
            if [ $? -eq 0 ]; then
                echo "El fichero '$nombre_fichero' se ha eliminado correctamente de la papelera."
                # Actualizar el historial
                log_action "remove" "$nombre_fichero" "$HOME/TRASHDIR/$nombre_fichero"
	 	eliminar_linea_logs "$id_fichero"
            else
                echo "Error: No se pudo eliminar el fichero de la papelera."
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
    while [ -e "$carpeta/$i.gz" ] || [ -e "$carpeta/$i.tar.gz" ]; do
        ((i++))
    done
    echo $i
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
    
    # Verificar que el archivo de tamaño máximo existe
    if [ ! -f "$archivo_max_size" ]; then
        echo "Error: El archivo de tamaño máximo $archivo_max_size no existe."
        return 1
    fi
    
    # Leer el tamaño máximo permitido desde el archivo
    max_size=$(cat "$archivo_max_size")
    
    # Verificar que max_size es un número
    if ! [[ "$max_size" =~ ^[0-9]+$ ]]; then
        echo "Error: El tamaño máximo debe ser un número."
        return 1
    fi
    
    # Obtener el tamaño actual de la carpeta en KB
    current_size=$(du -sk "$carpeta" | cut -f1)
    
    # Verificar que se ha proporcionado una ruta válida
    if [ -z "$1" ]; then
        echo "Error: Debe proporcionar la ruta de un archivo o directorio."
        return 1
    fi
    
    ruta="$1"
    
    # Comprimir y obtener el tamaño del archivo o directorio
    if [ -d "$ruta" ]; then
        ruta_archivo="$1.tar.gz"
        tamano_bytes=$(stat -c%s "$ruta_archivo")
    elif [ -f "$ruta" ]; then
    	ruta_archivo="$1.gz"
        tamano_bytes=$(stat -c%s "$ruta_archivo")
    else
        echo "Error: La ruta proporcionada no es válida."
        return 1
    fi
    
    # Convertir el tamaño a kilobytes
    tamano_kb=$(echo "$tamano_bytes/1024" | bc)
    
    # Sumar el tamaño en KB al tamaño actual de la carpeta
    new_size=$(echo "$current_size + $tamano_kb" | bc)
    
    # Comparar el nuevo tamaño con el tamaño máximo permitido
    if (( new_size > max_size )); then
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
    file="$1"  # El archivo a descomprimir

   	gunzip "$HOME/TRASHDIR/$file.gz"
    
  
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
