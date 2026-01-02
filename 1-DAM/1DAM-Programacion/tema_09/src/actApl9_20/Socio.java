package actApl9_20;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

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
        this.fechaNacimiento = fechaNacimiento;
        
    }

    int edad() {
        return (int) fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    @Override
    public String toString() {
        return "Id: " + id + " Nombre: " + nombre + " Edad: " + edad() + "\n";
    }

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		 return Integer.compare(this.edad(), ((Socio) o).edad());
	}
	
}