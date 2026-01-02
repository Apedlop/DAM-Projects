package actRes;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class ActRes6_10 {

	static String eliminaEspacios(String cadena) {
		
		String sin = "";
		
		for (int i = 0; i < cadena.length(); i++) {
			
			char c = cadena.charAt(i);
			
			if (!Character.isWhitespace(c)) {
				sin = sin + c;
			}
			
		}
		
		return sin;
		
	}
	
	static String alReves(String original) {
		
		String nueva = "";
		
		for (int i = 0; i < original.length(); i++) {
			nueva = original.charAt(i) + nueva;
		}
		
		return nueva;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String frase, sinEspeacios, invertida;
		
		System.out.println("Introduzca una frase (sin tildes): ");
		frase = sc.nextLine();
		
		frase = frase.toLowerCase();
		sinEspeacios = eliminaEspacios(frase);
		invertida = alReves(sinEspeacios);
		
		if (sinEspeacios.equals(invertida)) {
			System.out.println("La frase es palíndroma.");
		} else {
			System.out.println("La frase no es palíndroma.");
		}
		
		
	}

}
