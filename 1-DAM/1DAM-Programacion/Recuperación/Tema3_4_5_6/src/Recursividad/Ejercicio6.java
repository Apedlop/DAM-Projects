package Recursividad;

public class Ejercicio6 {

    public static void mostrarContenido(int[] v, int i) {

        if (i == v.length) {
            System.out.println("");
        } else {
            System.out.print(v[i] + " ");
            i++;
            mostrarContenido(v, i);
        }

    }

    public static void main(String[] args) {

        int[] v = {2, 6, 4, 8};

        mostrarContenido(v, 0);

    }

}
