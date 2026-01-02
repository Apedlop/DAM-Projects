package ex1Ev2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
	
	static int[] recursividad(int[] vector1, int[] vector2, int [] resultado, int i) {
		
		if (i == resultado.length) {

			System.out.println("Resultado: " + Arrays.toString(resultado));
			
		} else {
			
			if (i % 2 == 0) {
				resultado[i] = vector1[i] + vector2[i];
			} else {
				resultado[i] = vector1[i] - vector2[i];
			}
			
			recursividad(vector1, vector2, resultado, i + 1);
			
		}
		
		return resultado;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el tamaño de los vectores: ");
		int l = sc.nextInt();

		int[] vector1 = new int[l];
		int[] vector2 = new int[l];
		int[] resultado = new int[l];
 		
		for (int i = 0; i < l; i++) {
			
			vector1[i] = (int) (Math.random() * 10 + 1);
			vector2[i] = (int) (Math.random() * 10 + 1);
			
		}
		
		System.out.println("Matriz 1: " + Arrays.toString(vector1));
		System.out.println("Matriz 2: " + Arrays.toString(vector2));
		
		recursividad(vector1, vector2, resultado, 0);
		
	}

}
