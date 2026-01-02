package proyecBiblioteca;

import java.util.Arrays;
import java.util.Comparator;

public class Biblioteca {

    private Publicacion[] publicaciones;
    private int cantidadPublicaciones;

    public Biblioteca(int capacidad) {
        this.publicaciones = new Publicacion[capacidad];
        this.cantidadPublicaciones = 0;
    }

    public void insertarLibro(String codigo, String titulo, int anioPublicacion, String autor) {
        if (cantidadPublicaciones < publicaciones.length) {
            publicaciones[cantidadPublicaciones++] = new Libro(codigo, titulo, anioPublicacion, autor);
            Arrays.sort(publicaciones, 0, cantidadPublicaciones, Comparator.comparing(Publicacion::getCodigo));
        } else {
            System.out.println("La biblioteca está llena, no se puede insertar más libros.");
        }
    }

    public void insertarRevista(String codigo, String titulo, int anioPublicacion, int numero) {
        if (cantidadPublicaciones < publicaciones.length) {
            publicaciones[cantidadPublicaciones++] = new Revista(codigo, titulo, anioPublicacion, numero);
            Arrays.sort(publicaciones, 0, cantidadPublicaciones, Comparator.comparing(Publicacion::getCodigo));
        } else {
            System.out.println("La biblioteca está llena, no se puede insertar más revistas.");
        }
    }

    public void eliminarLibro(String codigo) {
        for (int i = 0; i < cantidadPublicaciones; i++) {
            if (publicaciones[i].getCodigo().equals(codigo)) {
                for (int j = i; j < cantidadPublicaciones - 1; j++) {
                    publicaciones[j] = publicaciones[j + 1];
                }
                cantidadPublicaciones--;
                System.out.println("Libro eliminado correctamente.");
                return;
            }
        }
        System.out.println("No se encontró ningún libro con ese código.");
    }

    public void consultarDatosLibro(String codigo) {
        for (int i = 0; i < cantidadPublicaciones; i++) {
            if (publicaciones[i] instanceof Libro && publicaciones[i].getCodigo().equals(codigo)) {
                System.out.println(publicaciones[i]);
                return;
            }
        }
        System.out.println("No se encontró ningún libro con ese código.");
    }

    public void listarPublicacionesOrdenadasPorCodigo() {
        for (int i = 0; i < cantidadPublicaciones; i++) {
            System.out.println(publicaciones[i]);
        }
    }

    public void listarLibrosPrestados() {
        for (int i = 0; i < cantidadPublicaciones; i++) {
            if (publicaciones[i] instanceof Libro && ((Libro) publicaciones[i]).prestado()) {
                System.out.println(publicaciones[i]);
            }
        }
    }

    public void listarLibrosNoPrestados() {
        for (int i = 0; i < cantidadPublicaciones; i++) {
            if (publicaciones[i] instanceof Libro && !((Libro) publicaciones[i]).prestado()) {
                System.out.println(publicaciones[i]);
            }
        }
    }

    public void listarLibrosOrdenadosPorAutor() {
        Arrays.sort(publicaciones, 0, cantidadPublicaciones, Comparator.comparing(p -> ((Libro) p).autor));
        for (int i = 0; i < cantidadPublicaciones; i++) {
            if (publicaciones[i] instanceof Libro) {
                System.out.println(publicaciones[i]);
            }
        }
    }

    public int consultarNumeroPublicaciones() {
        return cantidadPublicaciones;
    }


}
