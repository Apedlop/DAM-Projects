package actApl;

import java.util.Scanner;

public class Act6_16 {
	
	static char codifica(char abecedario[],  char simbolos[], char c) {
		
		String conj1 = String.valueOf(abecedario);
		
		char codificado;
		int pos = conj1.indexOf(c);
		
		if (pos == -1) {
			codificado = c;
		} else {
			codificado = simbolos[pos];
		}
		
		return codificado;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		char abecedario[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 
							 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		char simbolos[] = {'\u0040', '\u0038', '\u00A9', '\u00D0', '\u20AC', '\u0192', '\u0039', '\u0023', 
						   '\u0021', '\u00BF', '\u007C', '\u00A3', '\u005E', '\u00F1', '\u00F8', '\u00B6', 
						   '\u0071', '\u00AE', '\u0024', '\u2020', '\u00B5', '\u221A', '\u2211', '\u00D7', 
						   '\u00A5', '\u03A3'};
 		String frase;
		
		System.out.println("Introduce una palabra o frase: ");
		frase = sc.nextLine();
		
		frase = frase.toLowerCase();
		
		char codificado[] = new char[frase.length()];
		
		for (int i = 0; i < frase.length(); i++) {
			codificado[i] = codifica(abecedario, simbolos, frase.charAt(i));
		}
		
		frase = String.valueOf(codificado);
		
		System.out.println(frase);
		
	}

}
