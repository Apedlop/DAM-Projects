package actApl8_15;

import java.util.Arrays;

public class Lista {

	public Integer[] tabla; 
	
	public Lista() {
		
		tabla = new Integer[0];
		
	}
	
	void insertarPrincipio(Integer nuevo) {
		
		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		
		System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1);
		
		tabla[0] = nuevo;
		
	}
	
	public void insertarFinal(Integer nuevo) { 
		
		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		
		tabla[tabla.length - 1] = nuevo;
		
	}
	
	void insertar(int posicion, Integer nuevo) {
		
		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		
		System.arraycopy(tabla, posicion, tabla, posicion + 1, tabla.length - posicion - 1);
		
		tabla[posicion] = nuevo;
		
	}
	
	public Integer eliminar(int indice) { 
		
		Integer eliminado = null;
		
		if (indice >= 0 && indice < tabla.length) {
			
			eliminado = tabla[indice];
			
			for (int i = indice + 1; i < tabla.length; i++) {
				tabla[i - 1] = tabla[i];
			}
			
			tabla = Arrays.copyOf(tabla, tabla.length - 1);
			
		}
		
		return eliminado;
		
	}
	
	Integer get(int indice) {
		
		Integer resultado = null;
		
		if (indice >= 0 && indice < tabla.length) {
			resultado = tabla[indice];
		}
		
		return resultado;
		
	}
	
	int buscar(Integer claveBusqueda) {
		
		int indice = -1;
		
		for (int i = 0; i < tabla.length && indice == -1; i++) {
			
			if (tabla[i].equals(claveBusqueda)) {
				indice = i;
			}
			
		}
		
		return indice;
		
	}
	
	public int numElementos() {
		
		return tabla.length;
		
	}
	
	@Override
	public String toString() {
		
		String resultado;
		
		resultado = "Lista: " + Arrays.toString(tabla);
		
		return resultado;
		
	}
	
	@Override
	public boolean equals(Object otro) {
		
		Lista otraLista = (Lista) otro;
		boolean iguales;
		
		if (this.tabla.equals(otraLista.tabla)) {
			iguales = true;
		} else {
			iguales = false;
		}
		
		return iguales;
		
		
	}
	
}
