package actRes;

import java.util.Arrays;
import java.util.Scanner;

public class ActRes5_06 {

	static int primitiva(int[] primGanadora, int[] apuesta) {
		
		int aciertos = 0;
		
		for (int a : apuesta) {
			if (Arrays.binarySearch(primGanadora, a) >= 0) {
				aciertos++;
			}
			
		}
			
		return aciertos;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int primGanadora[] = new int[6];
		int apuesta[] = new int[6];
		
		for (int i = 0; i < 6; i++) {
			primGanadora[i] = (int) (Math.random() * 10);
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.println("Introduce el " + (i + 1) + "º número de tu primitiva: ");
			apuesta[i] = sc.nextInt();
		}
		
		System.out.println("Has acertado: " + primitiva(primGanadora, apuesta));
		System.out.print("El número ganador era: " +  Arrays.toString(primGanadora));
		
		
	}

}
