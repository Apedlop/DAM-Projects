package actApl;

import java.util.Arrays;
import java.util.Scanner;

public class Act5_17 {

	static int[] suma (int t[], int numElementos) {
		
		int resultado[] = new int[t.length - numElementos + 1];
		
		for (int i = 0; i < resultado.length; i++) {
			resultado[i] = 0;
			
			for (int j = 0; j <numElementos; j++) {
				resultado[i] += t[i + j]; 
			}
		}
		
		return resultado;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int t[] = new int [10];
		
		for (int i = 0; i < 10; i++) {
			t[i] = (int) (Math.random() * 10 + 1);
		}
		
		System.out.println("Tabla principal: " + Arrays.toString(t));
		
		System.out.println("¿Cuántos números quieres sumar consecutivamente?");
		int numElementos = sc.nextInt();
		
		System.out.println("Tabla suma: " + Arrays.toString(suma(t, numElementos)));
		
		
	}

}
