package actApl;

import java.util.Scanner;

public class Act4_18 {

	static int numAleatorios(int cant, int min, int max) {
		
		for (int i = 1; i <= cant; i++) {
			int numAlea = (int) (Math.random() * (max - min + 1) + min);
			System.out.print(numAlea + ", ");
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la cantidad de números aleatorios que se mostrarán: ");
		int cant = sc.nextInt();
		System.out.println("Introduce el valor mínimo que se puede tomar: ");
		int min = sc.nextInt();
		System.out.println("Introduce el valor máximo que se puede tomar: ");
		int max = sc.nextInt();
		
		numAleatorios(cant, min, max);
	}

}
