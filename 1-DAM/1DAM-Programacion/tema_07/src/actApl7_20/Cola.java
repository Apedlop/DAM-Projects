package actApl7_20;

public class Cola {

	//class Lista
	//class Cola
	//class Principal
	
	private Nodo frente;
	private Nodo fin;

	private class Nodo {
		Integer dato;
		Nodo siguiente;

		public Nodo(Integer dato) {
			this.dato = dato;
			this.siguiente = null;
		}
	}

	public Cola() {
        this.frente = null;
        this.fin = null;
    }

	public void encolar(Integer elemento) {
		Nodo nuevoNodo = new Nodo(elemento);

		if (frente == null) {
			frente = nuevoNodo;
			fin = nuevoNodo;
		} else {
			fin.siguiente = nuevoNodo;
			fin = nuevoNodo;
		}
	}

	public Integer desencolar() {
		if (frente == null) {
			System.out.println("La cola está vacía.");
			return null;
		}

		Integer datoDesencolado = frente.dato;

		if (frente == fin) {
			frente = null;
			fin = null;
		} else {
			frente = frente.siguiente;
		}

		return datoDesencolado;
	}

	public void mostrar() {
		Nodo actual = frente;
		while (actual != null) {
			System.out.print(actual.dato + " ");
			actual = actual.siguiente;
		}
		System.out.println();
	}

}
