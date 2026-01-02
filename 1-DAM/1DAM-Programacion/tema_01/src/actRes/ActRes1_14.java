package actRes;

import java.util.Locale;
import java.util.Scanner;

public class ActRes1_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num;
		int redondeo;
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		System.out.println("Escribe un número decimal: ");
		num = sc.nextDouble();
		redondeo = (int) (num + 0.5);
		System.out.println(num + " redondeado es: " + redondeo);

	}

}
