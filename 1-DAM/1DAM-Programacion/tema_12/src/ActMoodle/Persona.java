package ActMoodle;

import java.util.Objects;
import java.util.SortedSet;

public class Persona implements Comparable<Persona> {

    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public static void modificarEdadPorNombre(SortedSet<Persona> personas, String nombre, int nuevaEdad) {
        for (Persona persona : personas) {
            if (persona.getNombre().equals(nombre)) {
                persona.setEdad(nuevaEdad);
                return; // Termina el método después de modificar la edad
            }
        }
        // Si no se encuentra ninguna persona con el nombre dado
        System.out.println("No se encontró ninguna persona con el nombre: " + nombre);
    }

    @Override
    public boolean equals(Object ob) {
        return Objects.equals(edad, ((Persona) ob).edad);
    }

    @Override
    public int compareTo(Persona o) {
        return nombre.compareTo(o.nombre);
    }

    @Override
    public String toString() {
        return "Persona: [Nombre: " + nombre + ", edad: " + edad + "]\n";
    }

}
