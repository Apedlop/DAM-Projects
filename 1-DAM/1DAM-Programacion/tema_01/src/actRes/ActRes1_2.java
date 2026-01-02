/* Diseña un programa que pida un número al usuario -por teclado- 
 * y acontinuación lo muestre*/

package actRes;

import java.util.Scanner;

public class ActRes1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("Esciba un número:");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		System.out.println("El número que ha escrito es:" + num);
	}

}
