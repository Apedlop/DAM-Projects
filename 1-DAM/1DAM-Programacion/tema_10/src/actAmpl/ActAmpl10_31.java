package actAmpl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ActAmpl10_31 {

    public static Cliente[] clientes = new Cliente[0]; // Array inicial vacío

    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        cargarClientesDesdeArchivo();

        Scanner sc = new Scanner(System.in);

        int opcion;

        do {

            System.out.println("1. Alta cliente");
            System.out.println("2. Baja cliente");
            System.out.println("3. Listar clientes");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    altaCliente();
                    break;

                case 2:
                    bajaCliente();
                    break;

                case 3:
                    ordenarClientesPorDni(); // Ordenar los clientes por DNI
                    listarClientes();
                    break;

                case 4:
                    guardarClientesEnArchivo();
                    break;

            }

        } while (opcion != 4);

    }

    private static void altaCliente() {

        System.out.print("Ingrese el DNI: ");
        String dni = sc.next();

        System.out.print("Ingrese el nombre completo: ");
        String nombreCompleto = sc.next();

        System.out.print("Ingrese la fecha de nacimiento (dd/mm/yyyy): ");
        String fechaNacimiento = sc.next();

        System.out.print("Ingrese el saldo: ");
        double saldo = sc.nextDouble();

        Cliente cliente = new Cliente(dni, nombreCompleto, fechaNacimiento, saldo);
        
        Cliente[] temp = new Cliente[clientes.length + 1]; // Nuevo array con una posición más
        System.arraycopy(clientes, 0, temp, 0, clientes.length); // Copiar elementos al nuevo array
        temp[clientes.length] = cliente; // Añadir el cliente al final del nuevo array
        clientes = temp; // Actualizar referencia al nuevo array

        sc.nextLine(); // Consume la nueva línea

        System.out.println("Cliente dado de alta correctamente.");

    }

    private static void bajaCliente() {

        System.out.print("Ingrese el DNI del cliente a dar de baja: ");
        String dni = sc.next();

        int indiceClienteABorrar = -1;

        for (int i = 0; i < clientes.length; i++) {

            if (clientes[i].getDni().equals(dni)) {
                indiceClienteABorrar = i;
            }

        }

        if (indiceClienteABorrar != -1) {

            // Mover todos los clientes después del cliente a borrar un lugar hacia adelante
            // en el array
            System.arraycopy(clientes, indiceClienteABorrar + 1, clientes, indiceClienteABorrar, clientes.length - indiceClienteABorrar - 1);

            Cliente[] temp = new Cliente[clientes.length - 1]; // Nuevo array con una posición menos

            System.arraycopy(clientes, 0, temp, 0, temp.length); // Copiar elementos al nuevo array

            clientes = temp; // Actualizar referencia al nuevo array

            System.out.println("Cliente dado de baja correctamente.");

        } else {

            System.out.println("Cliente no encontrado.");

        }

    }

    private static void listarClientes() {

        if (clientes.length == 0) {
            System.out.println("No hay clientes registrados.");
        }

        System.out.println("Listado de clientes:");

        for (int i = 0; i < clientes.length; i++) {
            System.out.println(clientes[i]);
        }

    }

    private static void cargarClientesDesdeArchivo() {

        try (BufferedReader in = new BufferedReader(new FileReader("Clientes.txt"))) {

            String linea;

            while ((linea = in.readLine()) != null) {

                String[] campos = linea.split(",");

                if (campos.length == 4) { // Asegurarse de que haya 4 campos en la línea

                    String dni = campos[0];
                    String nombreCompleto = campos[1];
                    String fechaNacimiento = campos[2];
                    double saldo = Double.parseDouble(campos[3]);

                    Cliente cliente = new Cliente(dni, nombreCompleto, fechaNacimiento, saldo);
                    Cliente[] temp = new Cliente[clientes.length + 1]; // Nuevo array con una posición más

                    System.arraycopy(clientes, 0, temp, 0, clientes.length); // Copiar elementos al nuevo array

                    temp[clientes.length] = cliente; // Añadir el cliente al final del nuevo array
                    clientes = temp; // Actualizar referencia al nuevo array

                } else {

                    System.out.println("Error en el formato de la línea: " + linea);

                }

            }

        } catch (IOException ex) {

            System.out.println(ex.getMessage());

        }

    }

    private static void guardarClientesEnArchivo() {

        try (BufferedWriter out = new BufferedWriter(new FileWriter("Clientes.txt"))) {

            for (int i = 0; i < clientes.length; i++) {
                Cliente cliente = clientes[i];
                out.write(cliente.getDni() + "," + cliente.getNombreCompleto() + "," + cliente.getFechaNacimiento() + "," + cliente.getSaldo() + "\n");
            }

        } catch (IOException ex) {

            System.out.println(ex.getMessage());

        }

    }

    private static void ordenarClientesPorDni() {
    	
        // Implementar algoritmo de ordenamiento para ordenar los clientes por DNI
        for (int i = 0; i < clientes.length - 1; i++) {
        	
            for (int j = 0; j < clientes.length - i - 1; j++) {
            	
                if (clientes[j].getDni().compareTo(clientes[j + 1].getDni()) > 0) {
                    Cliente temp = clientes[j];
                    clientes[j] = clientes[j + 1];
                    clientes[j + 1] = temp;
                }
                
            }
            
        }
        
    }

}
