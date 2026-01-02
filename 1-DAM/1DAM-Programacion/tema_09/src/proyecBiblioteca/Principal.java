package proyecBiblioteca;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Biblioteca b = new Biblioteca(10);

		int opcion;
		do {
			System.out.println("\nMenú de opciones:");
			System.out.println("1. Insertar un libro");
			System.out.println("2. Insertar una revista");
			System.out.println("3. Eliminar un libro por código");
			System.out.println("4. Consultar los datos de un libro por código");
			System.out.println("5. Listado de publicaciones ordenadas por código");
			System.out.println("6. Listado de libros prestados");
			System.out.println("7. Listado de libros no prestados");
			System.out.println("8. Listado de libros ordenados por autor");
			System.out.println("9. Consultar el número de publicaciones existentes");
			System.out.println("10. Salir");
			System.out.print("Seleccione una opción: ");
			opcion = scanner.nextInt();

			switch (opcion) {
			case 1:
				System.out.print("Código del libro: ");
				String codigoLibro = scanner.nextLine();
				System.out.print("Título del libro: ");
				String tituloLibro = scanner.nextLine();
				System.out.print("Año de publicación del libro: ");
				int añoLibro = scanner.nextInt();
				System.out.print("Autor del libro: ");
				String autorLibro = scanner.nextLine();
				b.insertarLibro(codigoLibro, tituloLibro, añoLibro, autorLibro);
				break;
			case 2:
				System.out.print("Código de la revista: ");
				String codigoRevista = scanner.nextLine();
				System.out.print("Título de la revista: ");
				String tituloRevista = scanner.nextLine();
				System.out.print("Año de publicación de la revista: ");
				int añoRevista = scanner.nextInt();
				System.out.print("Número de la revista: ");
				int numeroRevista = scanner.nextInt();
				b.insertarRevista(codigoRevista, tituloRevista, añoRevista, numeroRevista);
				break;
			case 3:
				System.out.print("Código del libro a eliminar: ");
				String codigoEliminar = scanner.nextLine();
				b.eliminarLibro(codigoEliminar);
				break;
			case 4:
				System.out.print("Código del libro a consultar: ");
				String codigoConsultar = scanner.nextLine();
				b.consultarDatosLibro(codigoConsultar);
				break;
			case 5:
				b.listarPublicacionesOrdenadasPorCodigo();
				break;
			case 6:
				System.out.println("Listado de libros prestados:");
				b.listarLibrosPrestados();
				break;
			case 7:
				System.out.println("Listado de libros no prestados:");
				b.listarLibrosNoPrestados();
				break;
			case 8:
				System.out.println("Listado de libros ordenados por autor:");
				b.listarLibrosOrdenadosPorAutor();
				break;
			case 9:
				System.out.println("Número de publicaciones existentes: " + b.consultarNumeroPublicaciones());
				break;
			case 10:
				System.out.println("¡Hasta luego!");
				break;
			default:
				System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
				break;
			}
		} while (opcion != 10);
	}

}
