package ActMoodle;

import java.io.Serializable;

public class Estudiante implements Serializable, Comparable<Estudiante> {
    private String nombre;
    private int edad;
    private double promedio;

    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPromedio() {
        return promedio;
    }

    @Override
    public int compareTo(Estudiante o) {
        return Double.compare(o.promedio, this.promedio); // Ordenar de mayor a menor
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", promedio=" + promedio +
                '}';
    }
}

