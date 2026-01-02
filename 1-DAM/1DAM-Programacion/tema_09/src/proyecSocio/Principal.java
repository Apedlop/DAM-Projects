package proyecSocio;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int opcion = 0;
		
		ConjSocio cJ = new ConjSocio(5);

		while (opcion < 8) {
			
			System.out.println("\nMenú de opciones:");
			System.out.println("1. Alta de socio");
			System.out.println("2. Eliminación de socio");
			System.out.println("3. Consultar número de socios existentes");
			System.out.println("4. Consultar los datos de un socio en concreto");
			System.out.println("5. Modificar la fecha de nacimiento de un socio");
			System.out.println("6. Listado de socios ordenado por ID");
			System.out.println("7. Listado de socios ordenado por edad y nombre");
			System.out.println("8. Salir");
			System.out.print("Seleccione una opción: ");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				Integer id = (int) (Math.random() * 100 + 1);
				System.out.println("ID: " + id);

				System.out.print("Nombre: ");
				String nombre = sc.nextLine();

				System.out.print("Fecha de nacimiento (con el formato dd/mm/yyyy): ");
				String fechaNac = sc.nextLine();

				System.out.println("");

				cJ.altaSocio(id, nombre, fechaNac);
				break;

			case 2:
				System.out.print("Ingrese el ID del socio: ");
				Integer id2 = sc.nextInt();

				System.out.println("");

				cJ.eliminarSocio(id2);
				break;

			case 3:
				cJ.consultarNumeroSocios();
				break;

			case 4:
				System.out.print("Introduzca el ID del socio: ");
				Integer id3 = sc.nextInt();

				System.out.println("");

				cJ.consultarDatosSocio(id3);
				break;

			case 5:
				System.out.print("Introduzca el ID del socio: ");
				Integer id4 = sc.nextInt();

				System.out.print("Introduzca la nueva fecha (con el formato dd/mm/yyyy): ");
				sc.nextLine(); // Limpiar el buffer del scanner
				String nuevaFecha = sc.nextLine();

				System.out.println("");

				cJ.modificarFechaNacimiento(id4, nuevaFecha);
				break;

			case 6:
				cJ.listarSociosOrdenadoPorID();
				break;

			case 7:
				cJ.listarSociosOrdenadoPorEdadYNombre();
				break;

			case 8:
				System.out.println("¡Hasta luego!");
				break;

			default:
				System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
				break;
			}
			
		}
		
	}
	
}