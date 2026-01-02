package actApl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ActApl10_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (BufferedReader in1 = new BufferedReader(new FileReader("Texto1.txt"));
			 BufferedReader in2 = new BufferedReader(new FileReader("Texto2.txt"))) {

			int linea = 1;
            String fichero1 = in1.readLine();
            String fichero2 = in2.readLine();

            while (fichero1 != null && fichero2 != null) {
            	
                if (!fichero1.equals(fichero2)) {
                    // Encontramos la primera diferencia
                    int caracter = 0;
                    
                    while (caracter < fichero1.length() && caracter < fichero2.length()) {
                    	
                        if (fichero1.charAt(caracter) != fichero2.charAt(caracter)) {
                            System.out.println("Diferencia encontrada en la línea " + linea + ", caracter " + (caracter + 1));
                        }
                        
                        caracter++;
                        
                    }
                    
                    return;
                    
                }

                linea++;
                fichero1 = in1.readLine();
                fichero2 = in2.readLine();
                 
            }

            // Si llegamos aquí, los archivos tienen la misma cantidad de líneas y son iguales
            System.out.println("Los archivos son iguales.");

		} catch (IOException ex) {

			System.out.println(ex.getMessage());

		}

	}

}
