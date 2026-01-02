package actRes;

import java.util.Scanner;

public class ActRes2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número:");
		int num1 = sc.nextInt();
		System.out.println("Escribe otro número: ");
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println("El " + num1 + " es mayor que " + num2);
		} else {
			System.out.println("El " + num2 + " es mayor que " + num1);
		}
	}

}
