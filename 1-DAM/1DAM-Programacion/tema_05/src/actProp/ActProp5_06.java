package actProp;

import java.util.Arrays;
import java.util.Scanner;

public class ActProp5_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int vector[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		System.out.println("Introduce el número que quieres borrar: ");
		int borrar = sc.nextInt();
		
		int indice = Arrays.binarySearch(vector, borrar);
		
		if (indice >= 0) {
			System.arraycopy(vector, indice + 1, vector, indice, vector.length - indice - 1);
			vector = Arrays.copyOf(vector, vector.length - 1);
			System.out.println(Arrays.toString(vector));
		} else {
			System.out.println("El número no existe en la tabla.");
		}
		
	}

}
