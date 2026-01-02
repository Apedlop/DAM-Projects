/* Escribir una aplicación que pida el año actual y el de nacimiento del usuario.
 * Debe calcular su edad, suponiendo que el año en el curso el usuario ya ha 
 * cumplido años*/

package actRes;

import java.util.Scanner;

public class ActRes1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int añoActual;
		int añoNacimiento;
		int edad;
		Scanner sc = new Scanner(System.in);
		System.out.println("Año nacimiento: ");
		añoNacimiento = sc.nextInt();
		System.out.println("Año actual: ");
		añoActual = sc.nextInt();
		edad = añoActual - añoNacimiento;
		System.out.println("Su edad es: " + edad);
	}

}
