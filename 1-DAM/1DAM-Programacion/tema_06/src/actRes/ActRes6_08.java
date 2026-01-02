package actRes;

import java.util.Scanner;

public class ActRes6_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		final String prefijo = "Javalín, javalón";
		final String sufijo = "Javalén, len, len";
		
		System.out.println("Introduce una frase: ");
		String frase = sc.nextLine();
		
		boolean idiomaJava = false;
		
		if (frase.startsWith(prefijo)) {
			idiomaJava = true;
			frase = frase.substring(0, frase.length());
		} else if (frase.endsWith(sufijo)) {
			idiomaJava = true;
			frase = frase.substring(0, frase.length() - sufijo.length());
		}
		
		if (idiomaJava) {
			frase = frase.strip();
			System.out.println(frase);
		} else {
			System.out.println("No está escrito en el idioma Javalandia.");
		}
	}

}
