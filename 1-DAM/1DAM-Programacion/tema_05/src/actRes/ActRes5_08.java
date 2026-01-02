package actRes;

import java.util.Arrays;
import java.util.Scanner;

public class ActRes5_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int vector[];
		int par[] = new int[0];
		int impar[] = new int[0];
		
		System.out.println("Introduce la longitud de la tabla: ");
		int longitud = sc.nextInt();
		
		vector = new int[longitud];
		
		for (int i = 0; i < longitud; i++) {
			System.out.println("Introduce un " + (i + 1) + "º número: ");
			vector[i] = sc.nextInt();
		}
		
		for (int numero: vector) {
			if (numero % 2 == 0) {
				par = Arrays.copyOf(par, par.length + 1);
				par[par.length - 1] = numero;
			} else {
				impar = Arrays.copyOf(impar, impar.length + 1);
				impar[impar.length - 1] = numero;
			}
		}
		
		System.out.println("Tabla principal: " + Arrays.toString(vector));
		System.out.println("Tabla pares: " + Arrays.toString(par));
		System.out.println("Tabla impares: " + Arrays.toString(impar));
	}

}
