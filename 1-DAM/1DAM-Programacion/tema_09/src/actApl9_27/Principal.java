package actApl9_27;

import java.time.LocalDate;
import java.util.Comparator;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lista lista = new Lista();
        Socio socio1 = new Socio(1, "Juan", LocalDate.of(1990, 5, 15));
        Socio socio2 = new Socio(2, "María", LocalDate.of(1985, 10, 20));
        Socio socio3 = new Socio(3, "Carlos", LocalDate.of(2000, 3, 8));

        // Insertar socios en la lista
        lista.insertarFinal(socio1);
        lista.insertarFinal(socio2);
        lista.insertarFinal(socio3);

        // Mostrar lista antes de ordenar
        System.out.println("Lista de socios antes de ordenar por fecha de nacimiento:");
        System.out.println(lista);

        // Ordenar la lista por fecha de nacimiento
        lista.ordenar();
        System.out.println("Lista de socios ordenada por fecha de nacimiento:");
        System.out.println(lista);

        // Definir el comparador para ordenar por nombre
        Comparator comparadorNombres = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Socio) o1).nombre.compareTo(((Socio) o2).nombre);
            }
        };

        // Ordenar la lista por nombre
        lista.ordenar(comparadorNombres);
        System.out.println("Lista de socios ordenada por nombre:");
        System.out.println(lista);
		
	}

}
