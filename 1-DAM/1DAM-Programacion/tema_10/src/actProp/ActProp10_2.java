package actProp;

import java.util.Locale;
import java.util.Scanner;

public class ActProp10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Introduce un nombre, una edad y una estatura: ");
		
		String nombre = sc.next();
		int edad = sc.nextInt();
		double estatura = sc.nextDouble();
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Estatura: " + estatura);
		
	}

}
