package actProp;

import java.util.*;

public class ActProp12_02 {

    public static void main(String[] args) {
        ActProp12_02_Contenedor<Integer> cola = new ActProp12_02_Contenedor<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce números enteros positivos (introduce -1 para terminar):");

        int numero = scanner.nextInt();
        while (numero != -1) {
            cola.encolar(numero);
            numero = scanner.nextInt();
        }

        System.out.print("Desencolando y mostrando los números:");
        while (!cola.estaVacia()) {
            System.out.print(cola.desencolar() + " ");
        }
    }

}
