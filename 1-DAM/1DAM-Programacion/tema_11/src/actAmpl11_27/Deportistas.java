package actAmpl11_27;

import java.io.Serializable;

public class Deportistas implements Serializable {

    String dni, nombre, fecha;
    Deporte deporte; // Agregar campo para almacenar el deporte del deportista

    public Deportistas(String dni, String nombre, String fecha, Deporte deporte) {
        this.dni = dni;
        this.fecha = fecha;
        this.nombre = nombre;
        this.deporte = deporte; // Inicializar el deporte
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public Deporte getDeporte() {
        return deporte;
    }

    public void setDeporte(Deporte deporte) {
        this.deporte = deporte;
    }

    @Override
	public String toString() {
		return "[dni=" + dni + ", nombre=" + nombre + ", fecha=" + fecha + ", deporte=" + deporte + "]";
	}

	public int compareTo(Deportistas otroDeportista) {
        return this.nombre.compareToIgnoreCase(otroDeportista.nombre);
    }
}
