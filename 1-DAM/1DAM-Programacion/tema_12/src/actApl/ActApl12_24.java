package actApl;

import java.util.Set;
import java.util.TreeSet;

public class ActApl12_24 {

    static <E> Set<E> unionListas (Set<E> lista1, Set<E> lista2) {
        Set<E> union = new TreeSet<>(lista1);
        union.addAll(lista2);
        return union;
    }

    public static void main(String[] args) {

        Set<Integer> lista1 = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            lista1.add((int) (Math.random() * 100));
        }
        System.out.println("Lista 1: " + lista1);

        Set<Integer> lista2 = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            lista2.add((int) (Math.random() * 100));
        }
        System.out.println("Lista 2: " + lista2);

        Set<Integer> union = unionListas(lista1, lista2);
        System.out.println("Listas unidas: " + union);

    }

}
