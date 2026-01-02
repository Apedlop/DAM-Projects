package actRes;

import java.util.Scanner;

public class ActRes6_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una frase: ");
		String frase1 = sc.nextLine();
		
		System.out.println("Introduce otra frase: ");
		String frase2 = sc.nextLine();
		
		int longFrase1 = frase1.length();
		int longFrase2 = frase2.length();
		
		if (longFrase1 == longFrase2) {
			System.out.println("La frase '" + frase1 + "' y la frase '" + frase2 + "' tienen la misma longitud.");
		} else if (longFrase1 < longFrase2) {
			System.out.println("La frase '" + frase1 + "' tiene menor longitud que la frase '" + frase2 + "'.");
		} else if (longFrase1 > longFrase2) {
			System.out.println("La frase '" + frase1 + "' tiene mayor longitud que la frase '" + frase2 + "'.");
		}
		
	}

}
