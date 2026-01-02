package deportista;

import java.io.Serializable;
import java.util.Arrays;

public class Lista implements Serializable {

	Object[] tabla;

	public Lista() {
		tabla = new Object[0];
	}

	void insertarPrincipio(Object nuevo) {
		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1);
		tabla[0] = nuevo;
	}

	void insertarFinal(Object nuevo) {
		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		tabla[tabla.length - 1] = nuevo;
	}

	void insertarFinal(Lista otraLista) {
		int tamIni = tabla.length;
		tabla = Arrays.copyOf(tabla, tabla.length + otraLista.tabla.length);
		System.arraycopy(otraLista.tabla, 0, tabla, tamIni, otraLista.tabla.length);
	}

	void insertar(int posicion, Object nuevo) {
		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		System.arraycopy(tabla, posicion, tabla, posicion + 1, tabla.length - posicion - 1);
		tabla[posicion] = nuevo;
	}

	public Object eliminar(String id) {
		Object eliminado = null;
		int indice = buscar(id);
		if (indice != -1) {
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

	public Integer buscar(String idbusqueda) {
		int indice = -1;
		for (int i = 0; i < tabla.length && indice == -1; i++) {
			if (((Deportista) tabla[i]).getName().equals(idbusqueda)) {
				indice = i;
			}
		}
		return indice;
	}

	public int numeroElementos() {
		return tabla.length;
	}

	public void mostrar() {
		System.out.println("Lista: " + Arrays.toString(tabla));
	}

}
