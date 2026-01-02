package actRes;

import java.util.Scanner;

public class ActRes2_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int hora, min, seg;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce hora: ");
		hora = sc.nextInt();
		System.out.println("Introduce minutos: ");
		min = sc.nextInt();
		System.out.println("Introduce segundos: ");
		seg = sc.nextInt();
		
		seg++;
		if (seg > 59) {
			seg = 0;
			min++;
			if (min > 59) {
				min = 0;
				hora++;
				if (hora > 23) {
					hora = 0;
				}
			}
		} 
		
		System.out.println("La hora + 1 segundo es: " + hora + " h " + min + "' " + seg + "''");
	}

}
