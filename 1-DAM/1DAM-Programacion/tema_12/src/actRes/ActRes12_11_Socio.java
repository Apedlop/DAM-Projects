package actRes;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class ActRes12_11_Socio implements Comparable<ActRes12_11_Socio>, Serializable {

    String dni;
    String nombre;
    LocalDate fechaAlta;

    public ActRes12_11_Socio(String dni, String nombre, String fechaAlta) {
        this.dni = dni;
        this.nombre = nombre;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaAlta = LocalDate.parse(fechaAlta, f);
    }

    public ActRes12_11_Socio(String dni) {
        this.dni = dni;
    }

    int antiguedad() {
        return (int) fechaAlta.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    @Override
    public int compareTo(ActRes12_11_Socio o) {
        return dni.compareTo(o.dni);
    }

    @Override
    public boolean equals(Object o) {
        return dni.equals(((ActRes12_11_Socio) o).dni);
    }

    @Override
    public String toString() {
        return "Socio {dni = " + dni + ", nombre = " + nombre + ", antiguedad = " + antiguedad() + "}\n";
    }

}
