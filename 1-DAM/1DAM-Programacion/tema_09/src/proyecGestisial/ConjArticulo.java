package proyecGestisial;

public class ConjArticulo {

    private Articulo[] articulos;
    private int cantidadArt;

    public ConjArticulo(int capacidadMaxima) {
        articulos = new Articulo[capacidadMaxima];
        cantidadArt = 0;
    }

    public void alta(Articulo articulo) {
        if (cantidadArt < articulos.length) {
            articulos[cantidadArt] = articulo;
            cantidadArt++;
            System.out.println("Artículo dado de alta correctamente.");
        } else {
            System.out.println("No se puede dar de alta, capacidad máxima alcanzada.");
        }
    }

    public void baja(int codigo) {
        int indice = buscarIndice(codigo);
        if (indice != -1) {
            for (int i = indice; i < cantidadArt - 1; i++) {
                articulos[i] = articulos[i + 1];
            }
            cantidadArt--;
            System.out.println("Artículo dado de baja correctamente.");
        } else {
            System.out.println("No se encuentra el artículo con código " + codigo + ".");
        }
    }

    public void modificacion(int codigo, Articulo nuevoArticulo) {
        int indice = buscarIndice(codigo);
        if (indice != -1) {
            articulos[indice] = nuevoArticulo;
            System.out.println("Artículo modificado correctamente.");
        } else {
            System.out.println("No se encuentra el artículo con código " + codigo + ".");
        }
    }

    public void entradaMercancia(int codigo, int cantidad) {
        int indice = buscarIndice(codigo);
        if (indice != -1) {
            articulos[indice].setStock(articulos[indice].getStock() + cantidad);
            System.out.println("Entrada de mercancía registrada correctamente.");
        } else {
            System.out.println("No se encuentra el artículo con código " + codigo + ".");
        }
    }

    public void salidaMercancia(int codigo, int cantidad) {
        int indice = buscarIndice(codigo);
        if (indice != -1) {
            if (articulos[indice].getStock() >= cantidad) {
                articulos[indice].setStock(articulos[indice].getStock() - cantidad);
                System.out.println("Salida de mercancía registrada correctamente.");
            } else {
                System.out.println("No hay suficiente stock para realizar la salida de mercancía.");
            }
        } else {
            System.out.println("No se encuentra el artículo con código " + codigo + ".");
        }
    }

    private int buscarIndice(int codigo) {
        for (int i = 0; i < cantidadArt; i++) {
            if (articulos[i].getCodigo() == codigo) {
                return i;
            }
        }
        return -1;
    }

    public void listado() {
        System.out.println("Listado de artículos:");
        for (int i = 0; i < cantidadArt; i++) {
            System.out.println(articulos[i]);
        }
    }
}
