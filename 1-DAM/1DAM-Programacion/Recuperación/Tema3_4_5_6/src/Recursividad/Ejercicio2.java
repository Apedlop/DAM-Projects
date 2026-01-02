package Recursividad;

import java.util.Scanner;

public class Ejercicio2 {

    static int multiplicacion(int n1, int n2) {
        if (n2 == 0) {
            return 0; // Caso base: cualquier número multiplicado por 0 es 0
        } else {
            return n1 + multiplicacion(n1, n2 - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Introduce un número: ");
        int n1 = new Scanner(System.in).nextInt();

        System.out.println("Introduce otro número: ");
        int n2 = new Scanner(System.in).nextInt();

        int resultado = multiplicacion(n1, n2);
        System.out.println("El resultado de " + n1 + " x " + n2 + " es: " + resultado);
    }
}
