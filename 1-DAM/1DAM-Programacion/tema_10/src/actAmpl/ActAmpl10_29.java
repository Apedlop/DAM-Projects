package actAmpl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ActAmpl10_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // Solicitar al usuario el nombre del archivo de entrada
        String nombreArchivoEntrada = pedirNombreArchivo("Introduce el nombre del archivo de texto con código fuente en Java: ");

        // Generar el nombre del nuevo archivo
        String nombreNuevoArchivo = "sin_comentarios_" + nombreArchivoEntrada;

        // Eliminar los comentarios y guardar el contenido en el nuevo archivo
        eliminarComentarios(nombreArchivoEntrada, nombreNuevoArchivo);

        System.out.println("Se ha creado el archivo '" + nombreNuevoArchivo + "' sin comentarios.");
        
    }

    public static String pedirNombreArchivo(String mensaje) {
    	
        Scanner sc = new Scanner(System.in);
        
        System.out.print(mensaje);
        String nombreArchivo = sc.nextLine();
        
        return nombreArchivo;
        
    }

    public static void eliminarComentarios(String archivoEntrada, String archivoSalida) {
    	
        try (BufferedReader in = new BufferedReader(new FileReader(archivoEntrada));
             BufferedWriter out = new BufferedWriter(new FileWriter(archivoSalida))) {
        	
            String linea;
            boolean comentarioMultilinea = false;
            
            while ((linea = in.readLine()) != null) {
            	
                linea = linea.trim();
                
                if (linea.startsWith("/*")) {
                    comentarioMultilinea = true;
                } else if (linea.endsWith("*/")) {
                    comentarioMultilinea = false;
                }

                if (!comentarioMultilinea && !linea.startsWith("//")) {
                    out.write(linea);
                    out.newLine();
                }
                
            }
            
        } catch (IOException ex) {
        	
            System.out.println(ex.getMessage());
            
        }
    }
}