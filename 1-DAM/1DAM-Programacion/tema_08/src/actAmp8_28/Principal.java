package actAmp8_28;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Suceso suceso1 = new Suceso(1, 2, 3, 10, "Evento A");
		Suceso suceso2 = new Suceso(1, 2, 3, 10, "Evento A");

		if (suceso1.equals(suceso2)) {
			System.out.println("Los sucesos son iguales.");
		} else {
			System.out.println("Los sucesos son diferentes.");
		}

	}

}
