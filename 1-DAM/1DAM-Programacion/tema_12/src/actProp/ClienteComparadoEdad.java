package actProp;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class ClienteComparadoEdad implements Comparable<ClienteComparadoEdad> {

    String dni;
    String nombre;
    LocalDate fechaNacimiento;

    public ClienteComparadoEdad(String dni, String nombre, String fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento, formatoFecha);
    }

    int edad() {
        return (int) fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    @Override
    public int compareTo(ClienteComparadoEdad otro) {
        return Integer.compare(edad(), otro.edad());
    }

    @Override
    public String toString() {
        return "\nDNI: " + dni + " Nombre: " + nombre + " Edad: " + edad();
    }
}
