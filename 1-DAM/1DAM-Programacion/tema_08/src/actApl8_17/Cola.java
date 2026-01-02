package actApl8_17;

import java.util.Arrays;

public class Cola {

	protected int longitud;
	protected Integer[] cola = new Integer[longitud];

	public void encolar(Integer elemento) {

		if (longitud == cola.length) {
			cola = Arrays.copyOf(cola, cola.length + 1);
		}
		
		cola[longitud] = elemento;
		longitud++;

	}

	public Integer desencolar() {
		
		if (longitud == 0) {
			System.out.println("La cola está vacía.");
		}

		Integer elementoDesencolado = cola[0];

		// Desplaza los elementos hacia la izquierda
		for (int i = 0; i < longitud - 1; i++) {
			cola[i] = cola[i + 1];
		}

		longitud--;
		
		return elementoDesencolado;
		
	}

	public void mostrar() {
		
		for (int i = 0; i < longitud; i++) {
			System.out.print(cola[i] + " ");
		}
		
	}
	
}
