package actExtra;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class ActExtra10_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (BufferedReader in = new BufferedReader(new FileReader("Prueba.txt"));
			 BufferedWriter out = new BufferedWriter(new FileWriter("LineasOrdenadas.txt"))) {

			// Leer todas las líneas del archivo y almacenarlas en un array
			String[] lineas = new String[0]; 
			int contador = 0; 
			String linea;
			
			while ((linea = in.readLine()) != null) {
				
				if (contador == lineas.length) {
					lineas = Arrays.copyOf(lineas, lineas.length + 1);
				}
				
				lineas[contador++] = linea.toLowerCase();
				
			}

			// Ordenar las líneas alfabéticamente
			Arrays.sort(lineas, 0, contador);

			// Escribir las líneas ordenadas en el archivo de salida
			for (int i = 0; i < contador; i++) {
				out.write(lineas[i]);
				out.newLine();
			}

			System.out.println("Se han ordenado las líneas alfabéticamente correctamente.");

		} catch (IOException ex) {
			
			System.out.println(ex.getMessage());
			
		}
		
	}

}
