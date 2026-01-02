package actApl8_20;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conjunto c1 = new Conjunto();
		
		c1.insertarFinal(1);
		c1.insertarFinal(2);
		c1.insertarFinal(3);

		Conjunto c2 = new Conjunto();
		
		c2.insertarFinal(3);
		c2.insertarFinal(1);
		c2.insertarFinal(2);

		System.out.println("Conjunto 1: " + c1.toString());
		System.out.println("Conjunto 2: " + c2.toString());

		if (c1.equals(c2)) {
			System.out.println("Los conjuntos son iguales.");
		} else {
			System.out.println("Los conjuntos no son iguales.");
		}
	}

}
