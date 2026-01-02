package actExtra1;

import java.util.Arrays;

public class Alumno {

    String dni, nombre;
    AsignaturaNota[] asignaturasNotas;

    public Alumno(String dni, String nombre, AsignaturaNota[] asignaturasNotas) {
        this.dni = dni;
        this.nombre = nombre;
        this.asignaturasNotas = asignaturasNotas;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public AsignaturaNota[] getAsignaturasNotas() {
        return asignaturasNotas;
    }

    public void setAsignaturasNotas(AsignaturaNota[] asignaturasNotas) {
        this.asignaturasNotas = asignaturasNotas;
    }

    @Override
    public String toString() {
        String result = "Alumno: \nDNI=" + dni + ", nombre=" + nombre + "\n";
        for (AsignaturaNota asignaturaNota : asignaturasNotas) {
            result += asignaturaNota.getAsignatura().getAsignatura() + " ";
            // Obtener la calificación más alta entre suspenso, aprobado, bien, notable y sobresaliente
            int[] notas = {
                asignaturaNota.getCalificaciones().getNumSus(),
                asignaturaNota.getCalificaciones().getNumApr(),
                asignaturaNota.getCalificaciones().getNumBien(),
                asignaturaNota.getCalificaciones().getNumNot(),
                asignaturaNota.getCalificaciones().getNumSob()
            };
            int maxNota = Arrays.stream(notas).max().getAsInt();
            result += maxNota + ", ";
        }
        return result;
    }
}
