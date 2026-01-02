package actExtra;

import java.util.Scanner;

public class SopaDeLetras {

	static Scanner sc = new Scanner(System.in);

	static void imprimirTablero(char[][] sopaLetras) {

		System.out.println();

		for (int i = 0; i < sopaLetras.length; i++) {

			for (int j = 0; j < sopaLetras[0].length; j++) {

				System.out.print(sopaLetras[i][j] + " ");

			}

			System.out.println();

		}

		System.out.println("");

	}

	static void insertarPalabra(char[][] sopaLetras, String palabra) {

		int fila = (int) (Math.random() * sopaLetras.length);
		int columna = (int) (Math.random() * (sopaLetras[0].length - palabra.length() + 1));

		for (int i = 0; i < palabra.length(); i++) {
			sopaLetras[fila][columna + i] = palabra.charAt(i);
		}

	}

	static void rellenarEspacios(char[][] sopaLetras, String palabra) {

		for (int i = 0; i < sopaLetras.length; i++) {

			for (int j = 0; j < sopaLetras[0].length; j++) {

				if (sopaLetras[i][j] == 0) {
					sopaLetras[i][j] = (char) Math.floor(Math.random() * (122 - 97) + 97);
				}

			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[][] sopaLetras = new char[10][10];
		String palabra = null;

		for (int i = 1; i <= 4; i++) {

			System.out.println("Jugador 1, introduce la " + i + "º palabra.");
			palabra = sc.next().toLowerCase();

			if (palabra.length() < 10) {
				insertarPalabra(sopaLetras, palabra);
			} else {
				System.out.println("La palabra supera el rango de 10 letras.");
				i--;
			}

		}

		rellenarEspacios(sopaLetras, palabra);
		imprimirTablero(sopaLetras);

		int pista = 4;

		while (pista != 0) {

			System.out.println("Jugador 2, encuantra las palabras escondidas en la sopa de letras.");
			System.out.println("Pista, hay " + pista + " palabras.");
			System.out.println("Ingrese la palabra: ");
			String intento = sc.nextLine();

			if (intento.equalsIgnoreCase(palabra)) {
				pista--;
				System.out.println("Acertaste!");
			} else {
				System.out.println("Fallaste! Intentalo de nuevo");
			}

			imprimirTablero(sopaLetras);

		}
		
		System.out.println("¡Has ganado!");

	}

}
