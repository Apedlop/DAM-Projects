 package ejerApl;

import java.util.Scanner;

public class Ejer3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, altPar = 0, impares = 0, contador = 0;
		double suma = 0, media = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Introduce un número: ");
			num = sc.nextInt();
			contador++;
			if (num >= 0) {
                if (num % 2 != 0) {
                    suma += num;
                    impares++;
                } else if (num > altPar) {
                    altPar = num;
                }
			}

		} while (num >= 0);
		
		 if (impares > 0) {
	            media = suma / impares;
	        } else {
	        	System.out.println("No hay ningún número impar.");
	        }
		 
		System.out.println("Se han introducido " + contador + " números.");
		System.out.println("El par más alto es: " + altPar);
		System.out.println("La media de todos los impares es: " + media);
	}

}
