package actRes7_07;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Texto t = new Texto(5);
		
		t.addPrincipio("HO");
		t.addPrincipio(';');
		t.addFinal("Lá");
		t.addFinal('X');
		t.mostrar();
		
		System.out.println("Número de vocales: " + t.numVocales());
		
	}

}
