package actRes;

import java.util.Scanner;

public class ActRes12_03 {

    public static void main(String[] args) {
        ActRes12_03_Pila<Integer> p = new ActRes12_03_Contenedor<>(new Integer[0]);
        Scanner sc = new Scanner(System.in);
        System.out.print("Introducir entero positivo (-1 para terminar): ");
        Integer n = sc.nextInt();

        while (n != -1) {
            p.apilar(n);
            System.out.println("Introducir entero positivo (-1 para terminar): ");
            n = sc.nextInt();
        }

        System.out.print("Desapilamos: ");
        p.desapilar();

        while (n != null) {
            System.out.print(n + " ");
            n = p.desapilar();
        }

        System.out.println("");
    }

}
