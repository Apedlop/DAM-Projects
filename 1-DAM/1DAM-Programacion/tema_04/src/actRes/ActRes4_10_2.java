package actRes;

import java.util.Locale;
import java.util.Scanner;

public class ActRes4_10_2 {

	static double aElevadoN(double base, int exp) {
		
		double res = 1;
		
		for (int i = 1; i <= exp; i++) {
			res = res * base;
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
		
		double res = aElevadoN(base, exp);
		
		System.out.println(base + "^" + exp + " = " + res);
		
	}

}
