package ActMoodle;
import java.io.*;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Ejercicio3 {
    private TreeSet<Estudiante> treeSetEstudiantes;
    private Map<String, Estudiante> mapEstudiantes;
    private final String filePath = "estudiantes.dat";

    public Ejercicio3() {
        treeSetEstudiantes = new TreeSet<>();
        mapEstudiantes = new TreeMap<>();
        leerEstudiantesDeArchivo();
    }

    private void leerEstudiantesDeArchivo() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            while (true) {
                Estudiante estudiante = (Estudiante) ois.readObject();
                treeSetEstudiantes.add(estudiante);
                mapEstudiantes.put(estudiante.getNombre(), estudiante);
            }
        } catch (EOFException eofException) {
            // End of file reached
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado. Se creará un nuevo archivo cuando se agreguen estudiantes.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Estudiante buscarEstudiantePorNombre(String nombre) {
        return mapEstudiantes.get(nombre);
    }

    public void agregarEstudiante(Estudiante estudiante) {
        treeSetEstudiantes.add(estudiante);
        mapEstudiantes.put(estudiante.getNombre(), estudiante);
        guardarEstudiantesEnArchivo();
    }

    public void eliminarEstudiante(String nombre) {
        Estudiante estudiante = mapEstudiantes.remove(nombre);
        if (estudiante != null) {
            treeSetEstudiantes.remove(estudiante);
            guardarEstudiantesEnArchivo();
        }
    }

    private void guardarEstudiantesEnArchivo() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            for (Estudiante estudiante : treeSetEstudiantes) {
                oos.writeObject(estudiante);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Ejercicio3 gestion = new Ejercicio3();
        Scanner scanner = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Buscar estudiante");
            System.out.println("2. Agregar estudiante");
            System.out.println("3. Eliminar estudiante");
            System.out.println("4. Salir");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println("Ingrese el nombre del estudiante:");
                    String nombreBuscar = scanner.nextLine();
                    Estudiante estudiante = gestion.buscarEstudiantePorNombre(nombreBuscar);
                    if (estudiante != null) {
                        System.out.println(estudiante);
                    } else {
                        System.out.println("Estudiante no encontrado.");
                    }
                    break;
                case "2":
                    System.out.println("Ingrese nombre:");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese edad:");
                    int edad = Integer.parseInt(scanner.nextLine());
                    System.out.println("Ingrese promedio:");
                    double promedio = Double.parseDouble(scanner.nextLine());
                    Estudiante nuevoEstudiante = new Estudiante(nombre, edad, promedio);
                    gestion.agregarEstudiante(nuevoEstudiante);
                    System.out.println("Estudiante agregado.");
                    break;
                case "3":
                    System.out.println("Ingrese el nombre del estudiante a eliminar:");
                    String nombreEliminar = scanner.nextLine();
                    gestion.eliminarEstudiante(nombreEliminar);
                    System.out.println("Estudiante eliminado.");
                    break;
                case "4":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (!opcion.equals("4"));
    }
}


