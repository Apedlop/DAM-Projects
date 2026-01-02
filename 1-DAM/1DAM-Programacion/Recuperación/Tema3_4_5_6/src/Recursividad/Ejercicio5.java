package Recursividad;

import java.util.Scanner;

public class Ejercicio5 {

    static void secuenciaNumerica(int n, int i) {
        if (n + 1 == i) {
            System.out.println("");
        } else {
            System.out.print(i + " ");
            i++;
            secuenciaNumerica(n, i);
        }
    }

    public static void main(String[] args) {

        System.out.println("Introduce un número: ");
        int n = new Scanner(System.in).nextInt();

        secuenciaNumerica(n, 1);

    }


}
