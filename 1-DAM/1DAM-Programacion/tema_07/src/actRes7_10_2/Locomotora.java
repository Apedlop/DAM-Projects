package actRes7_10_2;

import actRes7_10_1.Mecánicos;

public class Locomotora {

	String matricula;
	int potencia;
	int antiguedad;
	Mecánicos mec;
	
	public Locomotora(String matricula, int potencia, int antiguedad, Mecánicos mec) {
		
		this.matricula = matricula;
		this.potencia = potencia;
		this.antiguedad = antiguedad;
		this.mec = mec;
		
	}
	
}
