package actApl8_19;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conjunto c = new Conjunto();

		c.insertarFinal(1);
		c.insertarFinal(2);
		c.insertarFinal(3);
		c.insertarFinal(1); 
		
		System.out.println("Contenido del conjunto: " + c.toString());

	}

}
