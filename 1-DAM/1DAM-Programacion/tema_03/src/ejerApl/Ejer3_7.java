package ejerApl;

import java.util.Scanner;

public class Ejer3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num, suma = 0, media = 0;
		int contador = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		num = sc.nextInt();
			
		while (num >= 0 && suma <= 1000) {
			suma += num;
			contador++;
			media = suma / contador;
			System.out.println("Introduce un número: ");
			num = sc.nextInt();
		}
		System.out.println("El la suma total de todos los números es: " + suma);
		System.out.println("La cantidad de números introducidos es: " + contador);
		System.out.println("La media total de todos los números es: " + media);
	}

}
