/* Diseñar una aplicación que calcule la longitud y el área de una circunferencia.
 * Para ello, el usuario debe introducir el radio (que debe contener decimales)*/

package actRes;

import java.util.*;

public class ActRes1_7 {
	
	public static void main(String[] args) {
		
		double radio;
		double area, longitud;
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		System.out.println("Escriba el radio: ");
		radio = sc.nextDouble();
		longitud = 2 * Math.PI * radio;
		area = Math.PI * Math.pow(radio, 2);
		System.out.println("La longitud de la circunferencia es: " + longitud);
		System.out.println("El área de la circunferencia es: " + area);
	}

}
