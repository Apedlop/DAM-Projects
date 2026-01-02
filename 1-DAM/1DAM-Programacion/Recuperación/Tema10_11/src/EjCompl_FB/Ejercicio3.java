package EjCompl_FB;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {

    public static void main(String[] args) {
        List<Alumno> alumnos = new ArrayList<>();

        try (BufferedReader in = new BufferedReader(new FileReader("Alumnos.txt"))) {
            String linea;
            while ((linea = in.readLine()) != null) {
                String[] partes = linea.split(";");
                int dni = Integer.parseInt(partes[0]);
                String nombre = partes[1];
                String apellido = partes[2];
                String direccion = partes[3];
                List<Asignatura> asignaturas = new ArrayList<>();
                for (int i = 0; i < 3; i++) {
                    String nombreAsignatura = partes[4 + i * 4];
                    double nota1 = Double.parseDouble(partes[5 + i * 4]);
                    double nota2 = Double.parseDouble(partes[6 + i * 4]);
                    double nota3 = Double.parseDouble(partes[7 + i * 4]);
                    asignaturas.add(new Asignatura(nombreAsignatura, nota1, nota2, nota3));
                }
                Alumno alumno = new Alumno(dni, nombre, apellido, direccion, asignaturas);
                alumnos.add(alumno);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("1dam20102011.dat"))) {
            for (Alumno alumno : alumnos) {
                out.writeObject(alumno);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("1dam20102011.dat"))) {
            System.out.println("DNI\t\t\t\t\t\t\tNOMBRE");
            while (true) {

                Alumno alumno = (Alumno) ois.readObject();
                System.out.println(alumno.dni + "\t\t\t\t\t" + alumno.nombre + " " + alumno.apellido);
                System.out.println("Nombre Asignatura \t\t\tNota Media");
                for (Asignatura asignatura : alumno.asignaturas) {
                    System.out.println(asignatura.nombre + "\t\t" + asignatura.notaMedia);
                }
                System.out.println("MEDIA DEL CURSO: \t\t\t" + alumno.notaMediaCurso);
                System.out.println("------------------------------------------------------");

            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}

class Asignatura implements Serializable {
    String nombre;
    double nota1;
    double nota2;
    double nota3;
    double notaMedia;

    public Asignatura(String nombre, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.notaMedia = calcularNotaMedia();
    }

    public double calcularNotaMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    @Override
    public String toString() {
        return nombre + " " + notaMedia;
    }
}

class Alumno implements Serializable {
    int dni;
    String nombre;
    String apellido;
    String direccion;
    List<Asignatura> asignaturas;
    double notaMediaCurso;

    public Alumno(int dni, String nombre, String apellido, String direccion, List<Asignatura> asignaturas) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.asignaturas = asignaturas;
        this.notaMediaCurso = calcularNotaMediaCurso();
    }

    public double calcularNotaMediaCurso() {
        double suma = 0;
        for (Asignatura asignatura : asignaturas) {
            suma += asignatura.notaMedia;
        }
        return asignaturas.size() > 0 ? suma / asignaturas.size() : 0;
    }

    @Override
    public String toString() {
        String resultado = dni + " " + nombre + " " + apellido + "\n";
        for (Asignatura asignatura : asignaturas) {
            resultado += asignatura.nombre + " " + asignatura.notaMedia + "\n";
        }
        resultado += "MEDIA DEL CURSO: " + notaMediaCurso;
        return resultado;
    }
}
