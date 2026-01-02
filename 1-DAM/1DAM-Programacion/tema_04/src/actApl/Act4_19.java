package actApl;

import java.util.Scanner;

public class Act4_19 {

static int numAleatorios(int cant) {
		
		for (int i = 1; i <= cant; i++) {
			double numAlea = (Math.random());
			System.out.print(numAlea + ", ");
		}
		
		return cant;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la cantidad de números aleatorios que se mostrarán: ");
		int cant = sc.nextInt();
		
		numAleatorios(cant);
	}

}
