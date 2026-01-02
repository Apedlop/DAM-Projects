package Examen4y5;

public class Ejercicio2 {

    public static void main(String[] args) {

        int[] vector = {5, 3, 4, 1, 2};
        int k = 3; // Hasta qué posición queremos ordenar (en este caso, k = 3)

        // Ordenación parcial hasta la posición k
        for (int i = 1; i < k; i++) {
            int elementoActual = vector[i];
            int j = i - 1;

            // Desplazar los elementos mayores hacia la derecha
            while (j >= 0 && vector[j] > elementoActual) {
                vector[j + 1] = vector[j];
                j--;
            }

            vector[j + 1] = elementoActual;
        }

        // Mostrar el vector ordenado hasta la posición k
        System.out.print("Vector ordenado hasta posición " + k + ": ");
        for (int num : vector) {
            System.out.print(num + " ");
        }
    }

}
