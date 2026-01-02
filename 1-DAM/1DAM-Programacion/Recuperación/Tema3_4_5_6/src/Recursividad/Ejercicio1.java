package Recursividad;

import java.util.Scanner;

public class Ejercicio1 {

    static void esPrimo(int n, int i) {
        if (i == n) {
            boolean esPrimo = true;
            int j = 2;
            while (j < i && esPrimo) {
                if (i % j == 0) {
                    esPrimo = false;
                }
                j++;
            }
            if (esPrimo) {
                System.out.println(n + " es primo.");
            } else {
                System.out.println(n + " no es primo.");
            }
        } else {
            i++;
            esPrimo(n, i);
        }
    }

    public static void main(String[] args) {

        System.out.println("Introduce un número: ");
        int n = new Scanner(System.in).nextInt();
        esPrimo(n, 1);
    }

}
