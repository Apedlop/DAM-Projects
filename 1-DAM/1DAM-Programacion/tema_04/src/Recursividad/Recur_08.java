package Recursividad;

public class Recur_08 {

	static void sumaVector (int[] vector, int i, int suma) {
		
		if (i == vector.length) {
			
			System.out.print(suma);
			
		} else {
			
			suma += vector[i];
			i++;
			
			sumaVector(vector, i, suma);
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vector[] = {14, 5, 17, 8, 3, 19, 10, 1, 13, 16};
		
		sumaVector(vector, 0, 0);
		
	}

}
