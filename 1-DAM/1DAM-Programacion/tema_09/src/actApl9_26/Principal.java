package actApl9_26;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Socio socio1 = new Socio(1, "Juan", LocalDate.of(1990, 5, 15));
        Socio socio2 = new Socio(2, "María", LocalDate.of(1985, 10, 20));
        Socio socio3 = new Socio(3, "Carlos", LocalDate.of(2000, 3, 8));

        Lista lista = new Lista();
        lista.insertarFinal(socio1);
        lista.insertarFinal(socio2);
        lista.insertarFinal(socio3);

        System.out.println("Lista de socios antes de ordenar por edad:");
        System.out.println(lista);

        // Ordenar con el orden natural (por edad)
        lista.ordenar();

        System.out.println("\nLista de socios después de ordenar por edad:");
        System.out.println(lista);
		
	}

}
