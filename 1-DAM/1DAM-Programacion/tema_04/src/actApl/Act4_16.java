package actApl;

import java.util.Scanner;

public class Act4_16 {

	static int divisoresPrimos(int num) {
		
		for (int i = 1; i <= num; i++) {
			boolean esPrimo = true;
			int j = 2;
			while (j < i && esPrimo) {
				if (i % j == 0) {
					esPrimo = false;
				}
				j++;
			}
			if (num % i == 0 && esPrimo) {
				System.out.print(i + ", ");
			} 
		}
		
		return num;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int num = sc.nextInt();
		
		System.out.println("Los divisores primos de " + num + " son: ");
		divisoresPrimos(num);
	}

}
