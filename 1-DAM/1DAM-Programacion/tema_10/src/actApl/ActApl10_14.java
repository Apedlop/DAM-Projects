package actApl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ActApl10_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int caracteres = 0;
        int lineas = 0;
        int palabras = 0;

        try (BufferedReader in = new BufferedReader(new FileReader("Carta.txt"))) {
        	
            String linea;
            
            while ((linea = in.readLine()) != null) {
            	
                // Contar caracteres (sin contar los espacios en blanco al principio y al final)
                caracteres += linea.length();
                lineas++;

                // Contar palabras dividiendo la línea por espacios en blanco
                palabras += linea.split("\\s+").length;
                
            }
            
        } catch (IOException ex) {
        	
            System.out.println("Error al leer el archivo: " + ex.getMessage());
            
        }

        // Imprimir resultados
        System.out.println("Caracteres: " + caracteres);
        System.out.println("Líneas: " + lineas);
        System.out.println("Palabras: " + palabras);
        
    }

}
