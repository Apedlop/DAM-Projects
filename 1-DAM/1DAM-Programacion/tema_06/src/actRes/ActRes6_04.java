package actRes;

import java.util.Scanner;

public class ActRes6_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int espacioBlanco = 0;
		String frase;
		char c;
		
		System.out.println("Introduce una frase: ");
		frase = sc.nextLine();
		
		for (int i = 0; i < frase.length(); i++) {
			
			c = frase.charAt(i);
			
			if (Character.isSpaceChar(c)) {
				espacioBlanco++;
			}
			
		}
		
		System.out.println("En la frase hay " + espacioBlanco + " espacios en blanco.");
		
	}

}
