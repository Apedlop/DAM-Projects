package actApl;

import java.io.BufferedReader;
//import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class ActApl10_13_2 {

	public static void main(String[] args) {
		
		// VARIABLES
		int[] numeros = new int[0];
		Integer n = 0;
		String linea;

		// abro dos lecturas
		try (BufferedReader lee1 = new BufferedReader(new FileReader("lista1.txt"));
			 BufferedReader lee2 = new BufferedReader(new FileReader("lista2.txt"))) {
			
			// lectura fichero 1
			linea = lee1.readLine();
			
			while (linea != null) {
				n = Integer.valueOf(linea);
				numeros = ampliaTabla(numeros, n);
				linea = lee1.readLine();

			}

			// lectura fichero 2
			linea = lee2.readLine();
			
			while (linea != null) {
				n = Integer.valueOf(linea);
				numeros = ampliaTabla(numeros, n);
				linea = lee2.readLine();

			}
			
			System.out.println("Tabla sin ordenar: " + Arrays.toString(numeros));
			Arrays.sort(numeros); // ordeno la tabla
			System.out.println("Tabla ordenada: " + Arrays.toString(numeros));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static int[] ampliaTabla(int[] tabla, int n) {
		
		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		tabla[tabla.length - 1] = n;
		
		return tabla;
		
	}
}
