package ejerRepaso;

import java.util.Scanner;

public class advNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int numSecret = (int) (Math.random() * 100 + 1);
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Adivina el número, tienes 10 intentos.");
			System.out.println("Introduce un número del 1 al 100: ");
			int num = sc.nextInt();
			while (num > 0) {
				if (num < numSecret) {
					System.out.println("Mayor");
				} else if (num > numSecret) {
					System.out.println("Menor");
				} else if (num == numSecret) {
					System.out.println("¡Correcto! Lo has adivinado en " + i + " intentos.");
				}
				System.out.println("Introduce otro número entre 1 y 100: ");
				num = sc.nextInt();
			}
		}
	}

}
