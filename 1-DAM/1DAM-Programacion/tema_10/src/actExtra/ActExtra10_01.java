package actExtra;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class ActExtra10_01 {

	public static void main(String[] args) {

		try (BufferedReader in1 = new BufferedReader(new FileReader("fichero1.txt"));
			 BufferedReader in2 = new BufferedReader(new FileReader("fichero2.txt"));
			 BufferedWriter out = new BufferedWriter(new FileWriter("resultado_fichero.txt"))) {

			String[] numeros = new String[0]; // Tamaño inicial
			int contador = 0;

			// Leer y escribir números del primer archivo sin repetir
			String linea;

			while ((linea = in1.readLine()) != null) {

				boolean repetido = false;

				for (int i = 0; i < contador; i++) {

					if (numeros[i].equals(linea.trim())) {
						repetido = true;
					}

				}

				if (!repetido) {

					if (contador == numeros.length) {
						numeros = Arrays.copyOf(numeros, numeros.length + 1);
					}

					numeros[contador++] = linea.trim();
					out.write(linea);
					out.newLine();
					
				}

			}

			// Leer y escribir solo números no repetidos del segundo archivo
			while ((linea = in2.readLine()) != null) {

				boolean repetido = false;

				for (int i = 0; i < contador; i++) {

					if (numeros[i].equals(linea.trim())) {
						repetido = true;
					}

				}

				if (!repetido) {

					if (contador == numeros.length) {
						numeros = Arrays.copyOf(numeros, numeros.length + 1);
					}

					out.write(linea);
					out.newLine();

				}

			}

			System.out.println("Se han combinado los números de los archivos correctamente.");

		} catch (IOException ex) {

			System.out.println(ex.getMessage());

		}

	}

}
