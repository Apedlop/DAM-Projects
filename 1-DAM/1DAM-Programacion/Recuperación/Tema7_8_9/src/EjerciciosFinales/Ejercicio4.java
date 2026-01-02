package EjerciciosFinales;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Inventario i = new Inventario();
        int opcion;

        do {
            System.out.println("1. Listado");
            System.out.println("2. Alta");
            System.out.println("3. Baja");
            System.out.println("4. Modificación");
            System.out.println("5. Entrada de mercancía");
            System.out.println("6. Salida de mercancía");
            System.out.println("7. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    i.listar();
                    break;
                case 2:
                    System.out.println("Descripción del artículo: ");
                    String descripcion = sc.next();
                    System.out.println("Precio del artículo: ");
                    double precio = sc.nextDouble();
                    System.out.println("Stock del artículo: ");
                    int stock = sc.nextInt();
                    Articulo a = new Articulo(descripcion, precio, stock);
                    i.insertar(a);
                    break;
                case 3:
                    System.out.println("Introduce el código del artículo: ");
                    int codigo = sc.nextInt();
                    i.baja(codigo);
                    break;
                case 4:
                    System.out.println("Introduce el código del artículo: ");
                    codigo = sc.nextInt();
                    i.modificacion(codigo);
                    break;
                case 5:
                    System.out.println("Introduce el código del producto: ");
                    codigo = sc.nextInt();
                    i.entradaMercancia(codigo);
                    break;
                case 6:
                    System.out.println("Introduce el código del producto: ");
                    codigo = sc.nextInt();
                    i.salidaMercancia(codigo);
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Introduce una opción válida.");
            }
        } while (opcion != 7);

    }

}

class Inventario {

    Scanner sc = new Scanner(System.in);
    Articulo[] articulos;

    public Inventario() {
        this.articulos = new Articulo[0];
    }

    public void listar() {
        for (int i = 0; i < articulos.length; i++) {
            System.out.println(articulos[i]);
        }
    }

    public void insertar(Articulo articulo) {
        Articulo[] articuloNuevo = Arrays.copyOf(articulos, articulos.length + 1);
        articuloNuevo[articuloNuevo.length - 1] = articulo;
        articulos = articuloNuevo;
        System.out.println("Artículo insertado correctamente.");
    }

    public void baja(int codigo) {
        for (int i = 0; i < articulos.length; i++) {
            if (articulos[i].getCodigo() == codigo) {
                for (int j = 0; j < articulos.length - 1; j++) {
                    articulos[j] = articulos[j + 1];
                }
                articulos = Arrays.copyOf(articulos, articulos.length - 1);
                System.out.println("Articulo borrado correctamente.");
                return;
            }
        }
        System.out.println("No se ha encontrado ningún artículo con ese código.");
    }

    public void modificacion(int codigo) {
        boolean encontrado = false;
        for (int i = 0; i < articulos.length; i++) {
            if (articulos[i].getCodigo() == codigo) {
                System.out.println("Introduce la nueva descripción del artículo: ");
                String descripcion = sc.next();
                System.out.println("Introduce el nuevo precio del artículo: ");
                double precio = sc.nextDouble();
                System.out.println("Introduce el nuevo stock del artículo: ");
                int stock = sc.nextInt();
                articulos[i].setDescripcion(descripcion);
                articulos[i].setPrecio(precio);
                articulos[i].setStock(stock);
                System.out.println("Artículo modificado correctamente.");
                encontrado = true;
                break; // Salir del bucle porque ya se encontró y modificó el artículo
            }
        }
        if (!encontrado) {
            System.out.println("El código no existe o no ha sido encontrado.");
        }
    }

    public void entradaMercancia(int codigo) {
        for (int i = 0; i < articulos.length; i++) {
            if (articulos[i].getCodigo() == codigo) {
                System.out.println("Introduce cuanta mercancía entra nueva: ");
                int nuevaMercancia = sc.nextInt();
                int stockActual = articulos[i].getStock();
                articulos[i].setStock(stockActual + nuevaMercancia);
                System.out.println("Stock actualizado: " + articulos[i].getStock());
                return; // Salir del método después de actualizar el stock
            } else {
                System.out.println("El código no existe o no se encuantra.");
            }
        }
    }

    public void salidaMercancia(int codigo) {
        for (int i = 0; i < articulos.length; i++) {
            if (articulos[i].getCodigo() == codigo) {
                System.out.println("Introduce cuanta mercancía quiere retirar: ");
                int retirarMercancia = sc.nextInt();
                if (retirarMercancia <= articulos[i].getStock()) {
                    int stockActual = articulos[i].getStock();
                    articulos[i].setStock(stockActual - retirarMercancia);
                    System.out.println("Stock actualizado: " + articulos[i].getStock());
                    return;
                } else {
                    System.out.println("No se ha podido retirar la mercancía. Supera el stock.");
                }
            } else {
                System.out.println("No se ha podido encontrar el código.");
            }
        }
    }


}

class Articulo {

    static int contador = 1;
    int codigo;
    String descripcion;
    double precio;
    int stock;

    public Articulo(String descripcion, double precio, int stock) {
        this.codigo = contador++;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String toString() {
        return "Código: " + codigo + ", Descripción: " + descripcion + ", Precio: " + precio + ", Stock: " + stock;
    }

}
