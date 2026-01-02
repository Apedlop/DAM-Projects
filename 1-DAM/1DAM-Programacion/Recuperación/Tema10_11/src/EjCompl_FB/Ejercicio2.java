package EjCompl_FB;

import java.io.*;
import java.util.*;

public class Ejercicio2 {

    static List<Estudiantes> e = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("Estudiantes.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Dividir la línea en partes usando la coma como separador
                String[] partes = linea.split(", ");
                // Procesar cada parte para extraer los valores
                int dni = Integer.parseInt(partes[0].split(": ")[1]);
                String nombre = partes[1].split(": ")[1];
                String apellido = partes[2].split(": ")[1];
                double nota1 = Double.parseDouble(partes[3].split(": ")[1]);
                double nota2 = Double.parseDouble(partes[4].split(": ")[1]);
                double nota3 = Double.parseDouble(partes[5].split(": ")[1]);
                double notaMedia = Double.parseDouble(partes[6].split(": ")[1]);
                // Crear un objeto Estudiantes con los valores extraídos y agregarlo a la lista
                Estudiantes estudiante = new Estudiantes(dni, nombre, apellido, nota1, nota2, nota3);
                e.add(estudiante);
            }
        } catch (IOException ex) {
            System.out.println("Error al leer el archivo: " + ex.getMessage());
        }

        int opcion;

        do {

            System.out.println("1. Añadir nuevo alumno");
            System.out.println("2. Modificar notas alumno");
            System.out.println("3. Calcular nota media final");
            System.out.println("4. Consultar notas de un alumno");
            System.out.println("5. Mostrar alumno con mayor y menor calificación");
            System.out.println("6. Listar nombre de los alumnos y notas medias, ordenado por nombre");
            System.out.println("7. Listar nombre de los alumnos y notas medias, ordenado por nota media.");
            System.out.println("8. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("DNI:");
                    int dni = sc.nextInt();
                    System.out.println("Nombre: ");
                    String nombre = sc.next();
                    System.out.println("Apellido: ");
                    String apellido = sc.next();
                    System.out.println("Nota 1: ");
                    double n1 = sc.nextDouble();
                    System.out.println("Nota 2: ");
                    double n2 = sc.nextDouble();
                    System.out.println("Nota 3:");
                    double n3 = sc.nextDouble();
                    Estudiantes estudiante = new Estudiantes(dni, nombre, apellido, n1, n2, n3);
                    e.add(estudiante);
                    Collections.sort(e);
                    guardarDatos();
                    break;
                case 2:
                    System.out.println("DNI del alumno: ");
                    dni = sc.nextInt();
                    modificarNotas(dni);
                    break;
                case 3:
                    for (Estudiantes estudiantes : e) {
                        estudiantes.calcularMedia();
                    }
                    break;
                case 4:
                    System.out.println("DNI del alumno:");
                    dni = sc.nextInt();
                    listarAlumno(dni);
                    break;
                case 5:
                    alumnoMayorMenor();
                    break;
                case 6:
                    listarNombre();
                    break;
                case 7:
                    listarMedia();
                    break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Introduce un número válido.");
                    break;
            }

        } while (opcion != 8);

    }

    public static void listarAlumno(int dni) {
        for (Estudiantes estudiante : e) {
            if (estudiante.getDni() == dni) {
                System.out.println(estudiante);
            }
        }
    }

    public static void modificarNotas(int dni) {
        for (Estudiantes estudiante : e) {
            if (estudiante.getDni() == dni) {
                System.out.println("Nota 1: ");
                estudiante.setNota1(sc.nextDouble());
                System.out.println("Nota 2: ");
                estudiante.setNota2(sc.nextDouble());
                System.out.println("Nota 3: ");
                estudiante.setNota3(sc.nextDouble());
                System.out.println("Notas modificadas con éxito.");
            } else {
                System.out.println("Alumno no encontrado.");
            }
        }
    }

    public static void alumnoMayorMenor() {
        Estudiantes mayor = Collections.max(e, new Comparator<Estudiantes>() {
            @Override
            public int compare(Estudiantes o1, Estudiantes o2) {
                return (int) (o1.notaMedia - o2.notaMedia);
            }
        });
        Estudiantes menor = Collections.min(e, new Comparator<Estudiantes>() {
            @Override
            public int compare(Estudiantes o1, Estudiantes o2) {
                return (int) (o1.notaMedia - o2.notaMedia);
            }
        });
        System.out.println("Alumno con mayor calificación: " + mayor);
        System.out.println("Alumno con menor calificación: " + menor);
    }

    public static void listarNombre() {  // Convertir Set a List
        Collections.sort(e, new Comparator<Estudiantes>() {
            @Override
            public int compare(Estudiantes o1, Estudiantes o2) {
                return o1.getNombre().compareTo(o2.getNombre());  // Ordenar por nombre
            }
        });
        for (Estudiantes estudiante : e) {
            System.out.println(estudiante.getNombre() + ": " + estudiante.getNotaMedia());
        }
    }

    public static void listarMedia() {
        Collections.sort(e, new Comparator<Estudiantes>() {
            @Override
            public int compare(Estudiantes o1, Estudiantes o2) {
                return (int) (o2.notaMedia - o1.notaMedia);
            }
        });
        for (Estudiantes estudiante : e) {
            System.out.println(estudiante.getNombre() + ": " + estudiante.getNotaMedia());
        }
    }

    public static void guardarDatos() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Estudiantes.txt"))) {
            for (Estudiantes estudiante : e) {
                bw.write("DNI: " + estudiante.getDni() + ", Nombre: " + estudiante.getNombre() + ", Apellido: " + estudiante.getApellido() + ", Nota 1: " + estudiante.getNota1() + ", Nota 2: " + estudiante.getNota2() + ", Nota 3: " + estudiante.getNota3() + ", Nota Media: " + estudiante.getNotaMedia());
                bw.newLine();
            }
        } catch (IOException ex) {
            System.out.println("Error al guardar el archivo: " + ex.getMessage());
        }
    }

}

class Estudiantes implements Comparable {

    int dni;
    String nombre;
    String apellido;
    double nota1;
    double nota2;
    double nota3;
    double notaMedia;

    public Estudiantes(int dni, String nombre, String apellido, double nota1, double nota2, double nota3) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.notaMedia = calcularMedia();
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public double calcularMedia() {
        this.notaMedia = (nota1 + nota2 + nota3) / 3;
        return notaMedia;
    }

    public String toString() {
        return "Alumno - DNI:" + dni + ", Nombre: " + nombre + ", Apellido: " + apellido + ", Nota1: " + nota1 + ", Nota2: " + nota2 + ", Nota3: " + nota3 + ", Nota Media: " + notaMedia;
    }

    @Override
    public int compareTo(Object o) {
        return Integer.compare(this.dni, ((Estudiantes) o).getDni());
    }
}
