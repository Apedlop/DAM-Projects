package actRes;

import java.util.Scanner;

public class ActRes3_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double nota;
		boolean suspenso = false;
		
		Scanner sc = new Scanner(System.in);
		
		for (int num = 0; num < 5; num++) {
			System.out.println("Introduzca una nota de 0 a 10: ");
			nota = sc.nextDouble();
			
			if (nota < 5) {
				suspenso = true;
			}
		}
		
		if (suspenso) {
			System.out.println("Hay alumnos suspensos");
		} else {
			System.out.println("No hay alumnos suspensos.");
		}
	}

}
