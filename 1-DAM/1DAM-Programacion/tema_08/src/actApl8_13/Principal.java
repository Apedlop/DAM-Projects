package actApl8_13;

import actApl8_12.Caja;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Caja c1 = new Caja(10, 5, 3, Caja.Unidad.CM);
		
		c1.setEtiqueta("Caja 1");
		System.out.println(c1);

		CajaCarton cC1 = new CajaCarton(1, 0.5, 0.3, Caja.Unidad.M);
		
		cC1.setEtiqueta("Caja Cartón 1");
		System.out.println(cC1);

		Caja c2 = new Caja(8, 4, 2, Caja.Unidad.CM);
		
		c2.setEtiqueta("Caja 2");
		System.out.println(c2);

		CajaCarton cC2 = new CajaCarton(0.8, 0.4, 0.2, Caja.Unidad.M);
		
		cC2.setEtiqueta("Caja Cartón 2");
		System.out.println(cC2);

	}

}
