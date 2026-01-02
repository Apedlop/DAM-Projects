package ActRes9;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Comparator;

public class ActRes9_07 {

    public static void main(String[] args) {

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // Crear instancias de Socio con el formato correcto
        Socio s = new Socio(15, "Lorena", LocalDate.parse("10-10-2002", f));
        Socio s1 = new Socio(8, "mauricio", LocalDate.parse("05-02-2002", f));
        Socio s2 = new Socio(24, "Angel", LocalDate.parse("25-06-1999", f));
        Socio s3 = new Socio(10, "Paula", LocalDate.parse("10-08-2005", f));

        Socio[] socios = {s, s1, s2, s3};

        // Ordenado por edad
        System.out.println("Comparado por edad: ");
        Arrays.sort(socios);
        for (int i = 0; i < socios.length; i++) {
            System.out.println(socios[i]);
        }

        // Ordenado por nombre
        System.out.println("\nComparado por nombre: ");
        Arrays.sort(socios, new Comparator<Socio>() {
            @Override
            public int compare(Socio o1, Socio o2) {
                return o1.nombre.compareTo(o2.nombre);
                // Para que no discrimine entre matusculas y minusculas --> return o1.nombre.compareToIgnoreCase(o2.nombre);
            }
        });
        for (int i = 0; i < socios.length; i++) {
            System.out.println(socios[i]);
        }

        // Comparado por id
        System.out.println("\nComparado por id: ");
        Arrays.sort(socios, s);
        for (int i = 0; i < socios.length; i++) {
            System.out.println(socios[i]);
        }

    }

}

class Socio implements Comparable, Comparator {

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
    public int compareTo(Object o) {
        // Ordenar por edad
        return edad() - ((Socio) o).edad();

        //Ordenar por nombre
        /* return nombre.compareTo(((Socio) o).nombre); */

        // Ordenar por id
        /* return id - ((Socio) o).id */
    }

    public String toString() {
        return "Id: " + id + ", Nombre: " + nombre + ", Edad: " + edad();
    }

    @Override
    public int compare(Object o1, Object o2) {
        return ((Socio) o1).id - ((Socio) o2).id;
        // Para hacerlo de mayor a menor sería --> return ((Socio) o2).id - ((Socio) o1).id;
    }
}