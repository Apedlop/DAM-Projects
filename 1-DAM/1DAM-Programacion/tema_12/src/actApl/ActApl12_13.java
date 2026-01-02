package actApl;

import java.util.Comparator;

public class ActApl12_13 {

    public static void main(String[] args) {

        Contenedor<Integer> c = new Contenedor<>(new Integer[0]);

        // Lista sin ordenar
        for (int i = 0; i < 30; i++) {
            c.insertarAlFinal((int) (Math.random() * 10 + 1));
        }

        System.out.println("Lista sin ordenar: " + c);

        // Comparador para ordenar de mayor a menor
        Comparator<Integer> ordenar = new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        };

        // Ordenar la lista
        c.ordenarMayorMenor(ordenar);

        // Mostrar la lista ordenada
        System.out.println("Lista ordenada de mayor a menor: " + c);
    }
}
