package actRes;

import java.util.Scanner;

public class ActRes2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a, b, c;
		double x1, x2, d;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un coeficiente para a: ");
		a = sc.nextInt();
		System.out.println("Escribe un coeficiente para b: ");
		b = sc.nextInt();
		System.out.println("Escribe un coeficiente para c: ");
		c = sc.nextInt();
		
		d = (b * b - 4 * a * c);
		if (d < 0) {
			System.out.println("No existen soluciones reales.");
		} else {
			x1 = (-b - Math.sqrt(b)) / (2 * 2);
			x2 = (-b + Math.sqrt(d)) / (2 * 2);
			System.out.println("Solución 1: " + x1);
			System.out.println("Solución 2: " + x2);
		}
	}

}
