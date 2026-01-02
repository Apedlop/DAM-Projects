package actApl9_25;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lista lista = new Lista();

        // Insertar cadenas y caracteres en la lista
        lista.insertarFinal("B");
        lista.insertarFinal("C");
        lista.insertarFinal("A");
        lista.insertarFinal('D');
        lista.insertarFinal('E');
        lista.insertarFinal('F');

        System.out.println("Lista antes de ordenar:");
        System.out.println(lista);

        // Ordenar la lista
        lista.ordenar();

        System.out.println("Lista ordenada por orden alfabético:");
        System.out.println(lista);
		
	}

}
