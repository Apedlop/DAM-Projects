package ejerPrueba;

public class Persona {

	private String nombre;
	private byte edad;
	private double estatura;
	private static String hoy = "Lunes";
	
	public static String getHoy() {
		return hoy;
	}

	public static void setHoy(String hoy) {
		Persona.hoy = hoy;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public byte getEdad() {
		return edad;
	}

	public void setEdad(byte edad) {
		this.edad = edad;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	
	Persona() {
		
//		Persona.hoy = "Lunes";
		
	}
	
	Persona(String nombre, byte edad, double estatura) {
		
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setEstatura(estatura);
		
		System.out.println("Nombre: " + this.getNombre());
		System.out.println("Edad: " + this.getEdad());
		System.out.println("Estatura: " + this.getEstatura());
		
	}
	
	void saludar() {
		
		System.out.println("Hola mi nombre es: " + this.getNombre());
		System.out.println("Encantado de conocerte.");
		
	}
	
	void mostrar() {
		
		System.out.println("Edad: " + this.getEdad());
		
		cumplirAños();
		
		System.out.println("Edad el proximo año: " + this.getEdad());
		
		crecer(getEstatura());

		System.out.println("Estatura: " + this.getEstatura());
		
	}
	
	void cumplirAños( ) {
		
		setEdad((byte) (getEdad() + 1));
		
	}
	
	void cambiarEdad() {
		
		byte edad = 34;
		
		this.setEdad(edad);
		
	}
	
	void crecer(double incremento) {
		
		setEstatura(getEstatura() + incremento);
		
	}

}
