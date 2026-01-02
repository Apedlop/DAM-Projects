package actApl;

import java.util.Scanner;

public class Act4_17 {

	static int numAmigo(int num1, int num2) {
		
		int i, j, a = 0, b = 0;
		
		for (i = 1; i < num1; i++) {
			if (num1 % i == 0) {
				a += i;
			}
		}
		
		for (j = 1; j < num2; j++) {
			if (num2 % j == 0) {
				b += j;
			}
		}
		
		if (a == num2 && b == num1) {
			System.out.println(num1 + " y " + num2 + " son amigos.");
		} else {
			System.out.println(num1 + " y " + num2 + " no son amigos.");
		}
		
		return(i);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		int num1 = sc.nextInt();
		System.out.println("Introduce otro número: ");
		int num2 = sc.nextInt();
		
		numAmigo(num1, num2);
	}

}
