package actApl9_15;

import java.util.Scanner;

public class Principal {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Supercola supercola = new Supercola();

		int opcion;
		
		do {
			
			System.out.println("\nMenú:");
			System.out.println("1. Encolar en cola1");
			System.out.println("2. Encolar en cola2");
			System.out.println("3. Desencolar de cola1");
			System.out.println("4. Desencolar de cola2");
			System.out.println("5. Salir");
			System.out.print("Ingrese su opción: ");
			opcion = sc.nextInt();

			switch (opcion) {
			
			case 1:
				System.out.print("Ingrese el elemento a encolar en cola1: ");
				int elementoCola1 = sc.nextInt();
				
				supercola.encolarCola1(elementoCola1);
				supercola.mostrarEstadoColas();
				
				break;
				
			case 2:
				System.out.print("Ingrese el elemento a encolar en cola2: ");
				int elementoCola2 = sc.nextInt();
				
				supercola.encolarCola2(elementoCola2);
				supercola.mostrarEstadoColas();
				
				break;
				
			case 3:
				Integer desencoladoCola1 = supercola.desencolarCola1();
				
				if (desencoladoCola1 != null) {
					System.out.println("Elemento desencolado de cola1: " + desencoladoCola1);
				} else {
					System.out.println("Cola1 vacía.");
				}
				
				supercola.mostrarEstadoColas();
				
				break;
				
			case 4:
				Integer desencoladoCola2 = supercola.desencolarCola2();
				
				if (desencoladoCola2 != null) {
					System.out.println("Elemento desencolado de cola2: " + desencoladoCola2);
				} else {
					System.out.println("Cola2 vacía.");
				}
				
				supercola.mostrarEstadoColas();
				
				break;
				
			case 5:
				System.out.println("Saliendo del programa...");
				
				break;
				
			default:
				System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
			}
			
		} while (opcion != 5);

	}

}
