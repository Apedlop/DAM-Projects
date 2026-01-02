package actApl;

import java.util.Scanner;

public class Act2_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la base del triángulo: ");
		double base = sc.nextDouble();
		System.out.println("Introduce la altura del triángulo: ");
		double altura = sc.nextDouble();
		
		if (base >= 0 && altura >= 0) {
			double area = (base * altura) / 2;
			System.out.println("El área del triángulo es: " + area);
		} else {
			System.out.println("Introduzca valores válidos.");
		}
	}

}
