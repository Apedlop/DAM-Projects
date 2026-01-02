package actRes;

import java.util.Scanner;

public class ActRes6_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int veces = 0, pos;
		String frase, palabra;
		
		System.out.println("Introduce una frase: ");
		frase = sc.nextLine();
		
		System.out.println("Introduce una palabra: ");
		palabra = sc.nextLine();
		
		pos = frase.indexOf(palabra);
		
		while (pos != -1) {
			
			veces++;
			pos = frase.indexOf(palabra, pos + 1);
			
		}
		
		if (veces == 0) {
			System.out.println(palabra + " no se encuientra en la frase.");
		} else {
			System.out.println(palabra + " está " + veces + " veces en la frase.");
		}
		
	}

}
