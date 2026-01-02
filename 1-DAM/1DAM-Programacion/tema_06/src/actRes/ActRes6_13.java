package actRes;

import java.util.Scanner;

public class ActRes6_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String frase;
		int numVeces[];
		
		System.out.println("Introduce una frase: ");
		frase = sc.nextLine();
		
		frase = frase.toLowerCase();
		numVeces = new int['z' - 'a' + 1];
		
		for (int i = 0; i < frase.length(); i++) {
			
			if (Character.isLetter(frase.charAt(i))) {
				numVeces[frase.charAt(i) - 'a']++;
			}
			
		}
		
		for (int i = 0; i < 'z' - 'a' + 1; i++) {
			
			if (numVeces[i] != 0) {
				System.out.println((char) (i + 'a') + ": " + numVeces[i] + " veces");
			
			}
		}
		
	}

}
