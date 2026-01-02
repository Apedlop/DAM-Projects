package actApl;

import java.util.Scanner;

public class Act2_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe ocho dígitos: ");
		int dni = sc.nextInt();
		
		int letraDni = (dni % 23);
		switch (letraDni) {
			case 0 -> System.out.println("El DNI es: " + dni + "T");
			case 1 -> System.out.println("El DNI es: " + dni + "R");
			case 2 -> System.out.println("El DNI es: " + dni + "W");
			case 3 -> System.out.println("El DNI es: " + dni + "A");
			case 4 -> System.out.println("El DNI es: " + dni + "G");
			case 5 -> System.out.println("El DNI es: " + dni + "M");
			case 6 -> System.out.println("El DNI es: " + dni + "Y");
			case 7 -> System.out.println("El DNI es: " + dni + "F");
			case 8 -> System.out.println("El DNI es: " + dni + "P");
			case 9 -> System.out.println("El DNI es: " + dni + "D");
			case 10 -> System.out.println("El DNI es: " + dni + "X");
			case 11 -> System.out.println("El DNI es: " + dni + "B");
			case 12 -> System.out.println("El DNI es: " + dni + "N");
			case 13 -> System.out.println("El DNI es: " + dni + "J");
			case 14 -> System.out.println("El DNI es: " + dni + "Z");
			case 15 -> System.out.println("El DNI es: " + dni + "S");
			case 16 -> System.out.println("El DNI es: " + dni + "Q");
			case 17 -> System.out.println("El DNI es: " + dni + "V");
			case 18 -> System.out.println("El DNI es: " + dni + "H");
			case 19 -> System.out.println("El DNI es: " + dni + "L");
			case 20 -> System.out.println("El DNI es: " + dni + "C");
			case 21 -> System.out.println("El DNI es: " + dni + "K");
			case 22 -> System.out.println("El DNI es: " + dni + "E");
			
		}
	}

}
