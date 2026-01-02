package actApl7_13;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Colores c = new Colores();

		c.addColor("Cyan");

		String[] coloresAlAzar = c.seleccionarColores(1);

		System.out.println("Colores al azar:");
		
		for (int i = 0; i < coloresAlAzar.length; i++) {
		    System.out.println(coloresAlAzar[i]);
		}

	}

}
