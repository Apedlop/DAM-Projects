package actApl;

import java.util.Scanner;

public class Act2_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		double num = sc.nextDouble();
		
		double valorAbs = (num >= 0) ? num : -num;
		System.out.println("El valor absoluto de " + num + " es: " + valorAbs);
	}

}
