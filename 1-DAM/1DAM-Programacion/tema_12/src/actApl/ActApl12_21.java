package actApl;

import java.util.*;

public class ActApl12_21 {

    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>(); // Creamos un ArrayList

        for (int i = 0; i < 20; i++) {
            lista.add((int) (Math.random() * 100)); // Insertamos los números
        }

        // Lista ordenada de menor a mayor
        Collections.sort(lista);
        System.out.println("Lista ordenada: " + lista);

        // Lista ordenada de mayor a menor
        Collections.reverse(lista);
        System.out.println("Lista reversa: " + lista);

    }

}
