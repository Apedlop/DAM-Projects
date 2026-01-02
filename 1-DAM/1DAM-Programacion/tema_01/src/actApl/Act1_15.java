package actApl;

import java.util.Scanner;

public class Act1_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba un coeficiente para a: ");
		double a = sc.nextDouble();
		System.out.println("Escriba un coeficiente para b: ");
		double b = sc.nextDouble();
		System.out.println("Escriba un coeficiente para c: ");
		double c = sc.nextDouble();
		System.out.println("Escriba un coeficiente para x: ");
		double x = sc.nextDouble();
		double x2 = Math.pow(x, 2);
		double y = a * x2 + b * x + c;
		System.out.println("El resultado de y es: " + y);
		
	}

}
