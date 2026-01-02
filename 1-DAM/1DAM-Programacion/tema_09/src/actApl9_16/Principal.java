package actApl9_16;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lista lista = new Lista();

		// Usando la lista como una cola
		System.out.println("Encolando elementos:");
		lista.encolar(1);
		lista.encolar(2);
		lista.encolar(3);
		System.out.println("Elementos encolados.");

		System.out.println("\nDesencolando elementos:");
		while (!lista.estaVacia()) {
			System.out.println("Elemento desencolado: " + lista.desencolar());
		}

		// Usando la lista como una pila
		System.out.println("\nApilando elementos:");
		lista.apilar(1);
		lista.apilar(2);
		lista.apilar(3);
		System.out.println("Elementos apilados.");

		System.out.println("\nDesapilando elementos:");
		while (!lista.estaVacia()) {
			System.out.println("Elemento desapilado: " + lista.desapilar());
		}
	}

}
