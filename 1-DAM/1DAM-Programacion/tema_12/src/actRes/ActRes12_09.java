package actRes;

import java.util.*;

public class ActRes12_09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();

        System.out.println("Introducir número: ");
        Integer n = sc.nextInt();

        // Introducimos dentro de la lista los números
        while (n >= 0) {

            lista.add(n);
            System.out.println("Introducir número: ");
            n = sc.nextInt();

        }

        System.out.println("Lista original: " + lista);

        // Índices de valores pares
        System.out.print("Índices de valores pares: ");
        for (int i = 0; i < lista.size(); i++) {

            if (lista.get(i) % 2 == 0) {
                System.out.print(i + " ");
                lista.set(i, lista.get(i) * 100); // Introducimos en la posición i los elementos que obtenemos de i y lo multimplicamos
            }

        }

        System.out.println("\nLista multiplicada: " + lista);

    }

}
