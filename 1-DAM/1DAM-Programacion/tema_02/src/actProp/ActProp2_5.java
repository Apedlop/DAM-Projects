package actProp;

import java.util.Scanner;

import javax.management.relation.InvalidRelationTypeException;

public class ActProp2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double precio, entradas, aforo, total, total2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce cual es el aforo máximo del local: ");
		aforo = sc.nextDouble();
		System.out.println("Intoriduce cuánto cuaestan las estradas: ");
		precio = sc.nextDouble();
		System.out.println("Introduce cuantas entradas se han vendido: ");
		entradas = sc.nextDouble();
		
		if (entradas <= (aforo * 0.2)) {
			System.out.println("El concierto ha sido cancelado.");
		} else if (entradas  <=  (aforo * 0.5)) {
			total = (precio - (precio * 0.25)) * entradas;
			System.out.println("El total de las entradas es: " + total);
		} else if (entradas > (aforo * 0.5)) {
			total2 = entradas * precio;
			System.out.println("El total de las entrada es: " + total2);
		}
	}

}
