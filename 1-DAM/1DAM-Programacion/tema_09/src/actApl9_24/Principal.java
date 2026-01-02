package actApl9_24;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Lista lista = new Lista();
		    lista.insertarFinal("Zebra");
		    lista.insertarFinal("Gato");
		    lista.insertarFinal("Elefante");

		    System.out.println("Lista antes de ordenar:");
		    System.out.println(lista);

		    // Ordenar con el orden natural
		    lista.ordenar();
		    System.out.println("Lista ordenada de forma natural:");
		    System.out.println(lista);

		    // Ordenar con un criterio personalizado
		    lista.ordenar(new ComparadorLongitud());
		    System.out.println("Lista ordenada por longitud de cadenas:");
		    System.out.println(lista);
		
	}

}
