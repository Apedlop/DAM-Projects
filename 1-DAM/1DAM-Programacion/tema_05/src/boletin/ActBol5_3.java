package boletin;

public class ActBol5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int vector[] = new int[10];
		
		for (int i = 0; i <= 9; i++) {
			vector[i] = (int) (Math.random() * 100);
		}
		
		int max = vector[0];
		int min = vector[0];
		
		for (int i = 1; i <= 9; i++) {
			
			if (vector[i] > max) {
				max= vector[i];
			}
			
			if (vector[i] < min) {
				min = vector[i];
			}

		}
		
		for (int i = 0; i <= 9; i++) {
			System.out.print(vector[i] + " ");
		}
		
		System.out.println("\nMáximo: " + max);
		System.out.println("Mínimo: " + min);
	}

}
