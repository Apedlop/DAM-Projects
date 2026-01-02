package ex1Ev1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 0, num2 = 1; 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el número hasta el que quieras llegar: ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			int suma = num1 + num2;
			System.out.println(num1);
			num2 = num1;
			num1 = suma;
			
		}
		
		
	}

}
