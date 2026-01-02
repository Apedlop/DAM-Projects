package actApl9_17;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Lista lista = new Lista();

		        // Insertar elementos de diferentes tipos al principio de la lista
		        lista.insertarPrincipio("Hola");
		        lista.insertarPrincipio(42);
		        lista.insertarPrincipio(3.14);
		        lista.insertarPrincipio(true);

		        // Insertar elementos de diferentes tipos al final de la lista
		        lista.insertarFinal("Mundo");
		        lista.insertarFinal(100);
		        lista.insertarFinal(6.28);
		        lista.insertarFinal(false);

		        // Mostrar la lista
		        System.out.println("Elementos de la lista:");
		        System.out.println(lista);

		        // Eliminar un elemento en la posición 3
		        Object eliminado = lista.eliminar(3);
		        System.out.println("\nElemento eliminado en la posición 3: " + eliminado);

		        // Mostrar la lista después de la eliminación
		        System.out.println("\nElementos de la lista después de eliminar:");
		        System.out.println(lista);
		    
		
	}

}
