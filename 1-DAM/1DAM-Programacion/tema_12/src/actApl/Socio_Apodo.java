package actApl;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Socio_Apodo implements Comparable<Socio_Apodo>, Serializable {

    String apodo;
    String nombre;
    LocalDate fechaIngreso;

    public Socio_Apodo(String apodo, String nombre, String fechaIngreso) {
        this.apodo = apodo;
        this.nombre = nombre;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaIngreso = LocalDate.parse(fechaIngreso, f);
    }

    int antiguedad() {
        return (int) fechaIngreso.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    @Override
    public int compareTo(Socio_Apodo antiguedad) {
        return this.fechaIngreso.compareTo(antiguedad.fechaIngreso);
    }

    @Override
    public boolean equals(Object o) {
        return apodo.equals(((Socio_Apodo) o).apodo);
    }

    @Override
    public String toString() {
        return "Socio: " + nombre + " (" + apodo + "), Fecha de ingreso: " + fechaIngreso + "\n";
    }

    public LocalDate fechaIngreso() {
        return fechaIngreso;
    }
}
