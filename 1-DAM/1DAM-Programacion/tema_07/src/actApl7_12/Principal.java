package actApl7_12;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SegundoGrado s = new SegundoGrado(-1, 3, 2);

        s.mostrarDatos();
        System.out.println("Discriminante positivo: " + s.discriminantePositivo());

        double[] soluciones = s.solucion();
        
        System.out.print("Soluciones: ");
        
        for (double solucion : soluciones) {
            System.out.print(solucion + " ");
        }
		
	}

}
