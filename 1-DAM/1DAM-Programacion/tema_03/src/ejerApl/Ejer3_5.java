package ejerApl;

import java.util.Scanner;

public class Ejer3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número: ");
		int num = sc.nextInt();
		
		for (int j = num; j <= num + 4; j++) {
			boolean esPrimo = true;
			int i = 2;
			while (i < j && esPrimo) {
				if (j % i == 0) {
					esPrimo = false;
				}
				i++;
			}
			System.out.print(j + " --> ");
			if (esPrimo) {
				System.out.println("primo");
			} else {
				System.out.println("no primo");
			}
		}
	}

}
