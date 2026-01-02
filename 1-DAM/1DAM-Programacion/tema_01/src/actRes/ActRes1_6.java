/* Crear una aplicación que calcule la media aritmética de dos notas enteras.
 * Hay que tener en cuenta que la media puede contener decimales.*/

package actRes;

import java.util.Scanner;

public class ActRes1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nota1, nota2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nota 1: ");
		nota1 = sc.nextInt();
		System.out.println("Nota 2: ");
		nota2 = sc.nextInt();
		double notaMedia;
		notaMedia = (nota1 + nota2)/2.0;
		System.out.println("Su nota media es: " + notaMedia);
		
	}
}
