package actApl8_16;


public class Pila extends Lista {

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
