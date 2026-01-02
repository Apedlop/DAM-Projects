package actRes;

import java.util.Scanner;

public class ActRes4_05 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("La i es una vocal " + esVocal ('i'));
		System.out.println("La E es una vocal " + esVocal ('E'));
		System.out.println("La f es una vocal " + esVocal ('f'));
	
	}
	
	static boolean esVocal(char c) {
		
		boolean resultado;
		
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || 
			c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
			resultado = true;
		} else {
			resultado = false;
		}
		
	return resultado;
	
	}

}
