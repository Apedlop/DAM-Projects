package Recursividad;

public class Ejercicio7 {

    public static void mostrarInverso(int[] v, int i) {

        if (i == 0) {
            System.out.println("");
        } else {
            System.out.print(v[i] + " ");
            i--;
            mostrarInverso(v, i);
        }

    }

    public static void main(String[] args) {

        int[] v = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        mostrarInverso(v, v.length - 1);

    }

}
