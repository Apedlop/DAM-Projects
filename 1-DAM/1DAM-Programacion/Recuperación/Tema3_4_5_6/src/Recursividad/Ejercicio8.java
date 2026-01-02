package Recursividad;

public class Ejercicio8 {

    public static void sumarVector(int[] v, int i, int suma) {

        if (i == v.length) {
            System.out.println(suma);
        } else {
            suma += v[i];
            i++;
            sumarVector(v, i, suma);
        }

    }

    public static void main(String[] args) {

        int[] v = {1, 2, 3, 6, 5};

        sumarVector(v, 0, 0);
    }

}
