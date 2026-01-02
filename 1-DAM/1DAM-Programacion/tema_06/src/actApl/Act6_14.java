package actApl;

import java.util.Arrays;
import java.util.Scanner;

public class Act6_14 {

    static Scanner sc = new Scanner(System.in);

    static void añadir(String[][] contactos) {
    	
        System.out.println("Introduce el nombre del contacto:");
        String nombre = sc.nextLine();
        
        System.out.println("Introduce el teléfono del contacto:");
        String teléfono = sc.nextLine();

        for (int i = 0; i < contactos.length; i++) {
        	
            if (contactos[i][0] == null) {
                contactos[i][0] = nombre;
                contactos[i][1] = teléfono;
                return; // Salir del método después de añadir un contacto
            }
            
        }
        
        System.out.println("No se pudo añadir el contacto. La agenda está llena.");
        
    }

    static void buscar(String[][] contactos) {
    	
        System.out.println("Introduce el nombre del contacto que deseas buscar:");
        String nombre = sc.nextLine();

        for (int i = 0; i < contactos.length; i++) {
        	
            if (contactos[i][0] != null && contactos[i][0].equals(nombre)) {
                System.out.println("Teléfono: " + contactos[i][1]);
                return;
            }
            
        }

        System.out.println("No se ha encontrado ningún contacto con ese nombre.");
    }

    static void mostrar(String[][] contactos) {
    	
    	Arrays.sort(contactos);
    	
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i][0] != null) {
                System.out.println(contactos[i][0] + ": " + contactos[i][1]);
            }
        }
    }

    public static void main(String[] args) {
        String[][] contactos = new String[10][2];
        int opcion;

        do {
            System.out.println("\n1) Añadir un nuevo contacto");
            System.out.println("2) Buscar teléfono");
            System.out.println("3) Mostrar la información de todos los contactos");
            System.out.println("4) Salir");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    añadir(contactos);
                    break;
                case 2:
                    buscar(contactos);
                    break;
                case 3:
                    mostrar(contactos);
                    break;
                case 4:
                    System.out.println("Saliendo de la agenda. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
            }

        } while (opcion != 4);
    }
}
