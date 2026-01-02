package actApl9_18;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pila pila = new PilaLista();

		// Apilar elementos
		pila.apilar("Elemento 1");
		pila.apilar("Elemento 2");
		pila.apilar("Elemento 3");

		// Desapilar y mostrar los elementos de la pila
		System.out.println("Desapilando elementos:");
		while (!pila.estaVacia()) {
			System.out.println(pila.desapilar());
		}

	}

}
