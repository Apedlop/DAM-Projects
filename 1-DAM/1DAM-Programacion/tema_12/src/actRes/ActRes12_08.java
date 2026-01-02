package actRes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class ActRes12_08 {

    public static void main(String[] args) {

        Collection<Integer> lista = new ArrayList<>(); // Creamos un ArrayList

        for (int i = 0; i < 20; i++) {
            lista.add((int) (Math.random() * 10 + 1)); // Insertamos los números
        }

        System.out.println("Tabla sin ordenar: " + lista);

        Integer[] tabla = lista.toArray(new Integer[0]); // Lo convertimos en una tabla normal (que no es una colección)
        Arrays.sort(tabla); // Ordenamos la tabla

        // Ordenamos de manera creciente, es decir, de menor a mayor
        Collection<Integer> listaCreciente = new ArrayList<>();

        listaCreciente.addAll(Arrays.asList(tabla));
        System.out.println("Tabla ordenada crecientemente: " + listaCreciente);

        // Ordenamos de manera decreciente, es decir, de mayor a menor
        Comparator<Integer> ordenDecreciente = new Comparator<Integer>() { // Primero comparamos para ver cuál es mayor que otro
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        };

        /* También se puede hacer:
        *
        * Comparator<Integer> ordenEnteros = Comparator.naturalOrden    // Para ordenar en orden natural
        * ordenDecreciente = ordenEnteros.reverse   // Para que la tabla ordenEnteros se ordene al revés
        *
        * */

        Arrays.sort(tabla, ordenDecreciente); // ordena la tabla en orden decreciente utilizando el Comparator ordenDecreciente.

        Collection<Integer> listaDecreciente = new ArrayList<>();
        listaDecreciente.addAll(Arrays.asList(tabla)); // Añadimos la tabla a una colección de tipo ArrayList

        System.out.println("Tabla ordenada decrecientemente: " + listaDecreciente);

    }

}
