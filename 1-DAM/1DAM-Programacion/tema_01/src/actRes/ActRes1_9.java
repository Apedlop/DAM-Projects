/* Escribir un programa que pida un número al usuario e indique mediante un literal booleano
 * (true o false) si el número es par*/

package actRes;

import java.util.Scanner;

public class ActRes1_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		
		System.out.println("Escribe un número: ");
		num = new Scanner(System.in).nextInt();
		boolean esPar = (num % 2) == 0;
		System.out.println("Es par: " + esPar);
	
	}

}
