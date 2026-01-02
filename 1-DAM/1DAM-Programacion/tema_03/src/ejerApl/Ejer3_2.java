package ejerApl;

import java.util.Scanner;

public class Ejer3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int max = 99, min = 200;
		
		double suma = 0;
		
		for (int i = 0; i < 50; i++) {
		
			int num = (int) (Math.random() * (199 - 100 + 1) + 100);
			System.out.print(num + " ");
			
			if (num > max) {
				max = num;
			}
			if (num < min) {
				min = num;
			}
			
			suma += num;
		}
		
		double media = suma / 50;
		System.out.println("\nMáximo: " + max);
		System.out.println("Mínimo: " + min);
		System.out.println("Media total: " + media);
		
	}

}
