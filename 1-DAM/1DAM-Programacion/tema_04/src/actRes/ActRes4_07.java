package actRes;

import java.util.Scanner;

public class ActRes4_07 {

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

	static int numDivPrimos (int num) {
		
		int cont = 0;
		
		for (int i = 2; i <= num; i++) {
			if (esPrimo(i) && num % i == 0) {
				cont++;
			}
		}
		
		return(cont);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int num = sc.nextInt();
		System.out.println("Divisores de " + num + " es: " + numDivPrimos(num));
		
	}

}
