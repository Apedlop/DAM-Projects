package actProp;

import java.util.*;
import java.io.*;

public class ActProp12_04 {

    public static void main(String[] args) {

        Collection<Integer> listaPar = new ArrayList<>();
        Collection<Integer> listaImpar = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int num = sc.nextInt();

        while (num != 0) {
            System.out.println("Introduce un número: ");
            num = sc.nextInt();
            if (num % 2 == 0) {
                listaPar.add(num);
            } else {
                listaImpar.add(num);
            }
        }

        System.out.println("Lista par: " + listaPar);
        System.out.println("Lista impar: " + listaImpar);

    }

}
