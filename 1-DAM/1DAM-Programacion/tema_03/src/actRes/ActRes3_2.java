package actRes;

import java.util.Scanner;

public class ActRes3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sumaEdad = 0;
		int numAlum = 0;
		int numMayor = 0;
		double media;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una edad: ");
		int edad = sc.nextInt();
		
		while (edad >= 0) {
			sumaEdad += edad;
			numAlum++;
			if (edad >= 18) {
				numMayor++;
			}
			System.out.println("Introduzca una edad: ");
			edad = sc.nextInt();	
		}
		
		media = (double) sumaEdad / numAlum;
		
		System.out.println("La suma de todas las edades es: " + sumaEdad);
		System.out.println("La media de edad es: " + media);
		System.out.println("El número de alumnos es: " + numAlum);
		System.out.println("La cantidad de mayores de edad es: " + numMayor);
	}

}
