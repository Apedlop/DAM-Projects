package actApl;

import java.util.Arrays;

public class Act5_13 {

	static int[] desordenar(int vector[]) {
		
		int copia[] = Arrays.copyOf(vector, vector.length);

		for (int i = 0; i < vector.length; i++) {
			
			int pos1 = (int) (Math.random() * vector.length);
			int pos2 = (int) (Math.random() * vector.length);
			int aux = copia[pos1];
			copia[pos1] = copia[pos2];
			copia[pos2] = aux;
			
			
		}
		
		System.out.println("Tabla desordenada: " + Arrays.toString(copia));
		
		return copia;
		
//        // Crear una copia del vector original
//        int[] copiaVector = Arrays.copyOf(vector, vector.length);
//
//        // Desordenar la copia del vector
//        for (int i = 0; i < copiaVector.length; i++) {
//        	
//            // Generar un índice aleatorio entre 0 e i (inclusive)
//            int j = (int) (Math.random() * (i + 1));
//
//            // Intercambiar el elemento en la posición i con el elemento en la posición j
//            int temp = copiaVector[i];
//            
//            copiaVector[i] = copiaVector[j];
//            copiaVector[j] = temp;
//            
//        }

		
    }

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	
        int vector[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Tabla principal: " + Arrays.toString(vector));

        desordenar(vector);
    }
}