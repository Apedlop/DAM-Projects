package actProp9_04;

import java.time.LocalDate;
import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Socio[] socios = { new Socio(1, "Ben", LocalDate.of(1990, 5, 15)),
						   new Socio(2, "Ana María", LocalDate.of(1985, 8, 25)), 
						   new Socio(3, "Carlos", LocalDate.of(1987, 12, 10)) };

		// Ordenar la tabla de socios por orden alfabético de nombres
		Arrays.sort(socios, (socio1, socio2) -> socio1.nombre.compareTo(socio2.nombre));

		// Mostrar la tabla ordenada por pantalla
		for (int i = 0; i < socios.length; i++) {
		    System.out.println(socios[i]);
		}
		
	}

}
