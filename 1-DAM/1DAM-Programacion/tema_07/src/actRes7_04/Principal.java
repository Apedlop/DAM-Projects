package actRes7_04;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CuentaCorriente c1, c2;
		
		c1 = new CuentaCorriente("12345678-A", "Pepe");
		c2 = new CuentaCorriente("99999999-E", "Ana");
		
		c1.mostrar();
		
		System.out.println("");
		
		CuentaCorriente.setBanco("Banco Central");
		c1.mostrar();
		
		System.out.println("");
		
		CuentaCorriente.setBanco("Caja de Ahorros de Do-While");
		c1.mostrar();
		
		System.out.println("");
		
		c2.mostrar();
		
	}

}
