/* Realizar una aplicación que solicite al usuario su edad y le indique si es mayor de edad
 * (mediante un literal booleano: true o false)*/

package actRes;

import java.util.Scanner;

public class ActRes1_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe tu edad: ");
		int edad = sc.nextInt();
		boolean mayorEdad = edad >= 18;
		System.out.println("Mayoría de edad: " + mayorEdad);
	}

}
