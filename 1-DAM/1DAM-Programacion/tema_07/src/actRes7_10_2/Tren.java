package actRes7_10_2;

import actRes7_10_1.Maquinista;

public class Tren {

	Locomotora loc;
	Vagones vagon[];
	Maquinista maq;
	private int numVagones;
	
	public Tren(Locomotora loc, Maquinista maq) {
		
		this.loc = loc;
		this.maq = maq;
		
		vagon = new Vagones[5];
		
		numVagones = 0;
		
	}
	
	public void enganchaVagon(int cargaMax, int cargaActual, String mercancia) {
		
		if (numVagones >= 5) {
			System.out.println("El tren no admite más vagones");
		} else {
			Vagones v = new Vagones(numVagones, cargaMax, cargaActual, mercancia);
			vagon[numVagones] = v;
			numVagones++;
		}
		
	}
	
}
