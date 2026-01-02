package actApl;

import java.util.Scanner;

public class ActApl12_20 {

    public static void main(String[] args) {
        Supercola supercola = new Supercola();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Encolar en cola1");
            System.out.println("2. Encolar en cola2");
            System.out.println("3. Desencolar de cola1");
            System.out.println("4. Desencolar de cola2");
            System.out.println("5. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el elemento a encolar en cola1: ");
                    int elemento1 = scanner.nextInt();
                    supercola.encolarCola1(elemento1);
                    break;
                case 2:
                    System.out.print("Ingrese el elemento a encolar en cola2: ");
                    int elemento2 = scanner.nextInt();
                    supercola.encolarCola2(elemento2);
                    break;
                case 3:
                    System.out.println(supercola.desencolarCola1());
                    break;
                case 4:
                    System.out.println(supercola.desencolarCola2());
                    break;
            }
            System.out.println(supercola.desencolarCola1());
            System.out.println(supercola.desencolarCola2());
        } while (opcion != 5);
    }
}
