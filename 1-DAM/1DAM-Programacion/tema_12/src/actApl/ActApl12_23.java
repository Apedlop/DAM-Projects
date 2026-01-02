package actApl;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ActApl12_23 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<String> nombres = new TreeSet<>(); // Para que se ordenen en orden alfabético
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
