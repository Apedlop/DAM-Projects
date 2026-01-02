package actRes;

import java.util.Scanner;

public class ActRes4_02 {
	
	static void mostrar(int a, int b) {
		
		int mayor = a > b ? a : b;
		int menor = a < b ? a : b;
		
		for (int i = menor; i <= mayor; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		int a = sc.nextInt();
		System.out.println("Introduce otro número: ");
		int b = sc.nextInt();
		
		mostrar(a, b);
	}

}
