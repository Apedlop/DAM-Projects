package actRes;

import java.util.Scanner;

public class ActRes2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número: ");
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("El número es par."); 
		} else {
			System.out.println("El número es impar.");
		}

	}

}
