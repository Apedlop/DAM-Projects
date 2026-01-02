package Recursividad;

public class Recur_09 {
	
	static void maxMinVector(int vector[], int i, int max, int min) {
		
		if (i == vector.length) {
			
			System.out.println("Máximo: " + max);
			System.out.println("Mínimo: " + min);
			
		} else {
			
			if (vector[i] < min){
				min = vector[i];
			}
			
			if (vector[i] > max) {
				max = vector[i];
			}
			
			maxMinVector(vector, i + 1, max, min);
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vector[] = {42, 15, 78, 5, 91, 20, 63, 37, 82, 10};
		
		maxMinVector(vector, 0, 0, 100);
		
	}

}
