package actRes7_08;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SintonizadorFM a, b;
		a = new SintonizadorFM(107);
		a.up(); a.up(); a.up(); a.up();
		a.display();
		
		b = new SintonizadorFM(80.5);
		b.down(); b.down(); b.down(); b.down();
		b.display();
		
		a = new SintonizadorFM(200);
		a.display();
		
		b = new SintonizadorFM(105);
		b.up(); b.up();
		b.display();
		
	}

}
