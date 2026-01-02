package actApl3;

import java.util.Scanner;

public class ActApl3_12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int exp = 0, decimal = 0, binario;
        int base = 1;

        System.out.println("Introduce un número binario: ");
        binario = sc.nextInt();

        while (binario != 0) {
            int unidBinaria = binario % 2;
            binario /= 10;
            decimal += base * unidBinaria;
            base *= 2;
        }

        System.out.println(decimal);

    }

}
