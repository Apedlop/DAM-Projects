package ejerPrueba;

public class Vehiculo {

	String matricula;
	String color;
	String marca;
	String modelo;
	
	void pintar(String colorNuevo) {
		
		this.color = colorNuevo;
		
	}
	
	public void mostrar() {
		
		System.out.println("El vehiculo con matrícula: " + this.matricula);
		System.out.println("Color: " + this.color);
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		
	}

}
