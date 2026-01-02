package ActAmpl;

import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ActAmpl12_34 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Contenedor<Integer> c = new Contenedor<>(new Integer[0]);
        Map<LocalDate, Registros> temperatura = new TreeMap<>();
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
