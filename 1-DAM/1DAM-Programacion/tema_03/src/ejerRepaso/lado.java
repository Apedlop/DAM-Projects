package ejerRepaso;

import java.util.Scanner;

public class lado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int num = sc.nextInt();
		
		for (int i = num / 2 + 1; i <= num; i++) {
			for (int j = i; j <= num; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for (int i = num - 1; i > (num / 2); i--) {
			for (int j = i; j <= num; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
