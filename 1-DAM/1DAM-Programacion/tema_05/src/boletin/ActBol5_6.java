package boletin;

import java.util.Scanner;

public class ActBol5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int vector[] = new int[10];
		
		for (int i = 0; i <= 9; i++) {
			vector[i] = (int) (Math.random() * 100 + 1);
		}
		
		System.out.println("Introduce un número: ");
		int num = sc.nextInt();
		
		int result = -1, limInf = 0, limSup = vector.length - 1, indice;
		
		while (limInf <= limSup && result == -1) {
			indice = (limInf + limSup) / 2;
			
			if (vector[indice] == num) {
				System.out.println("El " + num + " si está en la tabla.");
				result = indice;
			} else if (num > vector[indice]) {
				limInf = indice + 1;
			} else {
				limSup = indice - 1;
			}
		}
		
		if (result == -1) {
			System.out.println("El " + num + " no está en la tabla.");
		}
		
		System.out.print("La tabla es: ");
		
		for (int i = 0; i < 10; i++) {
			System.out.print(vector[i] + " ");
		}
		
		System.out.println("\nIntroduzca un número: ");
		int num1 = sc.nextInt();
		
		for (int i = 0; i < 10 - 1; i++) {
			for (int j = 0; j < (10 - 1 - i); j++) {
				if (vector[j] > vector[j + 1]) {
					int aux = vector[j];
					vector[j] = vector[j + 1];
					vector[j + 1] = aux;
				}
			}
		}
		
		boolean encontrado = false;
		int i = 0;
		
		while ((i < 10) && !encontrado) {
			if (vector[i] == num1) {
				encontrado = true;
			}
			
			i++;
		}
		
		if (encontrado) {
			System.out.println("El " + num1 + " si está en la tabla.");
		} else {
			System.out.println("El " + num1 + " no está en la tabla.");
		}
		
		System.out.print("La tabla es: ");
		
		for (int j = 0; j < 10; j++) {
			System.out.print(vector[j] + " ");
		}
	}

}
