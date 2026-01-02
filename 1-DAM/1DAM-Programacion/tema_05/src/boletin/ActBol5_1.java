package boletin;

import java.util.Scanner;

public class ActBol5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		int vector[] = new int[10];
		
		for (int i = 0; i <= 9; i++) {
			System.out.println("Introduce un número: ");
			vector[i] = sc.nextInt();
		}
		
		for (int i = 9; i >= 0; i--) {
			System.out.print(vector[i] + " ");
		}
	}

}
