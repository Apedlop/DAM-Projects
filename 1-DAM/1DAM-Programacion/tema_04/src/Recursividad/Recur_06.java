package Recursividad;

public class Recur_06 {

	static void vectorRecur (int[] vector, int i) {
		
		if (i == vector.length) {
			
			  System.out.println("");
			  
        } else {
        	
            System.out.print(vector[i] + " ");
            
            i++;
            vectorRecur(vector, i);
            
		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vector[] = {1, 2, 3, 4, 5};
		
		vectorRecur(vector, 0);
		
	}

}
