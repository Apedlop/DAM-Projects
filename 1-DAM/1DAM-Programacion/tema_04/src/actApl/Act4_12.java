package actApl;

import java.util.Scanner;

public class Act4_12 {

	static double distancia (double x1, double y1, double x2, double y2) {
		
		double euclidea, suma;
		
		suma = Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2);
		euclidea = Math.sqrt(suma);
		
		return(euclidea);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un x1: ");
		double x1 = sc.nextDouble();
		System.out.println("Introduce un y1: ");
		double y1 = sc.nextDouble();
		System.out.println("Introduce un x2: ");
		double x2 = sc.nextDouble();
		System.out.println("Introduce un y2: ");
		double y2 = sc.nextDouble();
		System.out.println("La distacia euclidea es: " + distancia(x1, y1, x2, y2));
	}

}
