package actApl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ActApl10_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		try (BufferedReader in = new BufferedReader(new FileReader("moreLinux.txt"))) {
			
			String linea;
			int contadorLineas = 0;
			int contadorPaginas = 1;

			while ((linea = in.readLine()) != null) {
				
				System.out.println(linea);
				contadorLineas++;

				if (contadorLineas == 24) {
					System.out.println("\nPágina " + contadorPaginas + " - Presione Enter para continuar...");
					scanner.nextLine();
					contadorLineas = 0;
					contadorPaginas++;
				}
				
			}

			if (contadorLineas > 0) {
				System.out.println("\nFin del archivo - Presione Enter para salir...");
				scanner.nextLine();
			}
			
		} catch (IOException ex) {
			
			System.out.println("Error al leer el archivo: " + ex.getMessage());

		}

	}

}
