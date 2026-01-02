package figuras;

import java.util.Scanner;

public class Cuadrado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num = sc.nextInt();

        for (int fila = 0; fila < num; fila++) {
            for (int columna = 0; columna < num; columna++ ) {
                System.out.print("* ");
            }
            System.out.println();
        }



    }

}
