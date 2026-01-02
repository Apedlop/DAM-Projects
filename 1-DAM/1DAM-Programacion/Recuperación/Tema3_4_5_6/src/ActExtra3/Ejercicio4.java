package ActExtra3;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        System.out.println("Introduce un número :");
        long num = new Scanner(System.in).nextLong();
        int pares = 0, impares = 0;

        while (num > 0) {
            int digito = (int) (num % 10);
            if (digito % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            num /= 10;
        }

        System.out.println("El número " + num + " contiene " + pares + " dígitos pares y " + impares + " dígitos impares.");

    }

}
