package actProp;

import java.util.Arrays;
import java.util.Scanner;

public class ActProp5_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double positivos = 0, negativos = 0, numPositiv = 0, numNeg = 0; 
		int numCero = 0;
		
		System.out.println("Introduce la longitud de la tabla: ");
		int num = sc.nextInt();
		
		int vector[] = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.println("Introduce un " + (i + 1) + "º valor: ");
			vector[i] = sc.nextInt();
			
			if (vector[i] % 2 == 0) {
				positivos += vector[i];
				numPositiv++;
			}
			
			if (vector[i] == 0) {
				numCero++;
			} 
			
			if (vector[i] < 0) {
				negativos += vector[i];
				numNeg++;
			}
		}
	
		System.out.println(Arrays.toString(vector));
		System.out.println("Media de positivos: " + (positivos / numPositiv));
		System.out.println("Media de negativos: " + (negativos / numNeg));
		System.out.println("Ceros introducidos: " + numCero);
		
	}

}
