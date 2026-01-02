package actApl3;

import java.util.Scanner;

public class ActApl3_14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Intoduce un número:");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            boolean esPrimo = true;
            int j = 2;
            while (j < i && esPrimo) {
                if (i % j == 0) {
                    esPrimo = false;
                }
                j++;
            }
            if (esPrimo) {
                System.out.println(i + " --> primo");
            } else {
                System.out.println(i + " --> no primo");
            }
        }

    }

}
