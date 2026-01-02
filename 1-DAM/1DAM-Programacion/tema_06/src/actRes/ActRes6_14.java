package actRes;

import java.util.Scanner;

public class ActRes6_14 {

	static String creaAnagrama(String original) {
		
		char anagrama[] = original.toCharArray();
		
		for (int numCambios = 0; numCambios < anagrama.length; numCambios++) {
			
			int i = (int) (Math.random() * anagrama.length);
			int j = (int) (Math.random() * anagrama.length);
			
			char aux = anagrama[i];
			
			anagrama[i] = anagrama[j];
			anagrama[j] = aux;
			
		}
		
		return String.valueOf(anagrama);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String original, intento;
		
		do {
			
			System.out.println("Jugador 1. Introduzca una palabra: ");
			original = sc.nextLine();
			
		} while (original.isEmpty());
		
		String anagrama = creaAnagrama(original);
		
		System.out.println("\n" + anagrama);
		
		do {
			
			System.out.println("Jugador 2. ¿Cuál es la palabra?");
			intento = sc.nextLine();
			
		} while (!original.equals(intento));
		
		System.out.println("¡Has acertado!");
		
	}

}
