package actRes;

import java.util.Scanner;

public class ActRes6_03_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String contraseña, palabra;
		
		System.out.println("Usuario 1, ¿cuál es la contraseña? ");
		contraseña = sc.nextLine();
		
		do {
			
			System.out.println("Usuario 2, introduce la contraseña: ");
			palabra = sc.nextLine();
			
			int comparacion = contraseña.length();
			
			if (palabra.equals(contraseña)) {
			    System.out.println("¡Acertaste!");
			} else if (comparacion < palabra.length()) {
			    System.out.println("La contraseña tiene una longitud menor.");
			} else if (comparacion > palabra.length()) {
			    System.out.println("La contraseña tiene una mayor longitud.");
			}
			
		} while (!contraseña.equals(palabra));
		
	}

}
