package actApl8_18;

import actApl8_17.Cola;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cola c = new Cola();

		System.out.println("Encolamos: ");
		c.encolar(5);
		c.encolar(10);
		c.encolar(15);
		c.mostrar();
		System.out.println("\nDesencolamos: ");
		c.desencolar();
		c.mostrar();
		
		ColaDoble cDoble = new ColaDoble();
		
		System.out.println("");
		
		System.out.println("Encolamos por el principio: ");
		cDoble.encolarPrincipio(4);
		cDoble.encolarPrincipio(21);
		cDoble.encolarPrincipio(13);
		cDoble.mostrar();
		System.out.println("\nDesencolamos por el final: ");
		cDoble.desencolarFinal();
		cDoble.mostrar();
		
	}

}
