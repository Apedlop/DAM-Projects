package ejerAlt;

import java.io.*;
import java.util.*;

public class Ejercicio1 {

    private static final String FILENAME = "personas.dat";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Persona> personas = cargarPersonas();

        int opcion;

        do {
            System.out.println("1. Agregar nueva persona.");
            System.out.println("2. Eliminar persona.");
            System.out.println("3. Actualizar edad.");
            System.out.println("4. Mostrar lista completa.");
            System.out.println("5. Calcular y mostrar la edad promedio.");
            System.out.println("6. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    agregarPersona(sc, personas);
                    break;
                case 2:
                    eliminarPersona(sc, personas);
                    break;
                case 3:
                    actualizarEdad(sc, personas);
                    break;
                case 4:
                    mostrarLista(personas);
                    break;
                case 5:
                    mostrarEdadPromedio(personas);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    guardarPersonas(personas);
                    break;
                default:
                    System.out.println("Introduce un valor válido.");
                    break;
            }

        } while (opcion != 6);

        sc.close();
    }

    private static void agregarPersona(Scanner sc, List<Persona> personas) {
        System.out.println("Nombre :");
        String nombre = sc.next();
        System.out.println("Edad: ");
        int edad = sc.nextInt();

        // Eliminar duplicados por nombre
        personas.add(new Persona(nombre, edad));
    }

    private static void eliminarPersona(Scanner sc, List<Persona> personas) {
        System.out.println("Nombre: ");
        String nombre = sc.next();
        Persona personaAEliminar = null;
        for (Persona p : personas) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                personaAEliminar = p;
                break;
            }
        }
        if (personaAEliminar != null) {
            personas.remove(personaAEliminar);
            System.out.println("Persona eliminada.");
        } else {
            System.out.println("No existe ninguna persona con ese nombre.");
        }
    }

    private static void actualizarEdad(Scanner sc, List<Persona> personas) {
        System.out.println("Nombre: ");
        String nombre = sc.next();
        Persona personaAActualizar = null;
        for (Persona p : personas) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                personaAActualizar = p;
                break;
            }
        }
        if (personaAActualizar != null) {
            System.out.println("Edad :");
            int edad = sc.nextInt();
            personaAActualizar.setEdad(edad);
            System.out.println("Edad actualizada.");
        } else {
            System.out.println("No existe ninguna persona con ese nombre.");
        }
    }

    private static void mostrarLista(List<Persona> personas) {
        SortedSet<Persona> setOrdenado = new TreeSet<>(Comparator.comparingInt(Persona::getEdad));
        setOrdenado.addAll(personas);
        for (Persona p : setOrdenado) {
            System.out.println(p);
        }
    }

    private static void mostrarEdadPromedio(List<Persona> personas) {
        if (personas.isEmpty()) {
            System.out.println("No hay personas en la lista.");
        } else {
            int sumaEdad = 0;
            for (Persona p : personas) {
                sumaEdad += p.getEdad();
            }
            System.out.println("Edad promedio: " + (double) sumaEdad / personas.size());
        }
    }

    private static void guardarPersonas(List<Persona> personas) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILENAME))) {
            oos.writeObject(personas);
        } catch (IOException e) {
            System.err.println("Error guardando las personas: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    private static List<Persona> cargarPersonas() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILENAME))) {
            return (List<Persona>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No se encontraron datos previos, iniciando con una lista vacía.");
            return new ArrayList<>();
        }
    }
}

class Persona implements Comparable<Persona>, Serializable {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public int compareTo(Persona o) {
        return Integer.compare(this.edad, o.edad);
    }
}
