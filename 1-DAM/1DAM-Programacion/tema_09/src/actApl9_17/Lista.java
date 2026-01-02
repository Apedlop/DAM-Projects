package actApl9_17;

import java.util.Arrays;

public class Lista {

	Object tabla[];
	
	Lista() {
		
		tabla = new Object[0];
		
	}
	
	void insertarPrincipio(Object i) {
		
		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1);
		tabla[0] = (Object) i;
		
	}
	
	void insertarFinal(Object nuevo) {
		
		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		tabla[tabla.length - 1] = nuevo;
		
	}
	
	void insertarFinal(Lista otraLista) {
		
		int tamInt = tabla.length;
		tabla = Arrays.copyOf(tabla, tabla.length + otraLista.tabla.length);
		System.arraycopy(otraLista.tabla, 0, tabla, tamInt, otraLista.tabla.length);
		
	}
	
	void insertar(int posicion, Object nuevo) {
		
		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		System.arraycopy(tabla, posicion, tabla, posicion + 1, tabla.length - posicion - 1);
		tabla[posicion] = nuevo;
		
	}
	
	Object eliminar(int indice) {
		
		Object eliminado = null;
		
		if (indice >= 0 && indice < tabla.length) {
			
			eliminado = tabla[indice];
			
			for (int i = indice + 1; i < tabla.length; i++) {
				tabla[i - 1] = tabla[i];
			}
			
			tabla = Arrays.copyOf(tabla, tabla.length - 1);
			
		}
		
		return eliminado;
		
	}
	
	Object get(int indice) {
		
		Object resultado = null;
		
		if (indice >= 0 && indice < tabla.length) {
			resultado = tabla[indice];
		}
		
		return resultado;
		
	}
	
	int buscar(Object claveBusqueda) {
		
		int indice = -1;
		
		for (int i = 0; i < tabla.length && indice == -1; i++) {
			
			if (tabla[i].equals(claveBusqueda)) {
				indice = i;
			}
			
		}
		
		return indice;
		
	}
	
	public String toString() {
		
		return Arrays.deepToString(tabla);
		
	}
	
}

