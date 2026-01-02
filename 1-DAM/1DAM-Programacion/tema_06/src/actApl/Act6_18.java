package actApl;

import java.util.Scanner;

public class Act6_18 {

	static String convertirCamel(String frase) {

		String resultado = "";
		boolean mayuscula = false;

		for (int i = 0; i < frase.length(); i++) {

			char caracter = frase.charAt(i);

			if (Character.isLetter(caracter)) {

				if (mayuscula) {
					resultado += Character.toUpperCase(caracter);
					mayuscula = false;
				} else {
					resultado += Character.toLowerCase(caracter);
				}

			} else {

				mayuscula = true;

			}

		}

		return resultado;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduce una frase: ");
		String frase = scanner.nextLine();

		String resultado = convertirCamel(frase);

		System.out.println("Resultado: " + resultado);

	}

}
