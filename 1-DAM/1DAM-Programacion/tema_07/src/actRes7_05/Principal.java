package actRes7_05;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gestor g1 = new Gestor("Antonio Gonzáles", "666 555 444");
		Gestor g2 = new Gestor("Bea Rodríguez", "987 654 321");
		
		CuentaCorriente c1, c2, c3;
		c1 = new CuentaCorriente("12345678-A", "Pepita", g1);
		c2 = new CuentaCorriente("98765432-Z", "Ana", g1);
		c3 = new CuentaCorriente("11223344-B", "Sancho", g1);
		
		c1.mostrar();
		System.out.println("");
		
		c2.mostrar();
		System.out.println("");
		
		c3.mostrar();
		System.out.println("");
		
		c1.Gestor(g2);
		c1.mostrar();
		
	}

}
