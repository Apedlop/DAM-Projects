package actRes;

import java.util.ArrayList;
import java.util.Collection;

public class ActRes12_05 {

    public static void main(String[] args) {

        // Admite repetidos
        Collection<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            lista.add((int) (Math.random() * 10 + 1));
        }

        System.out.println("Repetidos: " + lista);

        // No admite repetidos
        Collection<Integer> listaSinRepetidos = new ArrayList<>();

        for (Integer e : lista) {
            if (!listaSinRepetidos.contains(e)) {
                listaSinRepetidos.add(e);
            }
        }

        System.out.println("Sin repetir: " + listaSinRepetidos);

    }

}
