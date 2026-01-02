package actRes;

import java.util.Locale;
import java.util.Scanner;

public class ActRes2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		System.out.println("Escribe un número real negativo o positivo: ");
		double num = sc.nextDouble();
		
		if (-1 < num && num < 1 && num != 0) {
			System.out.println("El número es casi-cero.");
		} else {
			System.out.println("El número no es casi-cero.");
		}
	}

}
