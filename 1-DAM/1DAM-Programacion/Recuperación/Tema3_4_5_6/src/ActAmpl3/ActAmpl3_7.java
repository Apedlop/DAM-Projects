package ActAmpl3;

import java.util.Scanner;

public class ActAmpl3_7 {

    public static void main(String[] args) {

        double num, suma = 0, media = 0;
        int contador = 0;
        int max, min;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        num = sc.nextDouble();

        // Inicializar max y min con el primer número introducido
        max = min = (int) num;

        while (num >= 0 && suma <= 1000) {
            suma += num;
            contador++;
            media = suma / contador;

            // Update max and min
            if (num > max) {
                max = (int) num;
            }
            if (num < min) {
                min = (int) num;
            }

            System.out.println("Introduce un número: ");
            num = sc.nextDouble();
        }

        System.out.println("La suma total de todos los números es: " + suma);
        System.out.println("La cantidad de números introducidos es: " + contador);
        System.out.println("La media total de todos los números es: " + media);
        System.out.println("El número máximo introducido es: " + max);
        System.out.println("El número mínimo introducido es: " + min);

    }

}
