package actRes;

import java.util.Scanner;

public class ActRes3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int num = sc.nextInt();
		
		while (num != 0) {
			boolean esPar, esPositivo;
			esPar = num % 2 == 0;
			esPositivo = num >= 0;
			System.out.println("El número es par: " + esPar);
			System.out.println("El número es positivo: " + esPositivo);
			System.out.println("El número al cuadrado es: " + num * num);
			System.out.println("Vuelva a introducir un número: ");
			num = sc.nextInt();
		}
	}

}
