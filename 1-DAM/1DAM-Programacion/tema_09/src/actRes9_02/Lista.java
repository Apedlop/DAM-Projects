package actRes9_02;

import java.util.Arrays;

class Lista implements Cola {

	public Integer[] tabla; //Es public para que se pueda usar en la actRes7_13
	
	public Lista() {
		
		tabla = new Integer[0];
		
	}
	
	void insertarPrincipio(Integer nuevo) {
		
		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		
		System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1);
		
		tabla[0] = nuevo;
		
	}
	
	public void insertarFinal(Integer nuevo) { //Es public para que se pueda usar en la actRes7_13
		
		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		
		tabla[tabla.length - 1] = nuevo;
		
	}
	
	void insertar(int posicion, Integer nuevo) {
		
		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		
		System.arraycopy(tabla, posicion, tabla, posicion + 1, tabla.length - posicion - 1);
		
		tabla[posicion] = nuevo;
		
	}
	
	public Integer eliminar(int indice) { //Es public para que se pueda usar en la actRes7_13
		
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
	
	public void mostrar() {
		
		System.out.println("Lista: " + Arrays.toString(tabla));
		
	}

	public void encolar(Integer nuevo) {
		
		insertarFinal(nuevo);
		
	}

	public Integer desencolar() {
		
		return eliminar(0);
		
	}
	
}
