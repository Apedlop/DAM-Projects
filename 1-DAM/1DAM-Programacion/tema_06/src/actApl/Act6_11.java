package actApl;

import java.util.Scanner;

public class Act6_11 {
	
	static char codifica(char conjunto1[], char conjunto2[], char c) {
		
		final String conj1 = String.valueOf(conjunto1);
		
		char codificado;
		int pos = conj1.indexOf(c);
		
		if (pos == -1) {
			codificado = c;
		} else {
			codificado = conjunto2[pos];
		}
		
		return codificado;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		final char conjunto1[] = {'d', 's', 'v', 'y', 'r', 'q', 'a', 'w', 'i', 'x', 'l', 'j', 'c', 'o', 'h', 'z', 'f', 'm', 'g', 'k', 'b', 'u', 'n', 'e', 't', 'p'};
		final char conjunto2[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		char codificado[];
		String texto;
		
		System.out.println("Introduzca un texto a codificar: ");
		texto = sc.nextLine();
		
		texto = texto.toLowerCase();
		
		codificado = new char[texto.length()];
		
		for (int i = 0; i < texto.length(); i++) {
			codificado[i] = codifica(conjunto1, conjunto2, texto.charAt(i));
		}
		
		texto = String.valueOf(codificado);
		
		System.out.println(texto);
		
	}

}
