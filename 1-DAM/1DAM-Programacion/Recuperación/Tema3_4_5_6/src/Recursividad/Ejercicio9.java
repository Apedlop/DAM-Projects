package Recursividad;

public class Ejercicio9 {

    public static void maxMin(int[] v, int i, int max, int min) {

        if (i == v.length) {
            System.out.println("Máximo: " + max);
            System.out.println("Mínimo: " + min);
        } else {
            if (v[i] > max) {
                max = v[i];
            }
            if (v[i] < min) {
                min = v[i];
            }
            i++;
            maxMin(v, i, max, min);
        }

    }

    public static void main(String[] args) {

        int[] v = {4 ,5, 8, 9, 20, 12};

        maxMin(v, 0, 0, v.length);

    }

}
