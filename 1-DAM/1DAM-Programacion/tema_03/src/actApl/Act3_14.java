package actApl;

import java.util.Scanner;

public class Act3_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número: ");
		int hasta = sc.nextInt();
		
		for (int num = 1; num <= hasta; num++) {
			boolean esPrimo = true;
			int i = 2;
			while (i < num && esPrimo) {
				if (num % i == 0) {
					esPrimo = false;
				}
				i++;
			}
			System.out.print(num + " --> ");
			if (esPrimo) {
				System.out.println("primo");
			} else {
				System.out.println("no primo");
			}
		}
	}

}
