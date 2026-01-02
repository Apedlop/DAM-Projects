package actRes7_09;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bombilla b1, b2;
		
		b1 = new Bombilla();
		b2 = new Bombilla();
		
		b1.enciende();
		b2.apaga();
		
		System.out.println("b1: " + b1.muestraEstado());
		System.out.println("b2: " + b2.muestraEstado());
		
		Bombilla.interruptorGeneral = false;
		
		System.out.println("\nCortamos la luz general.");
		
	}

}
