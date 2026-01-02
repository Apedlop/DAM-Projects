package figuras;

import java.util.Scanner;

public class trianguloNum {

    public static void main(String[] args) {

        System.out.println("Introduce un número: ");
        int n = new Scanner(System.in).nextInt();

        for (int i = 1; i <= n; i++) {
            // Imprimir los espacios iniciales
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Imprimir los números crecientes
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Imprimir los números decrecientes
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            // Nueva línea después de cada fila
            System.out.println();
        }

    }

}
