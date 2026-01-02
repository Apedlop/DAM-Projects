/*Cáculos con el IVA*/

package actApl;

import java.util.Scanner;

public class Act1_11 {

	public static void iva() {
		// TODO Auto-generated method stub
		
		double num;
		double IVA;
		double precioIVA;
		double precioTotal;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el precio: ");
		num = sc.nextDouble();
		System.out.println("Introduce el IVA: ");
		IVA = sc.nextDouble();
		precioIVA = num * (IVA / 100);
		System.out.println("El importe correspondiente es: " + precioIVA);
		precioTotal = num + precioIVA;
		System.out.println("El precio total con IVA es: " + precioTotal);
		
		
		
	}

}
