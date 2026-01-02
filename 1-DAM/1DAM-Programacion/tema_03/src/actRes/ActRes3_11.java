package actRes;

import java.util.Scanner;

public class ActRes3_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double factorial;
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		num = sc.nextInt();
		
		factorial = 1;
		for ( int n = 1; n <= num; n++) {
			factorial = factorial * n;
		}
		
		System.out.println("El factorial de " + num + " es: " + factorial);
	}

}
