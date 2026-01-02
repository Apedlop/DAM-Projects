package actAmpl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ActAmpl10_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el nombre del archivo
        System.out.print("Introduce el nombre del archivo de texto: ");
        String nombreArchivo = scanner.nextLine();

        // Solicitar al usuario la cadena a buscar
        System.out.print("Introduce la cadena a buscar: ");
        String cadena = scanner.nextLine();

        buscarOcurrencias(nombreArchivo, cadena);
        
    }

    public static void buscarOcurrencias(String nombreArchivo, String cadena) {
    	
        try (BufferedReader in = new BufferedReader(new FileReader(nombreArchivo))) {
        	
            String linea;
            int contador = 0;
            
            while ((linea = in.readLine()) != null) {
                contador += contarOcurrencias(linea, cadena);
            }
            
            System.out.println("La cadena '" + cadena + "' aparece " + contador + " veces en el archivo '" + nombreArchivo + "'.");
            
        } catch (IOException ex) {
        	
            System.out.println(ex.getMessage());
            
        }
    }

    public static int contarOcurrencias(String texto, String cadena) {
    	
        int contador = 0;
        int indice = texto.indexOf(cadena);
        
        while (indice != -1) {
            contador++;
            indice = texto.indexOf(cadena, indice + 1);
        }
        
        return contador;
        
    }
}
