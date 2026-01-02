package actApl;

import java.time.chrono.MinguoChronology;
import java.util.Scanner;

public class Act1_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una cantidad de segundos: ");
		int seg = sc.nextInt();
		int hora = seg / 3600;
		int min = seg % 3600 / 60;
		int segun = seg % 3600 % 60;
		System.out.println("Los " + seg + " segundos son: " + hora + "h " + min + "' " + segun + "''.");

	}

}
