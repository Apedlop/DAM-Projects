package actApl9_23;

import java.time.LocalDate;
import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Socio socio1 = new Socio(1, "Juan", LocalDate.of(1990, 5, 15));
        Socio socio2 = new Socio(2, "María", LocalDate.of(1985, 10, 20));
        Socio socio3 = new Socio(3, "Carlos", LocalDate.of(2000, 3, 8));

        Socio[] socios = {socio1, socio2, socio3};

        System.out.println("Lista de socios antes de ordenar de forma inversa:");
        for (Socio socio : socios) {
            System.out.println(socio);
        }

        Arrays.sort(socios, new ComparadorNombreInverso());

        System.out.println("\nLista de socios después de ordenar de forma inversa:");
        for (Socio socio : socios) {
            System.out.println(socio);
        }
		
	}

}
