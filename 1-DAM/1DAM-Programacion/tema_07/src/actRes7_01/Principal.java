package actRes7_01;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CuentaCorriente c = new CuentaCorriente("12345678A", "Pepe");
		
		c.ingreso(1000);
		c.egreso(300);
		c.mostrar();
		System.out.println("Puedo sacar 700€: " + c.egreso(700));
		System.out.println("Puedo sacar 500€: " + c.egreso(500));
		
	}

}
