package actApl7_15;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendario f1 = new Calendario(2022, 2, 28);
		f1.mostrar();

		Calendario f2 = new Calendario(2022, 12, 31);
		f2.mostrar();

		System.out.println("¿Las fechas son iguales? " + f1.iguales(f2));

	}

}
