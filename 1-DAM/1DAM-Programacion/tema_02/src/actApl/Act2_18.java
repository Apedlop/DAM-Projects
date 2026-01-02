package actApl;

import java.util.Scanner;

public class Act2_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int correc = 0;
		String total = null;
		int n1 = (int)(Math.random() * 100);
		int n2 = (int)(Math.random() * 100);
		int operador = (int)(Math.random() * 3);
		
		
		if (operador == 0) {
			total = " + ";
			correc = n1 + n2; 
		} else if (operador == 1) {
			total = " - ";
			correc = n1 - n2;
		} else if (operador == 2) {
			total = " * ";
			correc = n1 * n2;
		}
		
		System.out.println("Realiza la siguiente operación: " + n1 + total + n2);
		int num = sc.nextInt();
		
		if (num == correc) {
			System.out.println("Es correcto.");
		} else {
			System.out.println("El número es incorrecto. El resultado es: " + correc);
		}
		
	}

}
