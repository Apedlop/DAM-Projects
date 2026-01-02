package figuras;

import java.util.Scanner;

public class TrianguloEspacios {

    public static void main(String[] args) {

        System.out.println("Introduce un número: ");
        int n = new Scanner(System.in).nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }

}
