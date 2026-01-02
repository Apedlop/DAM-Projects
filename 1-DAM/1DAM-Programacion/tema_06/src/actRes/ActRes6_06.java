package actRes;

import java.util.Scanner;

public class ActRes6_06 {

	static boolean esVocal(char c) {
		
		boolean resultado;
		
		String vocales = "aeiouáéíóúü";
		
		c = Character.toLowerCase(c);
		
		if (vocales.indexOf(c) == -1) {
			resultado = false;
		} else {
			resultado = true;
		}
		
		return resultado;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String nombre, sinVocal = "";
		
		char c;
		
		System.out.println("Introduzca su nombre completo: ");
		nombre = sc.nextLine();
		
		for (int i = 0; i < nombre.length(); i++) {
			
			c = nombre.charAt(i);
			
			if (!esVocal(c)) {
				sinVocal = sinVocal + c;
			}
			
		}
		
		System.out.println(sinVocal);
		
	}

}
