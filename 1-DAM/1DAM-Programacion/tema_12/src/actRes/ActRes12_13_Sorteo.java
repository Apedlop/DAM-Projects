package actRes;

import java.util.*;

public class ActRes12_13_Sorteo<T extends Comparable<T>> {

    private final Set<T> elementos;

    public ActRes12_13_Sorteo() {
        elementos = new TreeSet<>();
    }

    boolean add(T nuevo) {
        return elementos.add(nuevo);
    }

    Set<T> premiados(int numPremiados) {
        Set<T> premiados = null;
        List<T> temp = new ArrayList<>(elementos);
        Collections.shuffle(temp); // Desordenamos los elementos
        if (numPremiados <= elementos.size()) {
            premiados = new TreeSet<>(); // Hacemos que premiados se ordene. Sigue vacía
            for (int i = 0; i < numPremiados; i++) { // Los primeros números, que serán los que especifique numPremiados, serán los premiados
                premiados.add(temp.get(i)); // Rellenamos la lista con los números premiados
            }
        }
        return premiados;
    }

    @Override
    public String toString() {
        return "Sorteo {elemetos = " + elementos + "}";
    }

}
