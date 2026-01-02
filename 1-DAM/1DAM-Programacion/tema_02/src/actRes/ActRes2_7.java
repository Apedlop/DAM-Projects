package actRes;

import java.util.Locale;
import java.util.Scanner;

public class ActRes2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		System.out.println("Escribe un número: ");
		int a = sc.nextInt();
		System.out.println("Escribe otro número: ");
		int b = sc.nextInt();
		System.out.println("Escribe un tercer número: ");
		int c = sc.nextInt();
		
		if (a > b && b > c) {
			System.out.println(a + " > " + b + " > " + c);
		} else if (a > c && c > b) {
			System.out.println(a + " > " + c + " > " + b);
		} else if (b > a && a > c) {
			System.out.println(b + " > " + a + " > " + c);
		} else if ( b > c && c > a) {
			System.out.println(b + " > " + c + " > " + a);
		} else if ( c > a && a > b) {
			System.out.println(c + " > " + a + " > " + b);
		} else if ( c > b && b > a) {
			System.out.println(c + " > " + b + " > " + a);
		}
	
	}

}
