package actApl;

import java.io.*;
import java.util.Scanner;

public class ActApl10_21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion;
        String[][] contactos = new String[20][2];

        cargarAgenda(contactos);

        do {

            System.out.println("\n1. Nuevo contacto");
            System.out.println("2. Buscar por nombre");
            System.out.println("3. Mostrar todos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    nuevoContacto(sc, contactos);
                    break;

                case 2:
                    buscarPorNombre(sc, contactos);
                    break;

                case 3:
                    mostrarTodos(contactos);
                    break;

                case 4:
                    guardarAgenda(contactos);
                    System.out.println("¡Hasta luego!");
                    break;
            }

        } while (opcion != 4);

    }

    public static void nuevoContacto(Scanner sc, String[][] contactos) {

        int totalContactos = 0;

        for (int i = 0; i < contactos.length; i++) {
        	
            if (contactos[i][0] != null) {
                totalContactos++;
            }
            
        }

        if (totalContactos >= 20) {
            System.out.println("La agenda está llena. No se pueden agregar más contactos.");
            return;
        }

        System.out.print("Introduce el nombre del nuevo contacto: ");
        String nombre = sc.nextLine();

        for (int i = 0; i < contactos.length; i++) {

            if (contactos[i][0] != null && contactos[i][0].equalsIgnoreCase(nombre)) {
                System.out.println("El contacto ya existe en la agenda.");
                return;
            }

        }

        System.out.print("Introduce el teléfono: ");
        String telefono = sc.nextLine();

        for (int i = 0; i < contactos.length; i++) {

            if (contactos[i][0] == null) {
                contactos[i][0] = nombre;
                contactos[i][1] = telefono;
                System.out.println("Contacto añadido correctamente.");
                return;
            }

        }
        
    }

    public static void buscarPorNombre(Scanner sc, String[][] contactos) {

        System.out.print("Introduce el nombre a buscar: ");
        String busqueda = sc.nextLine().toLowerCase();

        boolean encontrado = false;

        for (int i = 0; i < contactos.length; i++) {

            if (contactos[i][0] != null && contactos[i][0].toLowerCase().contains(busqueda)) {
                System.out.println("Nombre: " + contactos[i][0] + ", Teléfono: " + contactos[i][1]);
                encontrado = true;
            }

        }

        if (!encontrado) {
            System.out.println("No se encontraron contactos con ese nombre.");
        }

    }

    public static void mostrarTodos(String[][] contactos) {

        boolean agendaVacia = true;

        for (int i = 0; i < contactos.length; i++) {

            if (contactos[i][0] != null) {
                agendaVacia = false;
                System.out.println("Nombre: " + contactos[i][0] + ", Teléfono: " + contactos[i][1]);
            }

        }

        if (agendaVacia) {
            System.out.println("La agenda está vacía.");
        }

    }

    public static void cargarAgenda(String[][] contactos) {

        try (BufferedReader in = new BufferedReader(new FileReader("Agenda.txt"))) {

            String linea;
            int index = 0;

            while ((linea = in.readLine()) != null && index < 20) {
                String[] partes = linea.split(":");
                contactos[index][0] = partes[0];
                contactos[index][1] = partes[1];
                index++;
            }

        } catch (IOException ex) {

            System.out.println("Error al cargar la agenda: " + ex.getMessage());

        }

    }

    public static void guardarAgenda(String[][] contactos) {

        try (BufferedWriter out = new BufferedWriter(new FileWriter("Agenda.txt"))) {

            for (int i = 0; i < contactos.length; i++) {

                if (contactos[i][0] != null) {
                    out.write(contactos[i][0] + ":" + contactos[i][1]);
                    out.newLine();
                }

            }

        } catch (IOException ex) {

            System.out.println("Error al guardar la agenda: " + ex.getMessage());

        }
        
    }
    
}
