package actExtra3;

public class Asignatura {

	String nombre;
	private double[] notas;

	public Asignatura(String nombre, double[] notas) {
		this.nombre = nombre;
		this.notas = notas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double[] getnotas() {
		return getNotas();
	}

	public void setnotas(double[] notas) {
		this.setNotas(notas);
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

}
