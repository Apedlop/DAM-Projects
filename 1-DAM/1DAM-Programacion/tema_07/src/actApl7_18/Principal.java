package actApl7_18;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cola c = new Cola();

		System.out.println("Encolamos: ");
		c.encolar(5);
		c.encolar(10);
		c.encolar(15);
		c.mostrar();
		System.out.println("\nDesncolamos: ");
		c.desencolar();
		c.mostrar();

	}

}
