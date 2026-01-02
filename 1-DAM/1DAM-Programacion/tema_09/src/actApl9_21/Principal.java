package actApl9_21;

import java.time.LocalDate;
import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Socio socio1 = new Socio(1, "Juan", LocalDate.of(1990, 5, 15));
		Socio socio2 = new Socio(2, "María", LocalDate.of(1985, 10, 20));
		Socio socio3 = new Socio(3, "Carlos", LocalDate.of(2000, 3, 8));

		// Crear un arreglo de socios
		Socio[] socios = { socio1, socio2, socio3 };

		// Mostrar la lista de socios antes de ordenar
		System.out.println("Lista de socios antes de ordenar por fecha de nacimiento:");
		for (int i = 0; i < socios.length; i++) {
			System.out.println(socios[i]);
		}

		// Ordenar la lista de socios por fecha de nacimiento
		Arrays.sort(socios);

		// Mostrar la lista de socios después de ordenar
		System.out.println("\nLista de socios después de ordenar por fecha de nacimiento:");
		for (int i = 0; i < socios.length; i++) {
			System.out.println(socios[i]);
		}

	}

}
