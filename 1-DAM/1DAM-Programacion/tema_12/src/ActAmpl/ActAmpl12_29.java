package ActAmpl;

import java.util.Arrays;
import java.util.Scanner;

public class ActAmpl12_29 {

    public static void main(String[] args) {

        Contenedor<Integer> c = new Contenedor<>(new Integer[0]);

        for (int i = 0; i < 20; i++) {
            c.insertarAlFinal((int) (Math.random() * 10 + 1));
        }
        System.out.println("Lista original: " + c);
        System.out.println("Posición de 1: " + Arrays.toString(c.buscarTodos(1)));
        System.out.println("Tabla alterada: " + c.eliminarTodos(1));
        System.out.println("Tabla sin 1:" + c);

    }

}
