package Recursividad;

import java.util.Scanner;

public class Ejercicio4 {

    static void secuenciaNumerica(int n, int i) {
        if (0 == i) {
            System.out.println("");
        } else {
            System.out.print(i + " ");
            i--;
            secuenciaNumerica(n, i);
        }
    }

    public static void main(String[] args) {

        System.out.println("Introduce un número: ");
        int n = new Scanner(System.in).nextInt();

        secuenciaNumerica(n, n);

    }

}
