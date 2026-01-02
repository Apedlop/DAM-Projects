package actApl3;

import java.util.Scanner;

public class ActApl3_17 {

    public static void main(String[] args) {

        int mcd = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número:");
        int a = sc.nextInt();

        System.out.println("Introduce otro número:");
        int b = sc.nextInt();

        for (int i = 2; i < a; i++) {
            while (a % i == 0 && b % i == 0) {
                    mcd *= i;
                    a /= i;
                    b /= i;
            }
        }

        System.out.println("El MCD es: " + mcd);

    }

}
