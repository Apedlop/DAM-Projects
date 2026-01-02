package actApl;

import java.util.Scanner;

public class Act1_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una medida en milímetros: ");
		double mm = sc.nextDouble();
		System.out.println("Introduzca una medida en centímetros: ");
		double cm = sc.nextDouble();
		System.out.println("Introduzca una cantidad en metros: ");
		double m = sc.nextDouble();
		double totalCm = (m * 100) + cm + (mm / 100 );
		System.out.println("La cantidad total son: " + totalCm + " centímetros.");
	}

}
