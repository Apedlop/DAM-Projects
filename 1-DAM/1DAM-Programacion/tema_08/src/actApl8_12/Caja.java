package actApl8_12;

public class Caja {

	public enum Unidad {
		
		CM, M
		
	}

	protected final double ancho, alto, fondo;
	protected final Unidad unidad;
	protected String etiqueta;
	protected double volumen;

	public Caja(double ancho, double alto, double fondo, Unidad unidad) {
		
		this.ancho = ancho;
		this.alto = alto;
		this.fondo = fondo;
		this.unidad = unidad;
		
		if (unidad == Unidad.M) {
			this.volumen = this.ancho * this.alto * this.fondo;
		} else {
			this.volumen = (this.ancho * this.alto * this.fondo) / 100;
		}
		
	}

	public double getVolumen() {
		
		return this.volumen;
		
	}

	public void setEtiqueta(String etiqueta) {
		
		if (etiqueta.length() <= 30) {
			this.etiqueta = etiqueta;
		} else {
			System.out.println("Etiqueta no válida");
		}
		
	}

	public String toString() {
		
		String resultado = "";
		
		resultado += this.etiqueta + ".\nVolumen de: " + getVolumen() + " m3.\nAncho: " + this.ancho + "\nAlto: " + this.alto + "\nFondo: " + this.fondo;
		
		return resultado;

	}
	
}
