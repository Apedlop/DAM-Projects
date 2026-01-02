package actRes;

import java.util.Scanner;

public class ActRes4_06 {

	static boolean esPrimo(int num) {
		
		boolean primo = true;
		int i = 2;
		
		if (num < 2) {
			primo = false;
		}
		
		while (i < num && primo == true) {
			if (num % i == 0) {
				primo = false;
			}
			i++;
		}
		
		return(primo);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			if (esPrimo(i)) {
				System.out.println(i + " es primo.");
			} else {
				System.out.println(i + " es compuesto.");
			}
		}
		
	}

}
