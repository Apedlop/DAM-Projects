package proyecBiblioteca;

public class Libro extends Publicacion implements Prestar {
	public boolean prestado;
	public String autor;

	public Libro(String codigo, String titulo, int anioPublicacion, String autor) {
		super(codigo, titulo, anioPublicacion);
		this.autor = autor;
		this.prestado = false;
	}

	@Override
	public void prestar() {
		prestado = true;
	}

	@Override
	public void devolver() {
		prestado = false;
	}

	@Override
	public boolean prestado() {
		return prestado;
	}

	@Override
	public String toString() {
		return super.toString() + ", Autor: " + autor + ", Prestado: " + (prestado ? "Sí" : "No");
	}
}
