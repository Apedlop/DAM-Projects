package actRes;

import java.util.Arrays;

public class ActRes5_04 {

	static int maximo(int vector[]) {
		
		int max = vector[0];
		
		for (int i : vector) {
			if (i > max) {
				max = i;
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vector[] = new int[10];
		
		for (int i = 0; i < vector.length; i++) {
			vector[i] = (int) (Math.random()* 50 + 1);
		}
		System.out.print("Tabla original: ");
		System.out.println(Arrays.toString(vector));
		System.out.println("El número máximo es: " + maximo(vector));
		
	}

}
