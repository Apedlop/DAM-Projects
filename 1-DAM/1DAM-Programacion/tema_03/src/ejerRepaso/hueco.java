package ejerRepaso;

import java.util.Scanner;

public class hueco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num - i; i++) {
			for (int j = i; j <= num / 2 + 1; j++) {
				System.out.print("* ");
			}
			for (int k = 0; k <= i * 2 - 3; k++) {
				System.out.print("  ");
			}
			for (int j = i; j <= num / 2 + 1; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		for (int i = 1; i <= num - i + 1; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			for (int k = i; k <= num - i; k++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}

	}

}
