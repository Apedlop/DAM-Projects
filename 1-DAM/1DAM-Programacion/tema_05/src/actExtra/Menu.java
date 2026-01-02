package actExtra;

import java.util.Scanner;

public class Menu {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vector[] = new int[10];
		int indicador = 0, opcion;

		do {

			System.out.println("\n1. Insertar");
			System.out.println("2. Eliminar");
			System.out.println("3. Modificar");
			System.out.println("4. Listar");
			System.out.println("5. Ordenar");
			System.out.println("6. Buscar");
			System.out.println("7. Salir");

			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				indicador = insertar(vector, indicador);
				listar(vector, indicador);
				break;
			case 2:
				indicador = eliminar(vector, indicador);
				listar(vector, indicador);
				break;
			case 3:
				modificar(vector, indicador);
				listar(vector, indicador);
				break;
			case 4:
				listar(vector, indicador);
				break;
			case 5:
				ordenar(vector, indicador);
				listar(vector, indicador);
				break;
			case 6:
				buscar(vector, indicador);
				listar(vector, indicador);
				break;

			}

		} while (opcion < 7);

	}

	static int insertar(int[] vector, int indicador) {

		System.out.println("1) Al principio");
		System.out.println("2) Al final");
		System.out.println("3) En una posición concreta");
		int posicion = sc.nextInt();

		switch (posicion) {
		case 1:
			indicador = inserPrinc(vector, indicador);
			break;

		case 2:
			indicador = inserFinal(vector, indicador);
			break;

		case 3:
			indicador = inserPosicionConcreta(vector, indicador);
			break;
		}
		return indicador;
	}

	static int inserPrinc(int[] vector, int indicador) {

		if (indicador == vector.length) {
			System.out.println("No caben más elementos.");
		} else {
			System.out.println("Introduce un dato: ");
			int num = sc.nextInt();
			for (int i = indicador; i > 0; i--) {
				vector[i] = vector[i - 1];
			}
			vector[0] = num;
			indicador++;
		}

		return indicador;
	}

	static int inserFinal(int[] vector, int indicador) {

		if (indicador == vector.length) {
			System.out.println("No caben más elementos.");
		} else {
			System.out.println("Introduce un dato: ");
			int num = sc.nextInt();
			for (int i = indicador; i > 0; i--) {
				vector[i] = vector[i - 1];
			}
			vector[indicador] = num;
			indicador++;
		}

		return indicador;

	}

	static int inserPosicionConcreta(int[] vector, int indicador) {

		if (indicador == vector.length) {
			System.out.println("No caben más elementos.");
		} else {
			System.out.println("Introduce una posición: ");
			int posicion = sc.nextInt();

			if (posicion > indicador) {
				System.out.println("Posición no válida.");
			} else {
				System.out.println("Introduce un dato: ");
				int num = sc.nextInt();
				for (int i = indicador; i > posicion; i--) {
					vector[i] = vector[i - 1];
				}
				vector[posicion] = num;
				indicador++;
			}

		}

		return indicador;

	}

	static int eliminar(int[] vector, int indicador) {

		System.out.println("1) Al principio");
		System.out.println("2) Al final");
		System.out.println("3) En una posición concreta");
		int posicion = sc.nextInt();

		switch (posicion) {
		case 1:
			indicador = elimPrin(vector, indicador);
			break;

		case 2:
			indicador = elimFinal(vector, indicador);
			break;

		case 3:
			indicador = elimPosicionConcreta(vector, indicador);
			break;
		}
		return indicador;
	}

	static int elimPrin(int[] vector, int indicador) {

		if (indicador < 0) {
			System.out.println("No se puede eliminar ningún dato.");
		} else {
			for (int i = 0; i < indicador; i++) {
				vector[i] = vector[i + 1];
			}

			indicador--;
		}

		return indicador;
	}

	static int elimFinal(int[] vector, int indicador) {

		if (indicador == 0) {
			System.out.println("No hay elementos en la tabla.");
		} else {
			for (int i = indicador; i < 0; i--) {
				vector[i] = vector[i + 1];
			}
			indicador--;
		}

		return indicador;
	}

	static int elimPosicionConcreta(int[] vector, int indicador) {

		if (indicador == 0) {
			System.out.println("No hay número.");
		} else {
			System.out.println("Introduce una posición: ");
			int posicion = sc.nextInt();

			if (posicion > indicador) {
				System.out.println("Posición no válida.");
			} else {
				for (int i = posicion; i < indicador; i++) {
					vector[i] = vector[i + 1];
				}
				indicador--;
			}
		}

		return indicador;
	}

	static void modificar(int[] vector, int indicador) {

		if (indicador == 0) {
			System.out.println("No hay valores.");
		} else {
			System.out.println("Introduce una posición: ");
			int posicion = sc.nextInt();
			if (posicion > indicador) {
				System.out.println("No se puede modificar ningún dato.");
			} else {
				System.out.println("Introduce un dato: ");
				int num = sc.nextInt();
				vector[posicion] = num;
			}
		}

	}

	static void listar(int[] vector, int indicador) {

		for (int i = 0; i < indicador; i++) {
			System.out.print(vector[i] + " ");
		}

	}

	static void ordenar(int[] vector, int indicador) {

		for (int i = 0; i < indicador - 1; i++) {
			for (int j = 0; j < (indicador- 1 - i); j++) {
				if (vector[j] > vector[j + 1]) {
					int aux = vector[j];
					vector[j] = vector[j + 1];
					vector[j + 1] = aux;
				}
			}
		}
	}

	static void buscar(int[] vector, int indicador) {

		System.out.println("1) Buscar valor");
		System.out.println("2) Buscar posición");
		int num = sc.nextInt();
		
		switch (num) {
		case 1: 
			buscarValor(vector, indicador);
			break;
			
		case 2:
			buscarPosicion(vector, indicador);
			break;
		}
		
	}
	static void buscarValor(int[] vector, int indicador) {
		
		System.out.println("1) Si la tabla está ordenada");
		System.out.println("2) Si la tabla está desordenada");
		int opcion = sc.nextInt();
		
		switch (opcion) {
		case 1:
			ordenada(vector);
			break;
			
		case 2:
			desordenada(vector);
			break;
		}
		
	}
	
	static void ordenada(int[] vector) {
		
		//Búsqueda secuencial 
		
		boolean encontrado = false;
		int i = 0;
		
		System.out.println("¿Qué número quieres buscar?");
		int num = sc.nextInt();
		
		while ((i < 100) && !encontrado) {
			if (vector[i++] == num) {
				encontrado = true;
			}
		}
		if (encontrado) {
			System.out.println("Sí hay algún valor " + num + " en la tabla");
		} else {
			System.out.println("No hay ningún valor " + num + " en la tabla");
		}
		
	}
	
	static void desordenada(int[] vector) {
		
		//Búsqueda binaria
		
		System.out.println("¿Qué número buscas?");
		int num = sc.nextInt();
		
		int result = -1, limInf = 0, limSup = vector.length - 1, indice;
		
		while (limInf <= limSup && result == -1) {
			indice = (limInf + limSup) / 2;
			
			if (vector[indice] == num) {
				System.out.println("Sí hay algún valor " + num + " en la tabla");
				result = indice;
			} else if (num > vector[indice]) {
				limInf = indice + 1;
			} else if (num < vector[indice]) {
				limSup = indice;
			} else {
				System.out.println("No hay ningún valor " + num + " en la tabla");
			}
		}
		
	}
	
	static void buscarPosicion(int[] vector, int indicador) {
		
	
	}

}
