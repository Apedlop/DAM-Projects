package ex1Ev2;

import java.util.Arrays;

public class Ejercicio5 {

    static int[][] generaArrayBiInt(int inf, int sup) {

        int[][] matrizRellena = new int[3][3];

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                matrizRellena[i][j] = (int) (Math.random() * (sup - inf + 1) + inf);

            }

        }

        System.out.println("Matriz rellena: ");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print(matrizRellena[i][j] + " ");

            }

            System.out.println("");

        }

        return matrizRellena;

    }

    static int[] filaDeArray(int[][] matriz, int fil) {

        int[] filaElegida = new int[3];

        for (int j = 0; j < 3; j++) {

            filaElegida[j] = matriz[fil][j];

        }

        return filaElegida;

    }

    static int[] columnaDeArray(int[][] matriz, int col) {

        int[] columnaElegida = new int[3];

        for (int i = 0; i < 3; i++) {
            columnaElegida[i] = matriz[i][col];
        }

        return columnaElegida;
        
    }

    static int[] coordenadasEnArrayBiInt(int[][] matriz, int numBusq) {
    	
        int[] busqueda = {-1, -1};

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                if (matriz[i][j] == numBusq) {
                    busqueda[0] = i;
                    busqueda[1] = j;
                }
            }
        }

        return busqueda;
        
    }
    
    static void minColumnas(int[][] matriz) {
    	
        for (int j = 0; j < matriz[0].length; j++) {
        	
            int min = matriz[0][j];

            for (int i = 1; i < matriz.length; i++) {
            	
                if (matriz[i][j] < min) {
                    min = matriz[i][j];
                }
                
            }

            System.out.println("Mínimo en columna " + j + ": " + min);
            
        }
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	
        int[][] matrizRellena = generaArrayBiInt(10, 20);
        
        System.out.println("");
        
        int[] filaElegida = filaDeArray(matrizRellena, 1);
        System.out.println("Fila: " + Arrays.toString(filaElegida));

        int[] columnaElegida = columnaDeArray(matrizRellena, 0);
        System.out.println("Columna: " + Arrays.toString(columnaElegida));

        int[] coordenadas = coordenadasEnArrayBiInt(matrizRellena, 15);
        System.out.println("Posición número buscado: " + Arrays.toString(coordenadas));

        minColumnas(matrizRellena);
        
    }
	
}
