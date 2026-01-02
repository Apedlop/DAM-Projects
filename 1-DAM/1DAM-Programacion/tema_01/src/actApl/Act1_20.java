package actApl;

import java.util.Locale;
import java.util.Scanner;

public class Act1_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		System.out.println("Introduzca un número real: ");
		double num = sc.nextDouble();
		
		double raiz = Math.sqrt(num);
		System.out.println("La raíz cuadrada de " + num + " es: " + raiz);
	}

}
