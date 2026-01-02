package Examen4y5;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        // Crear un arreglo con los números de referencia
        int[] vector = {1, 2, 3, 4, 5};

        // Pedir al usuario la cantidad de vueltas
        System.out.print("Ingrese la cantidad de vueltas: ");
        int vueltas = new Scanner(System.in).nextInt();

        // Realizar las vueltas
        for (int i = 0; i < vueltas; i++) {
            int ultimoElemento = vector[vector.length - 1];

            // Desplazar los elementos hacia la derecha
            for (int j = vector.length - 1; j > 0; j--) {
                vector[j] = vector[j - 1];
            }

            // Colocar el último elemento en la primera posición
            vector[0] = ultimoElemento;
        }

        // Mostrar resultado
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }

    }

}
