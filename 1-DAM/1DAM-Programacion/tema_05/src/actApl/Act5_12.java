package actApl;

import java.util.Arrays;

public class Act5_12 {

	static void desordenar(int vector[]) {
		
		for (int i = 0; i < vector.length; i++) {
			vector[i] = (int) (Math.random() * 10 + 1);
		}
		
		System.out.println("Tabla desordenada: " + Arrays.toString(vector));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vector[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.println("Tabla principal" + Arrays.toString(vector));
		
		desordenar(vector);
		
	}

}
