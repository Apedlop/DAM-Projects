package actRes;

import java.util.Scanner;

public class ActRes4_03 {

	static void areaVolumen(double radio, double altura, int opcion) {
				
		double area, volumen;
		
		switch (opcion) {
		case 1: 
			area = 2 * Math.PI * radio * (altura + radio);
			System.out.println("Área: " + area);
			break;
		case 2: 
			volumen = Math.PI * Math.pow(radio, 2) * altura;
			System.out.println("Volumen: " + volumen);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un radio: ");
		double radio = sc.nextInt();
		
		System.out.println("Introduce una altura: ");
		double altura = sc.nextInt();
		
		System.out.println("Elige una opción: ");
		System.out.println("1- Área");
		System.out.println("2- Volumen");
		int opcion = sc.nextInt();
		
		areaVolumen(radio, altura, opcion);
	}

}
