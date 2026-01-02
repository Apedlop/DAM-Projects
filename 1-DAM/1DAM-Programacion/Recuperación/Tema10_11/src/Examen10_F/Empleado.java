package Examen10_F;

public class Empleado implements Comparable{
	String nombre;
	int edad;
	String departamento;
	Integer salario;
	
	public Empleado(String nombre, int edad, String departamento, Integer salario) {
		this.nombre=nombre;
		this.edad=edad;
		this.departamento=departamento;
		this.salario=salario;
	}

	@Override
	public int compareTo(Object o) {
		return nombre.compareTo(((Empleado)o).nombre);
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + ", departamento=" + departamento + ", salario="
				+ salario + "]";
	}
	
	
}
