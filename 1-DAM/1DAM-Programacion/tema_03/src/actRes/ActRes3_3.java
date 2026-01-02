package actRes;

import java.util.Scanner;

public class ActRes3_3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int numAleat = (int) (Math.random() * 100 + 1);

		
		System.out.println("Introduce un número: ");
		int num = sc.nextInt();
		
		while (num != -1 && num != numAleat) {
			if (numAleat < num) {
				System.out.println("Menor");
			} else {
				System.out.println("Mayor");
			}
			System.out.println("Escribe otro número: ");
			num = sc.nextInt();
		}
		
		if (num == numAleat) {
			System.out.println("¡Es correcto!");
		} else {
			System.out.println("El número era: " + numAleat);
		}
	}

}
