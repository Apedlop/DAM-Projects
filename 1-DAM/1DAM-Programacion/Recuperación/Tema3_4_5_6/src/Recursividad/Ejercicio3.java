package Recursividad;

import java.util.Scanner;

public class Ejercicio3 {

    static void multiplicar(int n1, int i) {
        int multiplicar = 0;
        if (i == 21) {
            System.out.println("");
        } else {
            multiplicar += n1 * i;
            System.out.println(n1 + " x " + i + " = " + multiplicar);
            i++;
            multiplicar(n1, i);
        }
    }

    public static void main(String[] args) {

        System.out.println("Introduce un número: ");
        int n1 = new Scanner(System.in).nextInt();

        multiplicar(n1, 1);

    }

}
