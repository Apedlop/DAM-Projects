package actApl;

import java.util.Scanner;

public class Act1_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la cantidad de entradas infantiles que quiere comprar: ");
		int entrInf = sc.nextInt();
		System.out.println("Introduce la cantidad de entradas de adultos que quiere comprar: ");
		int entrAdul = sc.nextInt();
		double total = entrAdul * 20 + entrInf * 15.5;
		
		double valor = (total >= 100) ? total - total * 0.05 : total; 
		System.out.println("El total que debe pagar es: " + valor);
		
	}

}
