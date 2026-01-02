package actApl7_19;

import java.util.Arrays;

public class Pila {

	private Integer[] tabla;
	private int longitud;

	public Pila(int capacidadInicial) {
		
		tabla = new Integer[capacidadInicial];
		longitud = 0;
		
	}

	public void apilar(Integer elemento) {
		
		if (longitud == tabla.length) {
			tabla = aumentarCapacidad();
		}
		
		tabla[longitud] = elemento;
		longitud++;
		
	}

	public Integer desapilar() {
		
		if (longitud == 0) {
			System.out.println("La pila está vacía.");
			return null;
		}

		Integer elementoDesapilado = tabla[longitud - 1];
		longitud--;

		return elementoDesapilado;
		
	}

	public void mostrar() {
		
		for (int i = 0; i < longitud; i++) {
			System.out.print(tabla[i] + " ");
		}
		
		System.out.println();
		
	}
	
	private Integer[] aumentarCapacidad() {
		
        int nuevaCapacidad = tabla.length * 2;
        return Arrays.copyOf(tabla, nuevaCapacidad);
        
    }

}
