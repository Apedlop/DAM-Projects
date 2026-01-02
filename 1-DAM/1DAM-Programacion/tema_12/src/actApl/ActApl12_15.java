package actApl;

import java.util.*;

public class ActApl12_15<T> {

    static <T> List<T> eliminarRepetidos(List<T> lista) {
        // Se crea un nuevo HashSet a partir de la lista para eliminar repeticiones
        Set<T> conjunto = new HashSet<>(lista);
        // Convertimos el conjunto nuevamente en una lista para que sea compatible con List
        List<T> listaSinRepeticiones = new ArrayList<>(conjunto);
        return listaSinRepeticiones;
    }

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            lista.add((int) (Math.random() * 10) + 1);
        }

        System.out.println("Lista original: " + lista);

        List<Integer> listaSinRepeticiones = eliminarRepetidos(lista);
        System.out.println("Lista sin repeticiones: " + listaSinRepeticiones);
    }
}
