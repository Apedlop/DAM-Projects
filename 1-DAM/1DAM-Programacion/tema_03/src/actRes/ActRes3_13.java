package actRes;

import java.util.Scanner;

public class ActRes3_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nota, susp = 0, condic = 0, aprop = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i <= 6; i++) {
			System.out.println("Introduce las notas: ");
			nota = sc.nextInt();
			if (nota < 4 && nota >= 0) {
				susp++;
			} else if (nota == 4) {
				condic++;				System.out.println("Hay " + condic + " alumnos condicionados.");
			} else if (nota > 4 && nota <= 10) {
				aprop++;
			}
		}
		
		System.out.println("Apobados: " + aprop);
		System.out.println("Suspensos: " + susp);
		System.out.println("Condicionados: " + condic);
	}

}
