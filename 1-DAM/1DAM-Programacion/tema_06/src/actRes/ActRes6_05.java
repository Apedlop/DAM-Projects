package actRes;

import java.util.Scanner;

public class ActRes6_05 {
	
	static String alReves(String frase) {
		
		String nuevaFrase = "";
		
		for (int i = 0; i < frase.length(); i++) {
			nuevaFrase = frase.charAt(i) + nuevaFrase;
		}
		
		return nuevaFrase;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String frase;
		
		System.out.println("Introduce una frase: ");
		frase = sc.nextLine();
		
		System.out.println(alReves(frase));
		
	}

}
