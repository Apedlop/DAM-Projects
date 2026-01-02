package EjerciciosFinales;

import java.util.Arrays;
import java.util.Comparator;

public class Ejercicio2 {

    public static void main(String[] args) {

        Cartas[] c = new Cartas[52];
        int index = 0;
        for (int j = 0; j < Palos.values().length; j++) {
            for (int i = 1; i <= 13; i++) {
                c[index++] = new Cartas(i, Palos.values()[j]);
            }
        }

        // Barajar las cartas
        for (int i = 0; i < c.length; i++) {
            int randomIndex = (int) (Math.random() * c.length);
            Cartas temp = c[i];
            c[i] = c[randomIndex];
            c[randomIndex] = temp;
        }

        // Reparto de 5 cartas
        System.out.println("Repartiendo 5 cartas:");
        for (int i = 0; i < 5; i++) {
            Cartas carta = Cartas.devolverCarta();
            System.out.println(carta);
        }

        // Imprimir las cartas desordenadas
        System.out.println("Cartas desordenadas:");
        System.out.println(Arrays.toString(c));

        // Imprimir cartas ordenadas por palo
        System.out.println("\nCartas ordenadas por palo: ");
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));

        // Imprimir cartas ordenadas por número
        System.out.println("\nCartas ordenadas por número: ");
        Arrays.sort(c, new Comparator<Cartas>() {
            @Override
            public int compare(Cartas o1, Cartas o2) {
                return o1.numero - o2.numero;
            }
        });
        System.out.println(Arrays.toString(c));

        // Imprimir cartas odenadas por palo y número
        System.out.println("\nCartas ordenadas por palo y número: ");
        Arrays.sort(c, new Comparator<Cartas>() {
            @Override
            public int compare(Cartas o1, Cartas o2) {
                // Comparar por palo
                if (o1.getPalo() != o2.getPalo()) {
                    return o1.getPalo().compareTo(o2.getPalo());
                }
                // Si los palos son iguales, comparar por número
                return o1.getNumero() - o2.getNumero();

            }
        });
        System.out.println(Arrays.toString(c));
    }

}

class Cartas implements Comparable {
    int numero;
    Palos palo;

    public Cartas(int numero, Palos palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public Palos getPalo() {
        return palo;
    }

    @Override
    public String toString() {
        return numero + " " + palo;
    }

    public static Cartas devolverCarta() {
        int numero = (int) (Math.random() * 13) + 1; // Genera un número aleatorio entre 1 y 13
        Palos palo = Palos.values()[(int) (Math.random() * Palos.values().length)]; // Obtiene un palo aleatorio
        return new Cartas(numero, palo);
    }

    @Override
    public int compareTo(Object o) {
        return this.palo.compareTo(((Cartas) o).palo);
    }
}

enum Palos {
    ORO, BASTO, ESPADA, COPA;
}