package actExtra;

import java.util.Arrays;
import java.util.Scanner;

public class Prueba {

	 static void listar(int vector[]) {
	        System.out.println(Arrays.toString(vector));
	    }

	    static int[] inserPosicionConcreta(int[] vector, int indicador) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Introduce la posición: ");
	        int posicion = sc.nextInt();

	        System.out.println("Introduce el número: ");
	        int num = sc.nextInt();

	        if (posicion < 0 || posicion > vector.length) {
	            System.out.println("Posición no válida");
	            return vector;
	        }

	        int[] nuevoVector = new int[vector.length + 1];

	        for (int i = 0, j = 0; i < nuevoVector.length; i++) {
	            if (i == posicion) {
	                nuevoVector[i] = num;
	            } else {
	                nuevoVector[i] = vector[j++];
	            }
	        }

	        return nuevoVector;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int indicador = 0;
	        int vector[] = new int[0];

	        vector = inserPosicionConcreta(vector, indicador);
	        listar(vector);
	    }
	}