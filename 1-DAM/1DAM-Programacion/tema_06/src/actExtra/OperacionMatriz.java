package actExtra;

import java.util.Scanner;

public class OperacionMatriz {

	static Scanner sc = new Scanner(System.in);

	static void transpuesta(int[][] t, int f, int c, int[][] t2, int f2, int c2) {

		int[][] resultado = new int[c][f];

		for (int i = 0; i < f; i++) {

			for (int j = 0; j < c; j++) {

				resultado[j][i] = t[i][j];

			}

		}

		System.out.println("");

		int[][] resultado2 = new int[c2][f2];

		for (int i = 0; i < f2; i++) {

			for (int j = 0; j < c2; j++) {

				resultado2[j][i] = t2[i][j];

			}

		}

		System.out.println("");

		System.out.println("Matriz transpuesta 1: ");

		for (int i = 0; i < c; i++) {

			for (int j = 0; j < f; j++) {

				System.out.print(resultado[i][j] + " ");

			}

			System.out.println("");

		}

		System.out.println("Matriz transpuesta 2: ");

		for (int i = 0; i < c2; i++) {

			for (int j = 0; j < f2; j++) {

				System.out.print(resultado2[i][j] + " ");

			}

			System.out.println("");

		}

	}

	static void suma(int[][] t, int f, int c, int[][] t2) {

		int[][] resultado = new int[f][c];

		for (int i = 0; i < f; i++) {

			for (int j = 0; j < c; j++) {

				resultado[i][j] = t[i][j] + t2[i][j];

			}

		}

		System.out.println("");

		System.out.println("Suma matriz 1 y 2: ");

		for (int i = 0; i < f; i++) {

			for (int j = 0; j < c; j++) {

				System.out.print(resultado[i][j] + " ");

			}

			System.out.println("");

		}

	}

	static void resta(int[][] t, int f, int c, int[][] t2) {

		int[][] resultado = new int[f][c];

		for (int i = 0; i < f; i++) {

			for (int j = 0; j < c; j++) {

				resultado[i][j] = t[i][j] - t2[i][j];

			}

		}

		System.out.println("Resta matriz 1 y 2: ");

		for (int i = 0; i < f; i++) {

			for (int j = 0; j < c; j++) {

				System.out.print(resultado[i][j] + " ");

			}

			System.out.println("");

		}

	}
	//suma del escalar más la matriz 
	//escalar el producto

	static void producto(int[][] t, int f, int c, int[][] t2, int f2, int c2) {

		int[][] resultado = new int[f][c2];

		for (int i = 0; i < f; i++) {

			for (int j = 0; j < c; j++) {

				resultado[i][j] = t[i][j] - t2[i][j];

			}

		}
		
	}

	static void escalarProducto(int[][] t, int f, int c, int[][] t2, int f2, int c2) {

		System.out.println("\n¿Por cuánto quieres multiplicar la matriz 1?");
		int mult = sc.nextInt();
		
		System.out.println("¿Por cuánto quieres multiplicar la matriz 2?");
		int mult2 = sc.nextInt();
		
		int[][] resultado = new int[f][c];

		for (int i = 0; i < f; i++) {

			for (int j = 0; j < c; j++) {

				resultado[i][j] = mult * t[i][j];

			}

		}
		
		int[][] resultado2 = new int[f2][c2];

		for (int i = 0; i < f2; i++) {

			for (int j = 0; j < c2; j++) {

				resultado2[i][j] = mult2 * t2[i][j];

			}

		}
		
		System.out.println("");

		System.out.println("Producto escalar matriz 1: ");

		for (int i = 0; i < f; i++) {

			for (int j = 0; j < c; j++) {

				System.out.print(resultado[i][j] + " ");

			}

			System.out.println("");

		}

		System.out.println("Producto escalar matriz 2: ");

		for (int i = 0; i < f2; i++) {

			for (int j = 0; j < c2; j++) {

				System.out.print(resultado2[i][j] + " ");

			}

			System.out.println("");

		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int t[][];
		int t2[][];

		System.out.println("Introduce el numero de filas de la primera matriz: ");
		int filas = sc.nextInt();

		System.out.println("Introduce el número de columnas de la primera matriz: ");
		int columnas = sc.nextInt();

		t = new int[filas][columnas];

		for (int i = 0; i < filas; i++) {

			for (int j = 0; j < columnas; j++) {

				t[i][j] = (int) (Math.random() * 10);

			}

		}

		System.out.println("");

		System.out.println("Introduce el nímero de filas para la segunda matriz: ");
		int filas2 = sc.nextInt();

		System.out.println("Introduce el número de columnas de la primera matriz: ");
		int columnas2 = sc.nextInt();

		t2 = new int[filas2][columnas2];

		for (int i = 0; i < filas2; i++) {

			for (int j = 0; j < columnas2; j++) {

				t2[i][j] = (int) (Math.random() * 10);

			}

		}

		System.out.println("Matriz original 1: ");

		for (int i = 0; i < filas; i++) {

			for (int j = 0; j < columnas; j++) {

				System.out.print(t[i][j] + " ");

			}

			System.out.println();

		}

		System.out.println("\nMatriz original 2: ");

		for (int i = 0; i < filas2; i++) {

			for (int j = 0; j < columnas2; j++) {

				System.out.print(t2[i][j] + " ");

			}

			System.out.println();

		}

		transpuesta(t, filas, columnas, t2, filas2, columnas2);

		if (t.length < t2.length | t2.length < t.length) {
			System.out.println("No se pueden sumar las matrices.");
		} else {
			suma(t, filas, columnas, t2);
		}

		if (t.length < t2.length | t2.length < t.length) {
			System.out.println("\nNo se pueden restar las matrices.");
		} else {
			resta(t, filas, columnas, t2);
		}

		if (filas == columnas2 | t.length == t2.length) {
			producto(t, filas, columnas, t2, filas2, columnas2);
		} else {
			System.out.println("No se puede calcular el producto de las matrices.");
		}

	}

}
