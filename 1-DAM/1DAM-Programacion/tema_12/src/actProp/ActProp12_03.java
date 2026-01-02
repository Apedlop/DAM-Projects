package actProp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ActProp12_03 {

    public static void main(String[] args) {

        // Con elemento
        Collection<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            lista.add((int) (Math.random() * 10 + 1));
        }

        System.out.println("Con elemento 5: " + lista);

        // Sin elemento
        Iterator<Integer> iterator = lista.iterator();

        while (iterator.hasNext()) {
            if (iterator.next() == 5) {
                iterator.remove();
            }
        }

        System.out.println("Sin elemento 5: " + lista);

    }

}
