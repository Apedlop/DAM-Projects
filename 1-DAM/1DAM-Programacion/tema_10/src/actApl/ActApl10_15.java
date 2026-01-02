package actApl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ActApl10_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int menor = 0;
		int mayor = 0;

		try (BufferedReader in = new BufferedReader(new FileReader("Numeros.txt"))) {
			
			String linea;
			
			while ((linea = in.readLine()) != null) {
				
				int numero = Integer.parseInt(linea);

				if (numero < menor) {
					menor = numero;
				}
				
				if (numero > mayor) {
					mayor = numero;
				}

			}
			
			System.out.println("Menor número: " + menor);
			System.out.println("Mayor número: " + mayor);

		} catch (IOException ex) {

			System.out.println(ex.getMessage());

		}

	}

}
