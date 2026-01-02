package actApl;

import java.util.Scanner;

public class Act2_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double comidaDiaria, numAnimales, kilosPorAnimal, racion;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce cuánta comida se les dá diariamente: ");
		comidaDiaria = sc.nextDouble();
		System.out.println("Intoriduce cuántos animales hay: ");
		numAnimales = sc.nextDouble();
		System.out.println("Introduce cuántos kilos de comida hay: ");
		kilosPorAnimal = sc.nextDouble();
		
		if (kilosPorAnimal >= comidaDiaria) {
			System.out.println("Hay suficiente comida.");
		} else if (kilosPorAnimal < comidaDiaria) {
			if (kilosPorAnimal == 0) {
				System.out.println("Introduce un valor valido.");
			} else {
				racion = kilosPorAnimal / numAnimales;
				System.out.println("A cada animal le corresponde " + racion + " Kg de comida.");
			}
				
		}
	}

}
