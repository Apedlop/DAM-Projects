package actApl8_13;

import actApl8_12.Caja;

public class CajaCarton extends Caja {

	public CajaCarton(double ancho, double alto, double fondo, Unidad unidad) {
		
		super(ancho, alto, fondo, unidad);
		
		this.volumen = 0.8 * super.getVolumen();
	
	}

	@Override
	public double getVolumen() {
		
		return this.volumen;
		
	}

	@Override
	public String toString() {
		
		String resultado = super.toString() + "\nEsta es una caja de cartón.\n";
		
		return resultado;
		
	}
	
}
