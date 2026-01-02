package proyecBiblioteca;

public class Revista extends Publicacion {
    private int numero;

    public Revista(String codigo, String titulo, int anioPublicacion, int numero) {
        super(codigo, titulo, anioPublicacion);
        this.numero = numero;
    }

    @Override
    public String toString() {
        return super.toString() + ", Número: " + numero;
    }
}
