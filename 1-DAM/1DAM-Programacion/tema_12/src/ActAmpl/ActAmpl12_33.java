package ActAmpl;

import java.util.Collections;
import java.util.Comparator;

public class ActAmpl12_33 {

    public static void main(String[] args) {

        ListaOrdenada<Integer> lista = new ListaOrdenada<>();

        for (int i = 0; i < 20; i++) {
            lista.insertar((int) (Math.random() * 10 + 1));
        }

        System.out.println("Order natural: " + lista);

        // Comparador en reversa
        Collections.sort(lista.getListaOrdenada(), new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // Reverse order comparison
                return o2.compareTo(o1);
            }
        });

        System.out.println("Custom Order: " + lista);

    }

}
