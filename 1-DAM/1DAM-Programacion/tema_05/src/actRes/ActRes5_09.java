package actRes;

import java.util.Arrays;
import java.util.Scanner;

public class ActRes5_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int puntos[] = new int[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Puntos del " + (i + 1) + "º programador: ");
			puntos[i] = sc.nextInt();
		}
		
		Arrays.sort(puntos);
		
		System.out.println("Puntuación: " + Arrays.toString(puntos));
		
		System.out.print("Puntos del programador en exibición: " );
		int puntosProgExi = sc.nextInt();
		
		while (puntosProgExi != -1) {
			
			int pos = Arrays.binarySearch(puntos, puntosProgExi);
			int indiceInsercion;
			
			if (pos < 0) {
				indiceInsercion = -pos - 1;
			} else {
				indiceInsercion = pos;
			}
			
			int copia[] = new int[puntos.length + 1];
			
			System.arraycopy(puntos, 0, copia, 0, indiceInsercion);
			
			System.arraycopy(puntos, indiceInsercion, copia, indiceInsercion + 1, puntos.length - indiceInsercion);
			
			copia[indiceInsercion] = puntosProgExi;
			
			puntos = copia;
			
			System.out.println("Puntos del programador de exibición: ");
			puntosProgExi = sc.nextInt();
		}
		
		System.out.println("Puntuación final: " + Arrays.toString(puntos));
		
	}

}
