package actRes;

import java.util.Locale;
import java.util.Scanner;

public class ActRes2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		System.out.println("Escribe un número: ");
		double num1 = sc.nextDouble();
		System.out.println("Escribe otro número: ");
		double num2 = sc.nextDouble();
		
		double mayor = (num1 < num2) ? num2 : num1;
		double menor = (num1 > num2) ? num2 : num1;
		System.out.println(menor + " < " + mayor);
	}

}
