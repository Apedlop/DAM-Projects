package actRes;

import java.util.*;

public class ActRes12_10 {

    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            lista.add((int) (Math.random() * 10) + 1);
        }

        // Ordenamos la lista para una mejor visualización de los elementos
        Comparator<Integer> c = Comparator.naturalOrder();
        lista.sort(c);
        System.out.println("Lista original: " + lista);

        // Lista sin repeticiones
        Set<Integer> sinRepeticiones = new TreeSet<>(); // Como ordena, por defecto, por orden natural y Set no permite repeticiones
        sinRepeticiones.addAll(lista);
        System.out.println("Lista sin repeticones: " + sinRepeticiones);

        // Lista con elementos que aparecen una sola vez en la lista original
        Set<Integer> repetidos = new TreeSet<>();
        for (Integer e : sinRepeticiones) { // Eliminamos de la lista original los números que NO están repetidos
            lista.remove(e);
        }
        repetidos.addAll(lista); // Insertamos en repetidos los elementos que nos han quedado en lista
        System.out.println("Repetidos: " + repetidos);

        // Lista de los números únicos
        Set<Integer> unicos = new TreeSet<>();
        unicos.addAll(sinRepeticiones); // Añadimos la lista que no tiene repeticiones
        unicos.removeAll(repetidos); // Eliminamos los números que han sido anteriormente repetidos
        System.out.println("Únicos: " + unicos);
    }

}
