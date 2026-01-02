/*Pedir al usuario su edad y mostrar que edad tendrá el próximo año*/

package actRes;

import java.util.Scanner;

public class ActRes1_3 {

	public static void main(String[] args) {
		
		int edad;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu edad: ");
		edad = sc.nextInt();
		edad = edad + 1;
		System.out.println("La edad que tendrás el año que viene será: " + edad);
		
	}
}
