package actRes;

import java.util.ArrayList;
import java.util.Collection;

public class ActRes12_07 {

    public static void main(String[] args) {

        Collection<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            lista.add((int) (Math.random() * 10 + 1));
        }

        System.out.println("Con elemento 5 repetido:" + lista);

        Collection<Integer> c = new ArrayList<>(); // Creamos una nueva lista

        c.add(5); // Colección con un único elemento
        lista.removeAll(c); // Eliminamos de la lista todos los elementos iguales a la lista c

        System.out.println("Sin elemento 5 repetido: " + lista);

    }

}
