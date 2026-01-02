package actApl3;

import java.util.Scanner;

public class ActApl3_11 {

    public static void main(String[] args) {

        int binario = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número:");
        int num = sc.nextInt();
        int copiaNum = num;

        while (num > 0) {
            binario = num % 2;
            num = num / 2;
            System.out.println(binario);
        }


    }

}
