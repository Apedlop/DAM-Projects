package ActExtra;

import java.util.Scanner;

public class ActExtra3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número: ");
		int num = sc.nextInt();
		
		
		if (num % 2 != 0) {
			for (int i = 1; i <= (num / 2 + 1); i++) {
	            for (int j = 1; j <= num / 2 - i + 1; j++) { //Espacios
	                System.out.print("  ");
	            }
	            for (int k = (num / 2) - i + 2; k <= (num / 2) + i; k++) {
	                System.out.print("* ");
	            }
	            System.out.println(" ");	
			}
			for (int i = 1; i <= (num / 2 + 1); i++) {
				for (int j = (num / 2) + 1; j <= (num / 2) + i; j++) { //Espacios
	                System.out.print("  ");
	            }
				for (int k = i + 1; k <= num - i; k++) {
	                System.out.print("* ");
	            }
	            System.out.println(" ");
			}
			
		} else {
			System.out.println("Introduce un número impar.");
		}
		
	}

}
