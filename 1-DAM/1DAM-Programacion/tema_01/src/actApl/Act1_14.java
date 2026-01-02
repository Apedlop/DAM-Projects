package actApl;

import java.util.Locale;
import java.util.Scanner;

public class Act1_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		System.out.println("Indica la base del triángulo: ");
		double base = sc.nextDouble();
		System.out.println("Indica la altura del triángulo: ");
		double altura = sc.nextDouble();
		double area = (base * altura) / 2;
		System.out.println("El área del triángulo es: " + area);

	}

}
