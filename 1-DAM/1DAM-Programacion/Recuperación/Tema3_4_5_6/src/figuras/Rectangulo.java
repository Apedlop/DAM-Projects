package figuras;

import java.util.Scanner;

public class Rectangulo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num = sc.nextInt();

        for (int fila = 0; fila < num; fila++) {
            for (int columna = 0; columna < 2 * num; columna++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }

}
