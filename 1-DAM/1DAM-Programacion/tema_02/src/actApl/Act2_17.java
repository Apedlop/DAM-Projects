package actApl;

import java.util.Scanner;

public class Act2_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = (int) (Math.random() * 100);
		int n2 = (int) (Math.random() * 100);
		
		System.out.println("Suma los siguientes números: " + n1 + " + " + n2);
		int total = sc.nextInt();
		int correc = n1 + n2;
		
		if (total == (n1 + n2)) {
			System.out.println("La suma es correcta.");
		} else {
			System.out.println("La suma es incorrecta. La operación correcta sería: " + correc );
		}
	}

}
