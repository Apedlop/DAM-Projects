package actRes9_02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		Lista l = new Lista();
		
		System.out.println("Introduce un número: ");
		Integer n = sc.nextInt();
		
		while (n >= 0) {
			
			l.encolar(n);
			
			System.out.println("Introduce un número:");
			n = sc.nextInt();
			
		}
		
		n = l.desencolar();
		
		while (n != null) {
			
			System.out.println(n + " ");
			n = l.desencolar();
			
		}
		
		System.out.println("");
		
	}

}
