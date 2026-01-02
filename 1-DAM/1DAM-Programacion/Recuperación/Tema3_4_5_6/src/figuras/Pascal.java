package figuras;

import java.util.Scanner;

public class Pascal {

    public static void main(String[] args) {

        System.out.println("Introduce un número: ");
        int num = new Scanner(System.in).nextInt();

        for (int n = 0; n <= num; n++) {
            for (int m = 0; m <= n; m++) {
                // Factorial de n
                double fN = 1;
                for (int j = 1; j <= n; j++) {
                    fN *= j;
                }

                // Factorial de m
                double fM = 1;
                for (int j = 1; j <= m; j++) {
                    fM *= j;
                }

                // Factorial de (n - m)
                double nM = 1;
                for (int j = 1; j <= (n - m); j++) {
                    nM *= j;
                    System.out.print("");
                }

                // Fórmula
                int e = (int) (fN / (fM * nM));
                System.out.print(e + " ");
            }
            System.out.println();
        }

    }

}
