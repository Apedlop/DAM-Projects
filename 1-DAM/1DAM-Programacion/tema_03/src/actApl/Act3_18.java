package actApl;

import java.util.Scanner;

public class Act3_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mcm = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número a: ");
		int a = sc.nextInt();
		System.out.println("Introduce un número b: ");
		int b = sc.nextInt();
		
		if (a > b) {
			for (int i = 2; i <= a; i++) {
				if ((a % i) == 0 && (b % i) == 0) {
					mcm = i;
				} 
			}
			
			} else if (a < b) {
				for (int i = 2; i <= b; i++) {
					if ((b % i) == 0 && (b % i) == 0) {
						mcm = i;
					}
				}
			}
			
			System.out.println("El mcm de " + a + " y " + b + " es: " + mcm);
	}

}
