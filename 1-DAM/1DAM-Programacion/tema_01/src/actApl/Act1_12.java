/* Escribe un programa que tome como entrada un número entero e indique qué catidad hay que sumarle 
 * para que el resultado sea múltiplo de 7*/

package actApl;

import java.util.Scanner;

public class Act1_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		int num2;
		int suma;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		num = sc.nextInt();
		num2 = 7 - (num % 7) ;
		System.out.println("Para que sea multiplo de 7, hay que añadirle: " + num2);
		suma = num + num2;
		System.out.println("El número es: " + suma);
		
		

	}

}
