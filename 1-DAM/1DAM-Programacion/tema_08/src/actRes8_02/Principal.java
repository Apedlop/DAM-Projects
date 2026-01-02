package actRes8_02;

import java.util.Scanner;

public class Principal {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HoraExacta h = new HoraExacta(11, 59, 59);
		
		System.out.println(h);
		
		for (int i = 1; i <= 61; i++) {
			h.inc();
		}
		
		System.out.println(h);
		
		System.out.println("Escriba los segundos: ");
		int segundos = sc.nextInt();
		
		if (h.setSegundos(segundos)) {
			System.out.println(h);
		} else {
			System.out.println("No es posible cambiar los segundos.");
		}
		
	}

}
