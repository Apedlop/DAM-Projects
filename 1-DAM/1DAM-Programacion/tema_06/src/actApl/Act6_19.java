package actApl;

import java.util.Scanner;

public class Act6_19 {

	static String reemplazarPalabra(String frase, String palabra, String reemplazo) {

		String resultado = "";
		
		String[] palabras = frase.split("\\s+");
		

		for (int i = 0; i < palabras.length; i++) {
			
			String palabra2 = palabras[i];

			if (palabra2.equals(palabra)) {
				resultado += reemplazo + " ";
			} else {
				resultado += palabra2 + " ";
			}
			
		}

		return resultado.strip();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una frase: ");
		String frase = sc.nextLine();

		System.out.println("Introduce la palabra que quieres cambiar: ");
		String palabra = sc.nextLine();

		System.out.println("Introduce la palabra de reemplazo:");
		String reemplazo = sc.nextLine();
		
		System.out.println("Resultado: " + reemplazarPalabra(frase, palabra, reemplazo));

	}

}
