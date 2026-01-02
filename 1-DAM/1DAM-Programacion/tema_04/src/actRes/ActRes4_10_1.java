package actRes;

import java.util.Locale;
import java.util.Scanner;

public class ActRes4_10_1 {

	static double aElevadoN(double base, int exp) {
		
		double res;
		
		if (exp == 0) {
			res = 1;
		} else {
			res = base * aElevadoN(base, exp - 1);
		}
		
		return(res);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US); // Para permitir puntos (.)
		
		System.out.println("Introduce un número para la base (real): ");
		double base = sc.nextDouble();
		System.out.println("Introduce un número para el exponente (entero positivo): ");
		int exp = sc.nextInt();
		
		System.out.println("El resultado es: " + aElevadoN(base, exp));
	}

}
