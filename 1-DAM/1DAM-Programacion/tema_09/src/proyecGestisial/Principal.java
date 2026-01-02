package proyecGestisial;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConjArticulo conjuntoArticulo = new ConjArticulo(100); // Capacidad máxima de 100 artículos

        int opcion;
        do {
            System.out.println("\n1. Listado");
            System.out.println("2. Alta");
            System.out.println("3. Baja");
            System.out.println("4. Modificación");
            System.out.println("5. Entrada de mercancía");
            System.out.println("6. Salida de mercancía");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    conjuntoArticulo.listado();
                    break;
                case 2:
                    Articulo nuevoArticulo = Articulo.pedirDatos();
                    conjuntoArticulo.alta(nuevoArticulo);
                    break;
                case 3:
                    System.out.print("Introduce el código del artículo a dar de baja: ");
                    int codigoBaja = sc.nextInt();
                    conjuntoArticulo.baja(codigoBaja);
                    break;
                case 4:
                    System.out.print("Introduce el código del artículo a modificar: ");
                    int codigoModificacion = sc.nextInt();
                    sc.nextLine(); // Limpiar el buffer
                    Articulo nuevoArticuloModificado = Articulo.pedirDatos();
                    conjuntoArticulo.modificacion(codigoModificacion, nuevoArticuloModificado);
                    break;
                case 5:
                    System.out.print("Introduce el código del artículo: ");
                    int codigoEntrada = sc.nextInt();
                    System.out.print("Introduce la cantidad de mercancía a entrar: ");
                    int cantidadEntrada = sc.nextInt();
                    conjuntoArticulo.entradaMercancia(codigoEntrada, cantidadEntrada);
                    break;
                case 6:
                    System.out.print("Introduce el código del artículo: ");
                    int codigoSalida = sc.nextInt();
                    System.out.print("Introduce la cantidad de mercancía a salir: ");
                    int cantidadSalida = sc.nextInt();
                    conjuntoArticulo.salidaMercancia(codigoSalida, cantidadSalida);
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Introduce un número del 1 al 7.");
            }
        } while (opcion != 7);
    }
}
