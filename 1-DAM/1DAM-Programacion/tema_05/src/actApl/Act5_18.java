package actApl;

import java.util.Scanner;

public class Act5_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[4][4];

        System.out.println("Introduce los elementos de la matriz 4x4:");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento en la posición [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        if (esMatrizMagica(matriz)) {
            System.out.println("La matriz introducida es una matriz mágica.");
        } else {
            System.out.println("La matriz introducida no es una matriz mágica.");
        }
    }

    // Función para verificar si una matriz es mágica
	
    private static boolean esMatrizMagica(int[][] matriz) {
    	
        // Calcular la suma de la primera fila
    	
        int sumaFila = 0;
        for (int j = 0; j < 4; j++) {
            sumaFila += matriz[0][j];
        }

        // Verificar que la suma de todas las filas sea igual
        
        for (int i = 1; i < 4; i++) {
            int sumaFilaActual = 0;
            for (int j = 0; j < 4; j++) {
                sumaFilaActual += matriz[i][j];
            }
            if (sumaFilaActual != sumaFila) {
                return false;
            }
        }

        // Verificar que la suma de todas las columnas sea igual
        
        for (int j = 0; j < 4; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < 4; i++) {
                sumaColumna += matriz[i][j];
            }
            if (sumaColumna != sumaFila) {
                return false;
            }
        }

        // Verificar que la suma de las diagonales sea igual
        
        int sumaDiagonal1 = 0;
        int sumaDiagonal2 = 0;
        
        for (int i = 0; i < 4; i++) {
            sumaDiagonal1 += matriz[i][i];
            sumaDiagonal2 += matriz[i][3 - i];
        }

        return sumaDiagonal1 == sumaFila && sumaDiagonal2 == sumaFila;
    }
}