package actApl;

import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;

public class Act3_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mcd = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número a: ");
		int a = sc.nextInt();
		System.out.println("Introduce un número b: ");
		int b = sc.nextInt();
		
		if (a < b) {
		for (int i = 2; i <= a; i++) {
			if ((a % i) == 0 && (b % i) == 0) {
				mcd = i;
			}
		}
		
		} else if (a > b) {
			for (int i = 2; i <= b; i++) {
				if ((b % i) == 0 && (b % i) == 0) {
					mcd = i;
				}
			}
		}
		
		System.out.println("El MCD de " + a + " y " + b + " es: " + mcd);
	}

}
