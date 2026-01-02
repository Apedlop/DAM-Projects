package actRes7_13;

import actRes7_11.Lista;

public class Pila {

	private Lista lista;

	public Pila() {

		lista = new Lista();

	}

	void apilar(Integer elemento) {

		lista.insertarFinal(elemento);

	}

	Integer desapilar() {
		
		return lista.eliminar(lista.tabla.length - 1);
		
	}
	
	public void mostrar() {
		
		lista.mostrar();
		
	}

}
