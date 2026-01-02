package actApl;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ActApl12_22 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<String> nombres = new LinkedHashSet<>(); // Para que se inserten uno detrás del otro
        System.out.println("Introduce un nombre: ");
        String nombre = sc.next();

        while (!nombre.equals("fin")) {

            nombres.add(nombre);

            System.out.println("Introduce un nombre: ");
            nombre = sc.next();

        }

        System.out.println("Nombres introducidos: " + nombres);

    }

}
