package actRes;

import java.util.Scanner;

public class ActRes1_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final double precioPeras;
		final double precioManzanas;
		
		precioPeras = 1.95;
		precioManzanas = 2.35;
		
		int vendidoPerasSemes1, vendidoManzanasSemes1;
		int vendidoPerasSemes2, vendidoManzanasSemes2;
		double importeTotal;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Para las peras: ");
		System.out.println("Kilos vendidos este primer semestre: ");
		vendidoPerasSemes1 = sc.nextInt();
		System.out.println("Kilos vendidos este segundo semestre: ");
		vendidoPerasSemes2 = sc.nextInt();
		
		System.out.println("Para las manzanas: ");
		System.out.println("Kilos vendidos este primer semestre: ");
		vendidoManzanasSemes1 = sc.nextInt();
		System.out.println("Kilos vendidos este segundo semestre: ");
		vendidoManzanasSemes2 = sc.nextInt();
		
		importeTotal = (vendidoPerasSemes1 + vendidoPerasSemes2) * precioPeras + (vendidoManzanasSemes1 + vendidoManzanasSemes2) * precioManzanas;
		
		System.out.println("Los beneficios anuales son: " + importeTotal + " euros");
	}

}
