package actAmp8_28;

public class Suceso {

	private int tiempo;
	private String descripcion;

	public Suceso(int x, int y, int z, int tiempo, String descripcion) {
		
		super();
		this.tiempo = tiempo;
		this.descripcion = descripcion;
		
	}

	public int getTiempo() {
		
		return tiempo;
		
	}

	public String getDescripcion() {
		
		return descripcion;
		
	}

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj) {
			return true;
		}
		
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}

		Suceso suceso = (Suceso) obj;

		if (tiempo != suceso.tiempo) {
			return false;
		}
		
		if (descripcion != null ? !descripcion.equals(suceso.descripcion) : suceso.descripcion != null) {
			return false;
		}

		return super.equals(obj);
		
	}

	@Override
	public int hashCode() {
		
		int result = super.hashCode();
		
		result = 31 * result + tiempo;
		result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
		
		return result;
	}

	@Override
	public String toString() {
		
		return super.toString() + ", Tiempo: " + tiempo + ", Descripción: " + descripcion;
		
	}

}
