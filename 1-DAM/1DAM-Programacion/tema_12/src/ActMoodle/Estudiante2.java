package ActMoodle;

import java.io.Serializable;

public class Estudiante2 implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nombre;
    private int edad;
    private double promedio;
    private String carrera;
    private String idEstudiante;

    public Estudiante2(String nombre, int edad, double promedio, String carrera, String idEstudiante) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
        this.carrera = carrera;
        this.idEstudiante = idEstudiante;
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

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getIdEstudiante() {
        return idEstudiante;
    }

    @Override
    public String toString() {
        return "ID: " + idEstudiante + ", Nombre: " + nombre + ", Edad: " + edad + ", Promedio: " + promedio + ", Carrera: " + carrera;
    }
}
