package actApl8_12;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Caja c = new Caja(10, 20.5, 30.22, Caja.Unidad.CM);
		
        c.setEtiqueta("Caja 1");
        System.out.println(c.toString());
        
        Caja c2 = new Caja(20.9, 15.4, 8, Caja.Unidad.M);
        
        c2.setEtiqueta("\nCaja 2");
        System.out.println(c2.toString());
		
	}

}
