package actRes8_04y05;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Nota cancion[] = {Nota.DO, Nota.SI, Nota.SOL, Nota.RE, Nota.FA};
		
		Piano p = new Piano();
		
		for (Nota nota : cancion) {
			p.add(nota);
		}
		
		p.interpretar();
		
	}

}
