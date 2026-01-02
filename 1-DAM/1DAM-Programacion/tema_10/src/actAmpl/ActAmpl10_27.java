package actAmpl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ActAmpl10_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int caracteres = 0;
		int lineas = 0;
		int palabras = 0;

		try (BufferedReader in = new BufferedReader(new FileReader("Carta.txt"))) {

			String linea;

			while ((linea = in.readLine()) != null) {

				int conteo = 0;
				
				char[] caracteresArray = linea.toCharArray();
				
				for (int i = 0; i < caracteresArray.length; i++) {
					
					char c = caracteresArray[i];
					
					if (c == ';' || c == ',' || c == '.' || c == '\t' || c == ' ') {
						conteo--;
						conteo++;
					} else {
						conteo++;
					}
					
				}
				
				caracteres += conteo;
				lineas++;

				// Contar palabras dividiendo la línea por espacios en blanco
				palabras += linea.split("\\s+|\\t|\\.|,|;| ").length;

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
