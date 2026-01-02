package actProp;

import java.util.Scanner;

public class ActProp3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int edad, min, max;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una edad: ");
		edad = sc.nextInt();
		
		max = edad;
		min = edad;
		
		while (edad != -1) {
			if (edad > max) {
				max = edad;
			}
			if (edad < min) {
				min = edad;
			}
			edad = sc.nextInt();
		}
		
		System.out.println("La edad mínima es: " + min);
		System.out.println("La edad máxima es: " + max);
	}

}
