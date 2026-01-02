/*Escribir un programa que pida el número al usuario y muestre su valor absoluto*/

package actRes;

import java.util.Scanner;

public class ActRes1_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba un número: ");
		int num = sc.nextInt();
		int valorAbs = Math.abs(num);
		System.out.println("El valor absoluto de " + num + " es: " + valorAbs);
		
	}

}
