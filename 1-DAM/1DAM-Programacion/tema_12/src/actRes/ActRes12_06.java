package actRes;

import java.util.ArrayList;
import java.util.Collection;

public class ActRes12_06 {

    public static void main(String[] args) {

        Collection<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            lista.add((int) (Math.random() * 10 + 1));
        }

        System.out.println("Con elemento 5: " + lista);

        boolean eliminado = lista.remove(5);

        while (eliminado) {
            eliminado = lista.remove(5);
        }

        System.out.println("Sin elemento 5: " + lista);

    }

}
