package actRes7_05;

public class Gestor {

	public String nombre;
	private String tlf;
	double importeMax;
	
	public Gestor(String nombre, String tlf, double importeMax) {
		
		this.nombre = nombre;
		this.tlf = tlf;
		this.importeMax = importeMax;
		
	}
	
	public Gestor(String nombre, String tlf) {
		
		this(nombre, tlf, 10000.0);
		
	}
	
	String Tlf() {
		
		return tlf;
		
	}
	
	void mostrar() {
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Teléfono: " + tlf);
		System.out.println("Importe máximo: " + importeMax); 
		
	}
	
}
