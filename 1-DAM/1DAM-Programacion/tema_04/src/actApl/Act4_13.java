package actApl;

import java.util.Scanner;

public class Act4_13 {

	static int muestraPares(int n) {
		
		System.out.println("Los " + n + " primeros números son: ");
		
		for (int i = 1; i <= n; i++) {
			System.out.print(i * 2 + ", ");
		}
		
		return n;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		int n = sc.nextInt();
		
		muestraPares(n);
	}
	
}
