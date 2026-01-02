package ActAmpl;

import java.util.ArrayList;
import java.util.List;

public class ActAmpl12_32 {

    static <E> List<E> clonarLista(List<E> lista) {
        List<E> clon = new ArrayList<>();
        clon.add((E)lista);
        return clon;
    }

    public static void main(String[] args) {

        List<Integer> original = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            original.add((int) (Math.random() * 10 + 1)) ;
        }

        System.out.println("Lista original: " + original);

        System.out.println("Lista clonada: " + clonarLista(original));

    }

}
