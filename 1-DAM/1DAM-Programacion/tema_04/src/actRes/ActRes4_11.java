package actRes;

import java.util.Scanner;

public class ActRes4_11 {

	static int mcd(int a, int b) {
		
		int resultado;
		
		if (a == 0) {
			resultado = b;
		} else if (b == 0) {
			resultado = a;
		} else {
			int min = a <= b ? a : b;
			int max = a <= b ? b : a;
			resultado = mcd(min, max - min);
		}
		
		return(resultado);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, resultado;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		a = sc.nextInt();
		System.out.println("Introduce otro número: ");
		b = sc.nextInt();
		
		resultado = mcd(a, b);
		System.out.println("El mcd es: " + resultado);
	}

}
