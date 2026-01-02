package actProp9_03;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Socio socio1 = new Socio(1, "Juan", LocalDate.of(1990, 5, 15));
        Socio socio2 = new Socio(2, "María", LocalDate.of(1985, 8, 25));

        // Comparar los IDs de los socios utilizando la primera implementación
        int resultado1 = socio1.compareTo(socio2);

        // Comparar los IDs de los socios utilizando la segunda implementación
        int resultado2 = socio2.compareTo(socio1);

        // Mostrar los resultados de las comparaciones
        System.out.println("Resultado 1: " + resultado1);
        System.out.println("Resultado 2: " + resultado2);

        // Verificar si los resultados son iguales
        if (resultado1 == resultado2) {
            System.out.println("Ambas implementaciones producen el mismo resultado.");
        } else {
            System.out.println("Las implementaciones no producen el mismo resultado.");
        }
		
	}

}
