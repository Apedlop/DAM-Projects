package actRes7_12;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lista l1 = new Lista();
		Lista l2 = new Lista();
		
		l1.insertarFinal(1);
		l1.insertarFinal(3);
		l2.insertarFinal(10);
		
		Lista concatenacion = Lista.concatena(l1, l2);
		
		concatenacion.mostrar();
		
	}

}
