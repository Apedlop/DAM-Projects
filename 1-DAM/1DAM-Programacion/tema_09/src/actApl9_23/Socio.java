package actApl9_23;

import java.time.LocalDate;

public class Socio implements Comparable {
	int id;
	String nombre;
	LocalDate fechaNacimiento;

	public Socio(int id, String nombre, LocalDate fechaNacimiento) {
		this.id = id;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public int compareTo(Object otro) {
		Socio otroSocio = (Socio) otro;
		return this.fechaNacimiento.compareTo(otroSocio.fechaNacimiento);
	}

	@Override
	public String toString() {
		return "Id: " + id + ", Nombre: " + nombre + ", Fecha de Nacimiento: " + fechaNacimiento;
	}
}
