package actRes;

import java.util.Scanner;

public class ActRes4_09 {

	static int maximo(int a, int b, int c) {
		
		int aux = maximo(a, b);
		
		return(maximo(aux, c));
	
	}
	
	static int maximo(int a, int b) {
		
		int max;
		
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		
	return(max);
	
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		int a = sc.nextInt();
		System.out.println("Introduce otro número: ");
		int b = sc.nextInt();
		System.out.println("Introduce un tercer número: ");
		int c = sc.nextInt();
		System.out.println("El número mayor es: " + maximo(a, b, c));
	}

}
