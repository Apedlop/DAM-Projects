package actApl;

import java.util.Scanner;

public class Act3_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num, sumaTotal = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("Introduce una cantidad: ");
			num = sc.nextDouble();
			
			if (num == 0) {
				break;
			}
			
			sumaTotal += num;
		}
		
		System.out.println("La cantidad total de dinero que tiene es: " + sumaTotal);
		
	}

}
