package Recursividad;

public class Recur_07 {

	static void vectorRecurInver(int[] vector, int i) {
		
		if (i == 0) {
			
			System.out.println("");
			
		} else {
			
			i--;
			System.out.print(vector[i] + " ");
			
			vectorRecurInver(vector, i);
			
		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vector[] = {1, 2, 3, 4, 5};
		
		vectorRecurInver(vector, vector.length);
		
	}

}
