package proyecGestisial;

import java.util.Scanner;

public class Articulo {

    private int codigo;
    private String descripcion;
    private double precio;
    private int stock;

    public Articulo(int codigo, String descripcion, double precio, int stock) {
        this.codigo = codigo;
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

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String toString() {
        return "Código: " + codigo + "\nDescripción: " + descripcion + "\nPrecio: " + precio + "\nStock: " + stock;
    }

    public static Articulo pedirDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el código del artículo:");
        int codigo = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer
        System.out.println("Introduce la descripción del artículo:");
        String descripcion = sc.nextLine();
        System.out.println("Introduce el precio del artículo:");
        double precio = sc.nextDouble();
        System.out.println("Introduce el stock del artículo:");
        int stock = sc.nextInt();
        return new Articulo(codigo, descripcion, precio, stock);
    }
}
