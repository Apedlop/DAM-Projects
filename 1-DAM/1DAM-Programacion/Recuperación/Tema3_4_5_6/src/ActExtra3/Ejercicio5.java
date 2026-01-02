package ActExtra3;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        System.out.println("Introduce un número :");
        int num = new Scanner(System.in).nextInt();

        for (int i = num; i < num + 5; i++) {
            boolean esPrimo = true;
            int j = 2;
            while (j < i && esPrimo) {
                if (i % j == 0) {
                    esPrimo = false;
                }
                j++;
            }
            System.out.print(i + " ---> ");
            if (esPrimo) {
                System.out.println("primo");
            } else {
                System.out.println("no primo");
            }
        }



    }

}
