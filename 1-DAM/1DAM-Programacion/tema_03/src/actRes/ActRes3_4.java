package actRes;

import java.util.Scanner;

public class ActRes3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int etiqAlto, altAlto, alt, etiq = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la altura del árbol en centímetros: ");
		alt = sc.nextInt();
		
		altAlto = alt;
		etiqAlto = 0;
		
		while (alt != -1) {
			if (alt > altAlto) {
				altAlto = alt;
				etiqAlto = etiq;		
			}
			
			etiq++;
			
			System.out.println("Introduce la altura del árbol en centímetros: ");
			alt = sc.nextInt();
		}
		
		if (altAlto == -1) {
			System.out.println("No hay ningún árbol.");
		} else {
			System.out.println("El érbol más alto mide: " + altAlto + " cm.");
			System.out.println("La etiqueta del árbol más alto es: " + etiqAlto);
		}
	}

}
