package EjerciciosFinales;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        int opcion;

        do {
            System.out.println("1. Insertar libro");
            System.out.println("2. Insertar revista");
            System.out.println("3. Eliminar libro");
            System.out.println("4. Consultar datos libro");
            System.out.println("5. Prestar libro");
            System.out.println("6. Listado de publicaciones ordenadas por código");
            System.out.println("7. Listado de libros prestados");
            System.out.println("8. Listado de libros no prestados");
            System.out.println("9. Listado de libros ordenados por autor");
            System.out.println("10. Consultar número de publicaciones existentes");
            System.out.println("11. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Código: ");
                    int codigo = sc.nextInt();
                    System.out.println("Título: ");
                    String titulo = sc.next();
                    System.out.println("Año de publicación: ");
                    int año = sc.nextInt();
                    System.out.println("Autor: ");
                    String autor = sc.next();
                    Libro libro = new Libro(codigo, titulo, año, autor);
                    biblioteca.insertarLibro(libro);
                    break;
                case 2:
                    System.out.println("Código: ");
                    codigo = sc.nextInt();
                    System.out.println("Título: ");
                    titulo = sc.next();
                    System.out.println("Año de publicación: ");
                    año = sc.nextInt();
                    System.out.println("Número: ");
                    int numero = sc.nextInt();
                    Revistas revista = new Revistas(codigo, titulo, año, numero);
                    biblioteca.insertarRevista(revista);
                    break;
                case 3:
                    System.out.println("Introduce el código: ");
                    codigo = sc.nextInt();
                    biblioteca.eliminarLibro(codigo);
                    break;
                case 4:
                    System.out.println("Introduce el código: ");
                    codigo = sc.nextInt();
                    biblioteca.mostrarDatos(codigo);
                    break;
                case 5:
                    System.out.println("Introduce el código: ");
                    codigo = sc.nextInt();
                    biblioteca.prestarLibro(codigo);
                    break;
                case 6:
                    biblioteca.listadoPublicaciones();
                    break;
                case 7:
                    biblioteca.listadoPrestados();
                    break;
                case 8:
                    biblioteca.listadoNoPrestados();
                    break;
                case 9:
                    biblioteca.listadoAutor();
                    break;
                case 10:
                    biblioteca.numPublicaciones();
                    break;
                case 11:
                    break;
                default:
                    System.out.println("Introduce un número válido.");
            }
        } while (opcion != 11);

    }

}

class Biblioteca {
    Libro[] libros;
    Revistas[] revistas;

    public Biblioteca() {
        this.libros = new Libro[0];
        this.revistas = new Revistas[0];
    }

    public void insertarLibro(Libro libro) {
        // Verificar si el libro ya existe en la biblioteca
        for (int i = 0; i < libros.length; i++) {
            if (libros[i].getCodigo() == libro.getCodigo()) {
                System.out.println("Ya existe un libro con el mismo código en la biblioteca.");
                return; // Salir del método si se encuentra un libro con el mismo código
            }
        }
        // Verificar si el código del libro ya está siendo utilizado por una revista
        for (int i = 0; i < revistas.length; i++) {
            if (revistas[i].getCodigo() == libro.getCodigo()) {
                System.out.println("Ya existe una revista con el mismo código en la biblioteca.");
                return; // Salir del método si se encuentra una revista con el mismo código
            }
        }
        // Si el libro no existe en la biblioteca, agregarlo
        Libro[] libroNuevo = Arrays.copyOf(libros, libros.length + 1); // Aumentamos la capacidad del Array
        libroNuevo[libroNuevo.length - 1] = libro; // Añadimos el libro en el último espacio libre
        libros = libroNuevo; // Asignamos al nuevo array al array de biblioteca
        System.out.println("Libro insertado correctamente.");
    }

    public void insertarRevista(Revistas revista) {
        // Verificar si la revista ya existe en la biblioteca
        for (int i = 0; i < revistas.length; i++) {
            if (revistas[i].getCodigo() == revista.getCodigo()) {
                System.out.println("Ya existe una revista con el mismo código en la biblioteca.");
                return; // Salir del método si se encuentra una revista con el mismo código
            }
        }
        // Verificar si el código de la revista ya está siendo utilizado por un libro
        for (int i = 0; i < libros.length; i++) {
            if (libros[i].getCodigo() == revista.getCodigo()) {
                System.out.println("Ya existe un libro con el mismo código en la biblioteca.");
                return; // Salir del método si se encuentra un libro con el mismo código
            }
        }
        // Si la revista no existe en la biblioteca, agregarla
        Revistas[] revistaNueva = Arrays.copyOf(revistas, revistas.length + 1); // Aumentamos la capacidad del Array
        revistaNueva[revistaNueva.length - 1] = revista; // Añadimos la revista en el último espacio libre
        revistas = revistaNueva; // Asignamos al nuevo array al array de biblioteca
        System.out.println("Revista insertada correctamente.");
    }

    public void eliminarLibro(int codigo) {
        for (int i = 0; i < libros.length; i++) {
            if (libros[i].getCodigo() == codigo) {
                // Eliminar el libro del array
                for (int j = i; j < libros.length - 1; j++) {
                    libros[j] = libros[j + 1]; // Mover todos los libros posteriores un índice hacia atrás
                }
                // Redimensionar el array para eliminar la última posición vacía
                libros = Arrays.copyOf(libros, libros.length - 1);
                System.out.println("Libro eliminado correctamente.");
                return; // Salir del método una vez que se elimina el libro
            }
        }
        System.out.println("No se ha encontrado ninugún libro con ese código.");
    }

    public void mostrarDatos(int codigo) {
        for (int i = 0; i < libros.length; i++) {
            if (libros[i].getCodigo() == codigo) {
                System.out.println(libros[i]);
                return;
            } else {
                System.out.println("No se ha encontrado el libro.");
            }
        }
    }

    public void prestarLibro(int codigo) {
        for (int i = 0; i < libros.length; i++) {
            if (libros[i].getCodigo() == codigo) {
                libros[i].presta();
                System.out.println("El libro ha sido prestado.");
                return;
            } else {
                System.out.println("No se ha encontrado el libro.");
            }
        }
    }

    public void listadoPublicaciones() {
        Publicacion[] publicaciones = new Publicacion[libros.length + revistas.length];
        System.arraycopy(libros, 0, publicaciones, 0, libros.length);
        System.arraycopy(revistas, 0, publicaciones, libros.length, revistas.length);
        // Ordenar el array de publicaciones según el código
        Arrays.sort(publicaciones, new Comparator<Publicacion>() {
            @Override
            public int compare(Publicacion p1, Publicacion p2) {
                return Integer.compare(p1.getCodigo(), p2.getCodigo());
            }
        });
        // Imprimir las publicaciones ordenadas
        for (int i = 0; i < publicaciones.length; i++) {
            System.out.println(publicaciones[i]);
        }
    }

    public void listadoPrestados() {
        for (int i = 0; i < libros.length; i++) {
            if (libros[i].prestado()) {
                System.out.println(libros[i]);
            }
        }
    }

    public void listadoNoPrestados() {
        for (int i = 0; i < libros.length; i++) {
            if (!libros[i].prestado()) {
                System.out.println(libros[i]);
            }
        }
    }

    public void listadoAutor() {
        Arrays.sort(libros, new Comparator<Libro>() {
            @Override
            public int compare(Libro o1, Libro o2) {
                return o1.getAutor().compareTo(o2.getAutor());
            }
        });
        for (int i = 0; i < libros.length; i++) {
            System.out.println(libros[i]);
        }
    }

    public void numPublicaciones() {
        System.out.println("Hay una cantidad de " + (libros.length + revistas.length) + " publicaciones.");
    }

}

class Libro extends Publicacion implements Prestable, Comparable<Libro> {
    boolean prestado;
    String autor;

    public Libro(int codigo, String titulo, int año, String autor) {
        super(codigo, titulo, año);
        this.prestado = false;
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public String toString() {
        return "Código: " + codigo + ", Título: " + titulo + ", Año: " + año + ", Autor: " + autor + ", Prestado: " + isPrestado();
    }

    @Override
    public void presta() {
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
    public int compareTo(Libro o) {
        return Integer.compare(this.getCodigo(), o.getCodigo());
    }
}

class Revistas extends Publicacion implements Comparable<Revistas> {

    int numero;

    public Revistas(int codigo, String titulo, int año, int numero) {
        super(codigo, titulo, año);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public String toString() {
        return "Código: " + codigo + ", Título: " + titulo + ", Año: " + año + ", Número: " + numero;
    }

    @Override
    public int compareTo(Revistas o) {
        return Integer.compare(this.getCodigo(), o.getCodigo());
    }
}

class Publicacion {
    int codigo;
    String titulo;
    int año;

    public Publicacion(int codigo, String titulo, int año) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.año = año;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAño() {
        return año;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String toString() {
        return "Código: " + codigo + ", Título: " + titulo + ", Año de publicación: " + año;
    }
}

interface Prestable {
    void presta();
    void devolver();
    boolean prestado();
}