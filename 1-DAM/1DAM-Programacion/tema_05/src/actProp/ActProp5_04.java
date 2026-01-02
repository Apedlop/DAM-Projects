package actProp;

import java.util.Arrays;
import java.util.Scanner;

public class ActProp5_04 {

	static int buscar(int[] vector, int clave) {
		
		int indice = 0;
		
		while (indice < vector.length && vector[indice] != clave) {
			indice++;
		}
		
		if (indice < vector.length) {
			System.out.println("El número " + clave + " se encuentra en la posición " + indice);
		} else {
			System.out.println("-1");
		}
		
		return clave;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int vector[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
//		int vector[] = new int[10];
		
//		for (int i = 0; i < 10; i++) {
//			vector[i] = (int) (Math.random() * 100 + 1);
//		}
		
		System.out.println("¿Qué valor se busca? (Intorduce valores que estén dentro del parámetro [1 - 100])");
		int clave = sc.nextInt();
		
		buscar(vector, clave);
		
		System.out.println("Tabla: " + Arrays.toString(vector));
		
	}

}
