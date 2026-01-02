package actRes;

import java.util.Scanner;

public class ActRes3_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num;

		do {
			System.out.println("Introduce un número comprendido entre 1 y 10: ");
			num = sc.nextInt();
		} while (!(1 <= num && num <= 10));
			System.out.println("\n\nTabla del " + num);
			for (int n = 1; n <= 10; n++) {
				System.out.println(num + " x " + n + " = " + (num * n));
			}
	}

}
