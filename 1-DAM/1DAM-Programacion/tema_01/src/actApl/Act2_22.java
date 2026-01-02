package actApl;

import java.util.Locale;
import java.util.Scanner;

public class Act2_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		System.out.println("Escriba la longitud del lanzamiento en metros: ");
		double metros = sc.nextInt();
		
		int cm = (int) (metros * 100 + 0.5);
		System.out.println("La longitud del lanzamiento son " + cm + " centímetros.");
	}

}
