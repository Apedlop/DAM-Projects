package actApl3;

import java.util.Scanner;

public class ActApl3_18 {

    public static void main(String[] args) {

        int mcm = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número:");
        int a = sc.nextInt();

        System.out.println("Introduce otro número:");
        int b = sc.nextInt();

        for (int i = 2; i < a + b; i++) {
            while (a % i == 0 || b % i == 0) {
                mcm *= i;
                if (a % i == 0 && b % i == 0) {
                    a /= i;
                    b /= i;
                } else if (b % i == 0) {
                    b /= i;
                } else {
                    a /= i;
                }

                if (a == 0 || b == 0) {
                    break;
                }
            }
        }

        System.out.println("El MCD es: " + mcm);

    }

}
