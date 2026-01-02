package actRes7_12;

import java.util.Arrays;

public class Lista {

	Integer[] tabla;
	
	public Lista() {
		
		tabla = new Integer[0];
		
	}
	
	static Lista concatena(Lista l1, Lista l2) {
		
		Lista resultado = new Lista();
		
		for (Integer e : l1.tabla) {
			resultado.insertarFinal(e);
		}
		
		for (Integer e : l2.tabla) {
			resultado.insertarFinal(e);
		}
		
		return resultado;
		
	}
	
	void insertarPrincipio(Integer nuevo) {
		
		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		
		System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1);
		
		tabla[0] = nuevo;
		
	}
	
	void insertarFinal(Integer nuevo) {
		
		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		
		tabla[tabla.length - 1] = nuevo;
		
	}
	
	void insertar(int posicion, Integer nuevo) {
		
		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		
		System.arraycopy(tabla, posicion, tabla, posicion + 1, tabla.length - posicion - 1);
		
		tabla[posicion] = nuevo;
		
	}
	
	Integer eliminar(int indice) {
		
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
	
}
