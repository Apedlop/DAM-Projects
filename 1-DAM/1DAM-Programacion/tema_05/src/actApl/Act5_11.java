package actApl;

import java.util.Arrays;

public class Act5_11 {

	public static int[] buscarTodos(int vector[], int clave) {
		
		int[] resultado = new int[0];
		
		int i = 0;
		
		while (i < vector.length) {
			
			if (clave == vector[i]) {
				resultado = Arrays.copyOf(resultado, resultado.length + 1);
				resultado[resultado.length - 1] = i;
			}
			
			i++;
			
		}
		
		return resultado;
		
//        int indice = 0;
//        
//        for (int i = 0; i < vector.length; i++) {
//            if (vector[i] == clave) {
//                indice++;
//            }
//        }
//
//        int[] indices = new int[indice];
//        int index = 0;
//
//        for (int i = 0; i < vector.length; i++) {
//            if (vector[i] == clave) {
//                indices[index++] = i;
//            }
//        }
//
//        return indices;
    }

    public static void main(String[] args) {
        int[] vector = {1, 2, 3, 4, 2, 5, 2, 6};

        int[] resultados = buscarTodos(vector, 2);

        if (resultados.length < 0) {
            System.out.println("La clave no se encuentra en el vector.");
        } else {
            System.out.print("La clave está en las posiciones: ");
            for (int i = 0; i < resultados.length; i++) {
                System.out.print(resultados[i] + " ");
            }
        }
    }
}
