package actExtra1;

public class Asignatura {

	int codigo;
	String asignatura;
	
	public Asignatura(int codigo, String asignatura) {
		this.codigo = codigo;
		this.asignatura = asignatura;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	
}
