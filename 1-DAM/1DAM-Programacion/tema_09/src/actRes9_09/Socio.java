package actRes9_09;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Socio implements Comparable {

	int id;
	String nombre;
	LocalDate fechaNacimiento;
	
	public Socio(int id, String nombre, LocalDate fechaNacimiento) {
		
		this.id = id;
		this.nombre = nombre;
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		this.fechaNacimiento = fechaNacimiento;
		
	}
	
	int edad() {
		
		return (int) fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
		
	}
	
	public String toString() {
		
		return "Id: " + id + " Nombre: " + nombre + " Edad: " + edad() + "\n";
		
	}
	
	public int compareTo(Object otro) {
		
		return nombre.compareTo(((Socio)otro).nombre);
		
	}
	
}
