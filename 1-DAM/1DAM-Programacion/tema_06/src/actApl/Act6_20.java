package actApl;

import java.util.Scanner;

import javax.sql.rowset.JoinRowSet;

public class Act6_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una frase: ");
		String frase = sc.nextLine();
		
		String[] palabras = frase.split("\\s+");
		
		for (int i = 0; i < palabras.length; i++) {
			
			for (int j = i + 1; j < palabras.length; j++) {
				
				if (palabras[i].compareToIgnoreCase(palabras[j]) > 0) {
					String temp = palabras[i];
					palabras[i] = palabras[j];
					palabras[j] = temp;
				}
				
			}
			
		}
		
		System.out.println("Palabras ordenadas alfabéticamente: ");
		
		for (int i = 0; i < palabras.length; i++) {
		    System.out.print("[" + palabras[i] + "] ");
		}
		
	}

}
