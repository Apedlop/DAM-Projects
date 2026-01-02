package Examen4y5;

import java.util.Arrays;

public class Ejercicio3 {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 4, 4, 6};
        int repetidos = eliminarDuplicados(array);
        System.out.println("Números repetidos: " + repetidos);
    }

    public static int eliminarDuplicados(int[] array) {
        int repetidos = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    repetidos++;
                    // Mueve el último elemento al lugar del duplicado
                    array[j] = array[array.length - 1];
                    array = Arrays.copyOf(array, array.length - 1);
                    j--; // Ajusta el índice para volver a verificar el elemento reemplazado
                }
            }
        }
        System.out.println("Array sin duplicados: " + Arrays.toString(array));
        return repetidos;
    }



}
