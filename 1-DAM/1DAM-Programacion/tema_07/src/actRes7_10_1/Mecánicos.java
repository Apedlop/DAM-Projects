package actRes7_10_1;

public class Mecánicos {

	String nombre;
	String telefono;
	
	enum Especialidad {FRENOS, HIDRAULICA, ELECTRICIDAD, MOTOR}
	Especialidad especialidad;
	
	public Mecánicos(String nombre, String telefono, String especialidad) {
		
		this.nombre = nombre;
		this.telefono = telefono;
		this.especialidad = Especialidad.valueOf(especialidad);
		
	}
	
}
