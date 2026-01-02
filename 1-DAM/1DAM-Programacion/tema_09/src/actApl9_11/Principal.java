package actApl9_11;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lista l1 = new Lista();
		
        l1.insertarFinal("A");
        l1.insertarFinal("B");
        l1.insertarFinal("C");

        Lista l2 = new Lista();
        
        l2.insertarFinal("X");
        l2.insertarFinal("Y");
        l2.insertarFinal("Z");

        l1.insertarPrincipio("Z");

        l1.insertarFinal("W");

        l1.insertarFinal(l2);

        l1.insertar(3, "M");

        System.out.println("Lista 1: " + l1);
        System.out.println("Elemento en la posición 2: " + l1.get(2));
        System.out.println("'M' está en la posición: " + l1.buscar("M"));

        System.out.println("Elemento eliminado en la posición 1: " + l1.eliminar(1));
        System.out.println("Lista 1 después de eliminar: " + l1);
		
	}

}
