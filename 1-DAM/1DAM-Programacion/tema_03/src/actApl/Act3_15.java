package actApl;

import java.util.Scanner;

public class Act3_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double factorialN, factorialM, factorialNM;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int num = sc.nextInt();
		
		for (int n = 0; n <= num; n++) {
			for (int m = 0; m <= n; m++) {
				//factorial de n
				factorialN = 1;
				for (int i = 1; i <= n; i++) {
					factorialN = factorialN * i;
				}
				//factorial de m
				factorialM = 1;
				for (int i = 1; i <= m; i++) {
					factorialM = factorialM * i;
				}
				//factorial de n-m
				factorialNM = 1;
				for (int i = 1; i <= n - m; i++) {
					factorialNM = factorialNM * i;
					System.out.print("");
				}
				//formula
				int valor = (int) (factorialN / (factorialM * factorialNM));
				System.out.print(valor + " ");
			}
			System.out.println("");
		}
		
	}

}
