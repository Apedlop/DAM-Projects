package actApl;

import java.util.Scanner;

public class ActApl12_14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Contenedor<Integer> c = new Contenedor<>(new Integer[0]);

        // Lista sin ordenar
        for (int i = 0; i < 30; i++) {
            c.insertarAlFinal((int) (Math.random() * 10 + 1));
        }

        System.out.println("Lista: " + c);

        System.out.println("Introduce la pocisión del número que busca:");
        int num = sc.nextInt();

        System.out.println("En la posición " + num + " se encuentra en el número " + c.get(num));

    }

}
