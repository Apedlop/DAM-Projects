package actApl;

import java.util.Scanner;

public class Act3_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int hora, min, seg, incre = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una hora: ");
		hora = sc.nextInt();
		System.out.println("Introduce los minutos: ");
		min = sc.nextInt();
		System.out.println("Introduce los segundos: ");
		seg = sc.nextInt();
		System.out.println("¿Cuántos se segundos quiere incrementar?");
		incre = sc.nextInt();
		
		seg = seg + incre;
		if (seg > 59) {
			seg = seg - 60;
			min++;
		}
		
		if (min > 59) {
			min = min - 60;
			hora++;
		}
		
		if (hora > 23) {
			hora = 0;
		}
		
		
		System.out.println("La hora es: " + hora + "h " + min + "' " + seg + "''");
	}

}
