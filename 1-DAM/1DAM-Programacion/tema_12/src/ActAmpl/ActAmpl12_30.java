package ActAmpl;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ActAmpl12_30 {

    static <T> List<T> eliminarRepetidos(List<T> lista) {
        Set<T> sinRepetidos = new LinkedHashSet<>(lista);
        return new ArrayList<>(sinRepetidos);
    }

    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            lista.add((int) (Math.random() * 10 + 1));
        }
        System.out.println("Lista original: " + lista);

        List<Integer> listaSinRepetidos = eliminarRepetidos(lista);
        System.out.println("Lista sin elementos repetidos: " + listaSinRepetidos);


    }

}
