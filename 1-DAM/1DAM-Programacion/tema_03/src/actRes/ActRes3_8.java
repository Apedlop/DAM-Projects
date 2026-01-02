package actRes;

import java.util.Scanner;

public class ActRes3_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, suma = 0;
		double media;
		
		Scanner sc = new Scanner(System.in);
		
		for (int n = 1; n <= 10; n++) {
			System.out.println("Introduce un número: ");
			num = sc.nextInt();
			suma += num;
		}
		
		media = suma / 2;
		System.out.println("La media de todos los números es: " + media);
		
	}

}
