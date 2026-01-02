package Vehiculos_F;

public class Automovil extends Vehiculo{
	int capacidadPasajeros;
	final int numRuedas;
	
	public Automovil(int numIdentificacion, String marca, String modelo) {
		this.numIdentificacion=numIdentificacion;
		this.marca=marca;
		this.modelo=modelo;
		this.capacidadPasajeros=2;
		this.numRuedas=4;
	}
	
	public void setCapacidadPasajeros(int capacidadPasajeros) {
		this.capacidadPasajeros = capacidadPasajeros;
	}
	
	@Override
	public String toString() {
		return super.toString()+", capacidad de pasajeros=" + capacidadPasajeros + ", ruedas="+numRuedas+"\n";
	}
}
