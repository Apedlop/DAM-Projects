package actApl9_20;

import java.time.LocalDate;
import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Socio[] socios = { new Socio(1, "Juan", LocalDate.of(1990, 5, 15)),
				new Socio(2, "María", LocalDate.of(1985, 10, 20)), new Socio(3, "Carlos", LocalDate.of(2000, 3, 8)) };

		// Mostrar la lista de socios antes de ordenar
		System.out.println("Lista de socios antes de ordenar por edad:");
		for (int i = 0; i < socios.length; i++) {
			System.out.println(socios[i]);
		}

		// Ordenar la lista de socios por edad
		Arrays.sort(socios);

		// Mostrar la lista de socios después de ordenar
		System.out.println("\nLista de socios después de ordenar por edad:");
		for (int i = 0; i < socios.length; i++) {
			System.out.println(socios[i]);
		}

	}

}
