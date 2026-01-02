package Comparar;

public class Alumno implements Comparable {
    private String dni;
    private String nombre;
    private double notaMedia;

    public Alumno(String dni, String nombre, double notaMedia) {
        this.dni = dni;
        this.nombre = nombre;
        this.notaMedia = notaMedia;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    @Override
    public int compareTo(Object obj) {
        Alumno otroAlumno = (Alumno) obj;
        // Comparar por nombre
        return this.nombre.compareTo(otroAlumno.nombre);
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", notaMedia=" + notaMedia +
                '}';
    }
}
