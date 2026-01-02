package actRes7_08;

public class SintonizadorFM {

	double frecuencia;
	
	SintonizadorFM(double frecInicial) {
		
		if (frecInicial < 80)  {
			frecuencia = 80;
		} else if (frecInicial > 108) {
			frecuencia = 108;
		} else {
			frecuencia = frecInicial;
		}
		
	}
	
	SintonizadorFM() {
		
		this(80);
		
	}
	
	public double down() {
		
		frecuencia -= 0.5;
		
		comprRango();
		
		return frecuencia;
		
	}
	
	public double up() {
		
		frecuencia += 0.5;
		
		comprRango();
		
		return frecuencia;
		
	}
	
	public void display() {
		
		System.out.println("Sintonizado: " + frecuencia + " MHz");
		
	}
	
	private void comprRango() {
		
		if (frecuencia < 80) {
			frecuencia = 80;
		} else if (frecuencia > 108) {
			frecuencia = 108;
		}
		
	}
	
}
