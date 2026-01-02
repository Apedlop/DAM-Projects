package actRes;

import java.util.Scanner;

public class ActRes2_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número: ");
		int n = sc.nextInt();
		
		if (n < 10) {
			System.out.println("Tiene 1 cifra.");
		} else if (n < 100) {
			System.out.println("Tiene 2 cifras.");
		} else if (n < 1000) {
			System.out.println("Tiene 3 cifras.");
		} else if (n < 10000) {
			System.out.println("Tiene 4 cifras.");
		} else if (n < 100000) {
			System.out.println("Tiene 5 cifras.");
		}
	}

}
