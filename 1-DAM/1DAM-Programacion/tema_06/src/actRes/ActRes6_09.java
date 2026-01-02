package actRes;

import java.util.Scanner;

public class ActRes6_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String frase = "", palabra;
		
		System.out.println("Introduzca una palabra: ");
		palabra = sc.nextLine();
		
		while (!palabra.toLowerCase().equals("fin")) {
			
			frase = frase + " " + palabra;
			
			System.out.println("Introduce una palabra: ");
			palabra = sc.nextLine();
			
		}
		
		System.out.println(frase);
		
	}

}
