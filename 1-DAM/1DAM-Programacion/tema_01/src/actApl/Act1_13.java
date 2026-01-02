package actApl;

import java.util.Scanner;

public class Act1_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		int num2;
		int suma;
		int multiplo;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		multiplo = sc.nextInt();
		System.out.println("Introduce un número para que sea múltiplo del anterior: ");
		num = sc.nextInt();
		num2 = multiplo - (num % multiplo) ;
		System.out.print("Para que sea multiplo de " + multiplo);
		System.out.println(", hay que añadirle: " + num2);
		suma = num + num2;
		System.out.println("El número es: " + suma);
		
		
	}

}
