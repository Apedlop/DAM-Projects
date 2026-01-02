package Examen11;

import java.io.*;
import java.util.*;

public class Principal {

    public static void main(String[] args) {
        // Crear ARdos.dat a partir de los datos contenidos en otros ficheros
        crearARdos();
    }

    public static void crearARdos() {
        String archivoAsignaturas = "asignatura.txt";
        String archivoAlumnos = "alumnos.dat";
        String archivoNotas = "notas.dat";
        String archivoARdos = "ARdos.dat";

        // Variables para guardar los códigos y nombres de asignaturas
        int[] codAsig = new int[5];
        String[] nomAsig = new String[5];

        // Cargar asignaturas desde el archivo
        try (BufferedReader br = new BufferedReader(new FileReader(archivoAsignaturas))) {
            String linea;
            int index = 0;
            while ((linea = br.readLine()) != null && index < 5) {
                String[] partes = linea.split(";");
                if (partes.length == 2) {
                    codAsig[index] = Integer.parseInt(partes[0].trim());
                    nomAsig[index] = partes[1].trim();
                    index++;
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo de asignaturas: " + e.getMessage());
            return;
        }

        // Cargar o crear datos de alumnos y notas
        ArrayList<Alumno> listaAlumnos = cargarOCrearAlumnos(archivoAlumnos);
        ArrayList<Notas> listaNotas = cargarOCrearNotas(archivoNotas);

        // Ordenar notas por DNI
        Collections.sort(listaNotas);

        // Procesar y escribir en ARdos.dat
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivoARdos))) {
            System.out.println("Procesando datos para " + archivoARdos + ":");
            System.out.println("\nDNI\t\t\t\tNOMBRE ALUMNO\t\t\tASIGNATURA-NOTA1\t\t\t\tASIGNATURA-NOTA2\t\t\tASIGNATURA-NOTA3\t\t\tASIGNATURA-NOTA4\t\t\t\tASIGNATURA-NOTA5");

            for (Notas notas : listaNotas) {
                String dni = notas.getDni();
                String nombreAlumno = Notas.obtenerNombrePorDNI(dni, listaAlumnos.toArray(new Alumno[0]));

                // Mostrar por pantalla las calificaciones del alumno
                System.out.print(dni + "\t\t" + nombreAlumno);
                for (int i = 0; i < 5; i++) {
                    char calificacion = notas.obtenerNota(i);
                    String nombreAsignatura = nomAsig[i]; // Nombre de la asignatura según el orden en el archivo
                    System.out.print("\t\t\t\t\t" + nombreAsignatura + "\t" + calificacion);
                }
                System.out.println();

                // Escribir en ARdos.dat si todas las materias están aprobadas
                if (notas.todasAprobadas()) {
                    oos.writeObject(new Alumno(dni, nombreAlumno, "", "", 0));
                }
            }
            System.out.println("Datos de alumnos con todas las materias aprobadas guardados en " + archivoARdos);
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo ARdos.dat: " + e.getMessage());
        }
    }

    private static ArrayList<Alumno> cargarOCrearAlumnos(String archivoAlumnos) {
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        File fileAlumnos = new File(archivoAlumnos);

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivoAlumnos))) {
            while (true) {
                Alumno alumno = (Alumno) ois.readObject();
                listaAlumnos.add(alumno);
            }
        } catch (EOFException e) {
            // Se llega al final del archivo, no hacer nada especial
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al leer el archivo de alumnos: " + e.getMessage());
        }

        // Si el archivo no existe o está vacío, crear datos de alumnos ficticios para demostración
        if (listaAlumnos.isEmpty()) {
            listaAlumnos.add(new Alumno("12345678A", "Juan", "Gómez", "Calle A, 123", 123456789));
            listaAlumnos.add(new Alumno("87654321B", "María", "López", "Avenida B, 456", 987654321));
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivoAlumnos))) {
                for (Alumno alumno : listaAlumnos) {
                    oos.writeObject(alumno);
                }
                System.out.println("Datos de alumnos creados y escritos en " + archivoAlumnos);
            } catch (IOException ex) {
                System.err.println("Error al escribir en el archivo " + archivoAlumnos + ": " + ex.getMessage());
            }
        }

        return listaAlumnos;
    }

    private static ArrayList<Notas> cargarOCrearNotas(String archivoNotas) {
        ArrayList<Notas> listaNotas = new ArrayList<>();
        File fileNotas = new File(archivoNotas);

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivoNotas))) {
            while (true) {
                Notas notas = (Notas) ois.readObject();
                listaNotas.add(notas);
            }
        } catch (EOFException e) {
            // Se llega al final del archivo, no hacer nada especial
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al leer el archivo de notas: " + e.getMessage());
        }

        // Si el archivo no existe o está vacío, crear datos de notas ficticios para demostración
        if (listaNotas.isEmpty()) {
            listaNotas.add(new Notas("12345678A", new char[]{'S', 'N', 'B', 'C', 'S'}));
            listaNotas.add(new Notas("87654321B", new char[]{'N', 'N', 'B', 'S', 'S'}));
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivoNotas))) {
                for (Notas notas : listaNotas) {
                    oos.writeObject(notas);
                }
                System.out.println("Datos de notas creados y escritos en " + archivoNotas);
            } catch (IOException ex) {
                System.err.println("Error al escribir en el archivo " + archivoNotas + ": " + ex.getMessage());
            }
        }

        return listaNotas;
    }
}

class Alumno implements Serializable {

    private static final long serialVersionUID = 1L;
    private String dni;
    private String nombre;
    private String apellidos;
    private String direccion;
    private int telefono;

    public Alumno(String dni, String nombre, String apellidos, String direccion, int telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}

class Notas implements Comparable<Notas>, Serializable {

    private static final long serialVersionUID = 1L;
    private String dni;
    private char[] calificaciones;

    public Notas(String dni, char[] calificaciones) {
        this.dni = dni;
        this.calificaciones = calificaciones;
    }

    public String getDni() {
        return dni;
    }

    public char obtenerNota(int indiceAsignatura) {
        if (indiceAsignatura >= 0 && indiceAsignatura < 5) {
            return calificaciones[indiceAsignatura];
        }
        return '-';
    }

    public boolean todasAprobadas() {
        for (char calificacion : calificaciones) {
            if (calificacion == 'N' || calificacion == '-') {
                return false;
            }
        }
        return true;
    }

    @Override
    public int compareTo(Notas otra) {
        return this.dni.compareTo(otra.dni);
    }

    public static String obtenerNombrePorDNI(String dni, Alumno[] alumnos) {
        for (Alumno alumno : alumnos) {
            if (alumno.getDni().equals(dni)) {
                return alumno.getNombre();
            }
        }
        return "Nombre no encontrado";
    }
}
