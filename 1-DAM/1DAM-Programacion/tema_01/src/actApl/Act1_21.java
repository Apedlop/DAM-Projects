package actApl;

import java.util.Scanner;

import javax.sql.rowset.JoinRowSet;

public class Act1_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		int a = sc.nextInt();
		System.out.println("Introduzca otro número: ");
		int b = sc.nextInt();
		
		boolean igual = a == b;
		System.out.println("Los números son iguales: " + igual);
	}

}
