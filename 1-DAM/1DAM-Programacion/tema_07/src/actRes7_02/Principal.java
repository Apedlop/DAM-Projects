package actRes7_02;

import java.util.Scanner;

public class Principal {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ingrese su nombre: ");
		String nombre = sc.nextLine();
		
		System.out.println("Introduce un número de ingreso: ");
		int ingr = sc.nextInt();
		
		System.out.println("Introduce un número de egreso: ");
		int egr = sc.nextInt();
		
		System.out.println("Introduce la cantidad que quieres sacar: ");
		int sacar = sc.nextInt();
		
		System.out.println("Introduce otra cantidad que quieres sacar: ");
		int sacar2 = sc.nextInt();
		
		CuentaCorriente c = new CuentaCorriente("12345678-A", nombre);
		c.ingreso(ingr);
		c.egreso(egr);
		c.mostrar();
		System.out.println("Puedo sacar " + sacar + "€ : " + c.egreso(sacar));
		System.out.println("Puedo sacar " + sacar2 + "€ : " + c.egreso(sacar2));
		
		System.out.println("");
		
		c = new CuentaCorriente("98765432-Z", 2000);
		c.mostrar();
		
		
	}

}
