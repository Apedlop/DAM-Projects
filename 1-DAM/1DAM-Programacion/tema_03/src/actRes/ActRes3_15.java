package actRes;

import java.util.Scanner;

public class ActRes3_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un n: ");
		int n = sc.nextInt();
		
		for (int fila = 1; fila <= n; fila++) {
			for (int col = fila; col <= n; col++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	
	}

}
