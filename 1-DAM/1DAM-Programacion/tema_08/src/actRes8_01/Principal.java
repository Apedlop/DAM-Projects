package actRes8_01;

import java.util.Scanner;

public class Principal {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hora h = new Hora(11, 30);
		
		System.out.println(h);
		
		for (int i = 1; i <= 61; i++) {
			h.inc();
		}
		
		System.out.println(h);
		System.out.println("Escriba una hora: ");
		int hora = sc.nextInt();
		
		boolean cambioHora = h.setHora(hora);
		
		if (cambioHora) {
			System.out.println(h);
		} else {
			System.out.println("La hora no se pudo cambiar.");
		}
		
	}

}
