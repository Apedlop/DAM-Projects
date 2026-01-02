package actRes;

import java.util.Scanner;

public class ActRes2_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int diasMes = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un día: ");
		int dia = sc.nextInt();
		System.out.println("Introduce un mes: ");
		int mes = sc.nextInt();
		System.out.println("Introduce un año: ");
		int año = sc.nextInt();
		
		diasMes = switch (mes) {
		case 2 -> 28; 
		case 4, 6, 9, 11 -> 30;
		default -> 31;
		};
		
		dia++;
		if (dia > diasMes) {
			dia = 1;
			mes++;
			if (mes > 12) {
				mes = 1;
				año++;
			}
		}
		
		System.out.println("La fecha del día siguiente es: " + dia + "/" + mes + "/" + año);

	}

}
