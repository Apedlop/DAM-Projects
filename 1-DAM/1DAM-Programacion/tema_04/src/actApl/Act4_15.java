package actApl;

import java.util.Scanner;

public class Act4_15 {

	static int diferenciaMin (int hora1, int hora2, int min1, int min2) {
		
		int diferencia1, diferencia2, horaMin1, horaMin2, dif;
		
		horaMin1 = hora1 * 60;
		horaMin2 = hora2 * 60;
		diferencia1 = (horaMin1 + min1);
		diferencia2 = (horaMin2 + min2);
		
		if (diferencia1 > diferencia2) {
			dif = diferencia1 - diferencia2;
		} else {
			dif = diferencia2 - diferencia1;
		}
		
		return(dif);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una hora: ");
		int hora1 = sc.nextInt();
		System.out.println("Introduce otra hora: ");
		int hora2 = sc.nextInt();
		System.out.println("Introduce una cantidad de minutos: ");
		int min1 = sc.nextInt();
		System.out.println("Introduce otra cantidad de minutos: ");
		int min2 = sc.nextInt();
		
		System.out.println("La diferencia entre los dos instantes es de " + diferenciaMin(hora1, hora2, min1, min2) + " minutos.");
		
		
	}

}
