package ex1Ev1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int exp;
		double base, op = 0, n = 0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un número real:");
		base = sc.nextDouble();

		do {
			System.out.println("Introduzca hasta qué exponente desea llegar:");
			exp = sc.nextInt();
			if (exp < 0) {
				System.out.println("El exponente debe ser un número entero y Positivo.");
			}
		} while (exp < 0);
		
		for (int i = 1; i <= exp; i++) {
			if (i == 1) {
				op = base;
				System.out.println(base + "^" + i + " = " + op);
			} else {
				n = base;
				for (int j = 0; j < i; j++) {
					n *= base;
					op = n;
				}
				System.out.println(base + "^" + i + " = " + op);
			}

		}
	}

}
