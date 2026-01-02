package boletin;

import java.util.Scanner;

public class ActBol5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int vector[] = new int[8];
		
		for (int i = 0; i <= 7; i++) {
			System.out.println("Introduce un número: ");
			vector[i] = sc.nextInt();
		}
		
		for (int j = 0; j <= 7; j++) {
			
			if (vector[j] % 2 == 0) {
				System.out.println(vector[j] + " ---> par");
			} else {
				System.out.println(vector[j] + " ---> impar");
			}
			
		}
	}

}
