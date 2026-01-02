package boletin;

import java.util.Scanner;

public class ActBol5_7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vector = new int[10];
        int longitud = 0;

        int opcion;
        do {
            System.out.println("\n1. Insertar elemento");
            System.out.println("2. Modificar elemento");
            System.out.println("3. Eliminar elemento");
            System.out.println("4. Listar elementos");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    if (longitud < vector.length) {
                        System.out.print("Introduce el nuevo elemento a insertar: ");
                        int nuevoElemento = scanner.nextInt();
                        insertarElemento(vector, nuevoElemento, longitud);
                        longitud++;
                        System.out.println("Elemento insertado correctamente.");
                    } else {
                        System.out.println("El vector está lleno. No se puede insertar más elementos.");
                    }
                    break;
                case 2:
                    if (longitud > 0) {
                        System.out.print("Introduce la posición del elemento a modificar (1-" + longitud + "): ");
                        int posicionModificar = scanner.nextInt();
                        if (posicionModificar >= 1 && posicionModificar <= longitud) {
                            System.out.print("Introduce el nuevo valor: ");
                            int nuevoValor = scanner.nextInt();
                            modificarElemento(vector, posicionModificar, nuevoValor);
                            System.out.println("Elemento modificado correctamente.");
                        } else {
                            System.out.println("Posición inválida.");
                        }
                    } else {
                        System.out.println("El vector está vacío. No hay elementos para modificar.");
                    }
                    break;
                case 3:
                    if (longitud > 0) {
                        System.out.print("Introduce la posición del elemento a eliminar (1-" + longitud + "): ");
                        int posicionEliminar = scanner.nextInt();
                        if (posicionEliminar >= 1 && posicionEliminar <= longitud) {
                            eliminarElemento(vector, posicionEliminar, longitud);
                            longitud--;
                            System.out.println("Elemento eliminado correctamente.");
                        } else {
                            System.out.println("Posición inválida.");
                        }
                    } else {
                        System.out.println("El vector está vacío. No hay elementos para eliminar.");
                    }
                    break;
                case 4:
                    if (longitud > 0) {
                        System.out.println("Elementos en el vector:");
                        listarElementos(vector, longitud);
                    } else {
                        System.out.println("El vector está vacío.");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }

    // Método para insertar un nuevo elemento en su posición manteniendo el orden.
    private static void insertarElemento(int[] vector, int nuevoElemento, int longitud) {
        int i = longitud - 1;
        while (i >= 0 && vector[i] > nuevoElemento) {
            vector[i + 1] = vector[i];
            i--;
        }
        vector[i + 1] = nuevoElemento;
    }

    // Método para modificar el contenido de una posición existente.
    private static void modificarElemento(int[] vector, int posicion, int nuevoValor) {
        vector[posicion - 1] = nuevoValor;
    }

    // Método para eliminar un elemento eligiendo previamente su posición.
    private static void eliminarElemento(int[] vector, int posicion, int longitud) {
        for (int i = posicion - 1; i < longitud - 1; i++) {
            vector[i] = vector[i + 1];
        }
    }

    // Método para listar los elementos del vector.
    private static void listarElementos(int[] vector, int longitud) {
        for (int i = 0; i < longitud; i++) {
            System.out.println((i + 1) + ". " + vector[i]);
        }
    }
}
