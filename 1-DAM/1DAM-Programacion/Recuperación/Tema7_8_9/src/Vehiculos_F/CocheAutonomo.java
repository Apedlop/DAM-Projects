package Vehiculos_F;

public class CocheAutonomo extends Automovil{
	int numSensores;
	
	public CocheAutonomo(int numIdentificacion, String marca, String modelo) {
		super(numIdentificacion, marca, modelo);
		this.numSensores=3;
	}
	
	public void setNumSensores(int numSensores) {
		if (numSensores>=3 && numSensores<=5) {
			this.numSensores = numSensores;
		}
	}
	
	@Override
	public String toString() {
		return super.toString()+", capacidad de pasajeros=" + capacidadPasajeros + ", ruedas="+numRuedas+ "numero de sensores=" + numSensores+"\n";
	}
}
