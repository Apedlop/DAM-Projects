package figuras;

import java.util.Scanner;

public class RomboPorFuera {

    public static void main(String[] args) {

        int numBlancos = 0;

        System.out.print("Introduce el número de filas: ");
        int numFilas = new Scanner(System.in).nextInt();

        for (int i = numFilas; i > 0; i--) {

            // Asteriscos
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Blancos
            for (int j = 1; j <= numBlancos; j++) {
                System.out.print(" ");
            }

            // Asteriscos
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
            numBlancos += 2;
        }

        numBlancos -= 2;
        for (int i = 1; i <= numFilas; i++) {

            // Asteriscos
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Blancos
            for (int j = 1; j <= numBlancos; j++) {
                System.out.print(" ");
            }

            // Asteriscos
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
            numBlancos -= 2;
        }

    }

}
