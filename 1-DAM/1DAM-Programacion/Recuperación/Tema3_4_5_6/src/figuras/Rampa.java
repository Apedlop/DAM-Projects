package figuras;

import java.util.Scanner;

public class Rampa {

    public static void main(String[] args) {

        System.out.print("Introduce el número de filas: ");
        int numFilas = new Scanner(System.in).nextInt();

        int numBlancos = (numFilas * 2) - 2;

        for(int i=1; i<=numFilas ; i++){

            // Asteriscos
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            // Blancos
            for(int j=1;j<=numBlancos; j++){
                System.out.print(" ");
            }

            // Asteriscos
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            numBlancos -= 2;
            System.out.println();
        }
    }

}
