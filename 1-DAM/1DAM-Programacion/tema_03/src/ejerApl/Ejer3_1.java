package ejerApl;

import java.util.Scanner;

public class Ejer3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int dado1, dado2;
		
		 do {
	            dado1 = (int) (Math.random() * 6 + 1);
	            dado2 = (int) (Math.random() * 6 + 1);

	            System.out.println("Dado 1: " + dado1);
	            System.out.println("Dado 2: " + dado2);
	            System.out.println();

	        } while (dado1 != dado2);

	        System.out.println("Ambos dados tienen el mismo valor: " + dado1);
			
	}

}
