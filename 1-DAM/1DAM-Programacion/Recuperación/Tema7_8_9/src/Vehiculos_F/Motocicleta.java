package Vehiculos_F;

public class Motocicleta extends Vehiculo{
	boolean sidecar;
	final int numRuedas;

	public Motocicleta(int numIdentificacion, String marca, String modelo) {
		this.numIdentificacion=numIdentificacion;
		this.marca=marca;
		this.modelo=modelo;
		this.sidecar=false;
		this.numRuedas=2;
	}
	
	public void setSidecar(boolean sidecar) {
		this.sidecar = sidecar;
	}
	
	@Override
	public String toString() {
		return super.toString()+", sidecar?="+ sidecar +", ruedas="+numRuedas+"\n";
	}
}
