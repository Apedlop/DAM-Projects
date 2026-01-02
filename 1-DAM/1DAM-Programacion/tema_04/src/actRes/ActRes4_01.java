package actRes;

import java.util.Scanner;

public class ActRes4_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número: ");
		int n = sc.nextInt();
		
		System.out.println("--Antes de llamar a la función--");
		eco(n);
		System.out.println("--Después de llamar a la función--");
	}
	
	static void eco (int a) {
		
		for (int i = 0; i < a; i++) {
			System.out.println("Eco...");
		}
	}

}
