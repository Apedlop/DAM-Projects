package actApl;

import java.util.Comparator;

public class ActApl12_12 {

    public static void main(String[] args) {

        Contenedor<Integer> c = new Contenedor<>(new Integer[0]);

        for (int i = 0; i < 20; i++) {
            c.insertarAlFinal((int) (Math.random() * 10 + 1));
        }

        System.out.println("Lista sin ordenar: " + c);

        // Comparador para ordenar según el criterio de c
        Comparator<Integer> comparador = Comparator.naturalOrder();
        c.ordenar(comparador);

        System.out.println("Lista ordenada: " + c);

    }

}
