package actRes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class ActRes12_04 {

    public static void main(String[] args) {

        Collection<Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Introducir entero: ");
        Integer n = sc.nextInt();

        while (n >= 0) {
            numeros.add(n);
            System.out.println("Introducir entero: ");
            n = sc.nextInt();
        }

        System.out.println("Lista completa: " + numeros);
        System.out.print("Pares: ");

        for (Integer a : numeros) {
            if (a % 2 == 0) {
                System.out.print(a + " ");
            }
        }

        System.out.println(" ");
        System.out.print("Múltiplos de 3: [");

        for (Iterator<Integer> it = numeros.iterator(); it.hasNext(); ) {
            n = it.next();
            if (n % 3 == 0) {
                System.out.print(n + ", ");
            }
        }
        System.out.println("]");
        System.out.println(" ");

        for (Iterator<Integer> it = numeros.iterator(); it.hasNext(); ) {
            n = it.next();
            if (n % 3 == 0) {
                it.remove();
            }
        }

        System.out.println("No múltiplos de 3: " + numeros);

    }

}
