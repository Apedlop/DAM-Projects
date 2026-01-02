package actRes;

import java.util.Scanner;

public class ActRes6_03_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String contraseña, palabra;
		
		System.out.println("Usuario 1, ¿cuál es la contraseña?");
		contraseña = sc.nextLine();
		
		System.out.println("La contraseña tiene " + contraseña.length() + " carácteres.");
		
		System.out.println("Usuario 2, introduce la contraseña: ");
		palabra = sc.nextLine();
		
		while (!palabra.equals(contraseña)) {
			
			String pista = "";
			
			for (int i = 0; i < contraseña.length(); i++) {
				
				if (contraseña.charAt(i) == palabra.charAt(i)) {
					pista += contraseña.charAt(i);
				} else {
					pista += '*';
				}
				
			}
			
			System.out.println(pista);
			
			System.out.println("Usuario 2, introduce la contraseña: ");
			palabra = sc.nextLine();
			
		}
		
		System.out.println("¡Acertaste!");
		
	}

}
