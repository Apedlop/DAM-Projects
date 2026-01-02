package actApl;

import java.util.Scanner;

public class Act4_14 {

	static double segundos(int dia, int hora, int min) {
		
		int seg = (dia * 24) * 60 * 60;
		
		System.out.println("En " + dia + " días, " + hora + " horas y " + min + " minutos hay: " + seg + " segundos.");
		
		return(seg);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una cantidad de días: ");
		int dia = sc.nextInt();
		System.out.println("Introduce una cantidad de horas: ");
		int hora = sc.nextInt();
		System.out.println("Introduce una cantidad de minutos: ");
		int min = sc.nextInt();
		
		segundos(dia, hora, min);
	
	}

}
