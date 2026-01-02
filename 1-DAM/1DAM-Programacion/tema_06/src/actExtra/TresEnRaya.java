package actExtra;

import java.util.Scanner;

public class TresEnRaya {

	static Scanner sc = new Scanner(System.in);

	static void imprimirTablero(char[][] tablero) {

		System.out.println("");

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				System.out.print(tablero[i][j]);

				if (j < 2) {
					System.out.print(" | ");
				}

			}

			System.out.println();

			if (i < 2) {
				System.out.println("---------");
			}

		}

		System.out.println("");

	}

	static boolean hayGanador(char[][] tablero, char jugador) {

		for (int i = 0; i < 3; i++) {

			if ((tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador)
					|| (tablero[0][i] == jugador && tablero[1][i] == jugador && tablero[2][i] == jugador)) {
				return true; // Devolver true si hay una línea completa en una fila o columna
			}

		}

		// Verifica diagonales
		if ((tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador)
				|| (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador)) {
			return true; // Devolver true si hay una línea completa en una diagonal
		}

		// No hay ganador
		return false;

	}

	static boolean tableroLleno(char[][] tablero) {

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				if (tablero[i][j] == ' ') {
					return false;
				}

			}

		}

		return true;

	}

	static void juegaO(char[][] tablero) {

		int fila, columna;

		do {

			fila = (int) (Math.random() * 3);
			columna = (int) (Math.random() * 3);

		} while (tablero[fila][columna] != ' ');

		tablero[fila][columna] = 'O';

	}

	public static void main(String[] args) {

		char[][] tablero = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };

		imprimirTablero(tablero);

		char jugadorActual = 'X';
		int fila = 0, columna = 0;

		while (!hayGanador(tablero, jugadorActual) && !tableroLleno(tablero)) {

			if (jugadorActual == 'X') {

				do {
					
					System.out.println("Jugador " + jugadorActual + " introduzca la fila (0-2): ");
					fila = sc.nextInt();

					System.out.println("Jugador " + jugadorActual + " introduzca la columna (0-2): ");
					columna = sc.nextInt();

					// Validar que los valores estén en el rango permitido
					if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3) {

						if (tablero[fila][columna] == ' ') {

							tablero[fila][columna] = jugadorActual;
							imprimirTablero(tablero);

							if (hayGanador(tablero, jugadorActual)) {
								System.out.println("¡El jugador " + jugadorActual + " ha ganado!");
								break;
							}

						} else {

							System.out.println("Casilla ocupada. Inténtalo de nuevo.");

						}

					}

					System.out.println("Introduce un valor válido.");

				} while (fila > 2 && columna > 2);

			} else if (!hayGanador(tablero, jugadorActual)) {

				// Turno de la máquina (jugador 'O')
				System.out.println("Turno de la máquina (O):");
				
				juegaO(tablero);
				imprimirTablero(tablero);

			} else if (hayGanador(tablero, jugadorActual)) {
				
				System.out.println("¡La máquina (O) ha ganado!");
				break;
				
			}

			jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
			
		}

		if (!hayGanador(tablero, jugadorActual)) {
			System.out.println("¡El juego ha terminado en empate!");
		}

		System.out.println("¡Fin del juego!");

	}

}
