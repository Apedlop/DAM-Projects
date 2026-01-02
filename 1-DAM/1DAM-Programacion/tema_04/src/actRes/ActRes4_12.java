package actRes;

import java.util.Scanner;

public class ActRes4_12 {

	static int fibo(int num) {
		
		int res; 
		
		if (num == 0 || num == 1) {
			res = 1;
		} else {
			res = fibo(num - 1) + fibo(num - 2);
		}
		
		return(res);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número (se recomienda que n < 40): ");
		int num = sc.nextInt();
		
		int res = fibo(num);
		
		System.out.println("Fibonacci del número " + num + " = " + res);
	}

}
