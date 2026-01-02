package actApl8_15;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lista l1 = new Lista();
        Lista l2 = new Lista();

        l1.insertarFinal(4);
        l1.insertarFinal(5);
        l1.insertarFinal(6);
        System.out.println(l1.toString());

        l1.insertarPrincipio(3);
        l1.insertarPrincipio(2);
        l1.insertarPrincipio(1);
        System.out.println(l1.toString());

        l1.insertar(2, 99);
        System.out.println(l1);

        l1.eliminar(2);
        System.out.println(l1.toString());

        System.out.println("El número 4 está en la posición: " + l1.buscar(4));

        System.out.println("");

        l2.insertarFinal(10);
        l2.insertarFinal(20);
        l2.insertarFinal(30);
        l2.insertarFinal(40);
        l2.insertarFinal(50);
        System.out.println(l2.toString());

        System.out.println("");

        l1.insertarFinal(12);
        System.out.println(l1.toString());
        
        System.out.println("");
        
        System.out.println("¿Son iguales? "+ l1.equals(l2));
		
	}

}
