package actRes;

import java.util.Scanner;

public class ActRes3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int total, num1, num2, numSumas, respuesta;
		
		Scanner sc = new Scanner(System.in);
		
		numSumas = 0;
		do {
			num1 = (int) (Math.random() * 100 + 1);
			num2 = (int) (Math.random() * 100 + 1);
			total = num1 + num2;
			System.out.println("Suma: " + num1 + " + " + num2);
			respuesta = sc.nextInt();
			numSumas++;
		} while (respuesta == total);
		System.out.println("Ha hecho bien: " + (numSumas - 1) + " operaciones.");
	}

}
