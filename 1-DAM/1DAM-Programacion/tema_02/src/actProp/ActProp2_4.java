package actProp;

import java.util.Scanner;

public class ActProp2_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba un número: ");
		int m = sc.nextInt();
		System.out.println("Escriba otro número: ");
		int n = sc.nextInt();
		boolean num = (n % m == 0);
		System.out.println("El número " + n + " es múltiplo de " + m + ": " + num) ;
	}

}
