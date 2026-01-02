package Vehiculos_F;

public class Vehiculo implements Alquilar{
	protected int numIdentificacion;
	protected String marca;
	protected String modelo;
	boolean alquilado=false;
	
	public int getNumIdentificacion() {
		return this.numIdentificacion;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setNumIdentificacion(int numIdentificacion) {
		this.numIdentificacion = numIdentificacion;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
	public void alquilar() {
		if (!alquilado) {
			alquilado=true;
		}else {
			System.out.println("Este vehiculo ya esta alquilado");
		}
	}
	
	public void devolver() {
		if (alquilado) {
			alquilado=false;
		}else {
			System.out.println("Este vehiculo no esta alquilado");
		}
	}
	
	@Override
	public String toString() {
		return "Vehiculo: ID=" + numIdentificacion + ", marca=" + marca + ", modelo=" + modelo+ ", alquilado?=" + alquilado + "\n";
	}
}
