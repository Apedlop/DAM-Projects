package actRes;

import java.util.Scanner;

public class ActRes2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba un número: ");
		int num1 = sc.nextInt();
		System.out.println("Escriba otro número: ");
		int num2 = sc.nextInt();
		
		if (num1 == num2) {
			System.out.println("Ambos números son iguales");
		} else {
			System.out.println("Los números son distintos");
		}
	}

}
