package EjCompl_FB;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {

    public static void main(String[] args) {

        String[] asignaturas = {
                "101 Matematicas",
                "102 Fisica",
                "103 Quimica",
                "104 Biologia",
                "105 Historia"
        };

        String[] alumnos = {
                "Juan 12345678A 101 9 102 5 103 4 104 7 105 10",
                "Maria 87654321B 101 8 102 10 103 3 104 6 105 8",
                "Pedro 11223344C 101 5 102 1 103 9 104 5 105 6"
        };

        // Escribir datos en archivos
        try (ObjectOutputStream out1 = new ObjectOutputStream(new FileOutputStream("Alumnos.dat"));
             ObjectOutputStream out2 = new ObjectOutputStream(new FileOutputStream("Asignaturas.dat"))) {
            for (String asignatura : asignaturas) {
                out2.writeObject(asignatura);
            }
            for (String alumno : alumnos) {
                out1.writeObject(alumno);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        List<Asignaturas> asignatura = new ArrayList<>();
        List<Calificacion> calificacion = new ArrayList<>();
        List<Alumnos> alumno = new ArrayList<>();

        // Leer datos desde archivos
        try (ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("Alumnos.dat"));
             ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("Asignaturas.dat"))) {

            // Leer datos asignaturas
            try {
                while (true) {
                    Object asig = in2.readObject();
                    if (asig instanceof String) {
                        String[] partes = ((String) asig).split(" ");
                        int codigo = Integer.parseInt(partes[0]);
                        String nombre = partes[1];
                        asignatura.add(new Asignaturas(codigo, nombre));
                        calificacion.add(new Calificacion(codigo));
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }

            // Leer datos alumnos
            try {
                while (true) {
                    Object alum = in1.readObject();
                    if (alum instanceof String) {
                        String[] partes = ((String) alum).split(" ");
                        String nombre = partes[0];
                        String dni = partes[1];
                        List<Integer> codigos = new ArrayList<>();
                        List<Integer> notas = new ArrayList<>();
                        for (int i = 2; i < partes.length; i += 2) {
                            codigos.add(Integer.parseInt(partes[i]));
                            notas.add(Integer.parseInt(partes[i + 1]));
                        }
                        alumno.add(new Alumnos(nombre, dni, codigos, notas));
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }

        // Calcular calificaciones
        for (Alumnos alum : alumno) {
            for (int i = 0; i < alum.codAsignatura.size(); i++) {
                int codigo = alum.codAsignatura.get(i);
                int nota = alum.nota.get(i);
                for (Calificacion cal : calificacion) {
                    if (cal.codigo == codigo) {
                        cal.numCalificaciones(nota);
                        break;
                    }
                }
            }
        }

        // Imprimir resumen de calificaciones por asignatura
        System.out.println("LISTADO: RESUMEN DE CALIFICACIONES POR ASIGNATURA");
        System.out.println("NOMBRE-ASIGNATURA    SUS  APR  BIEN  NOT  SOB");

        for (Asignaturas asig : asignatura) {
            for (Calificacion cal : calificacion) {
                if (asig.codigo == cal.codigo) {
                    System.out.printf("%-20s %s\n", asig.nomAsig, cal.toString());
                    break;
                }
            }
        }

    }

}

class Calificacion {

    int codigo;
    int sus = 0;
    int aprob = 0;
    int bien = 0;
    int not = 0;
    int sob = 0;

    public Calificacion(int codigo) {
        this.codigo = codigo;
    }

    public void numCalificaciones(int nota) {
        if (nota >= 0 && nota < 5) {  // Nota >= 0
            sus++;
        } else if (nota == 5) {
            aprob++;
        } else if (nota == 6) {
            bien++;
        } else if (nota >= 7 && nota < 9) {
            not++;
        } else if (nota >= 9 && nota <= 10) {
            sob++;
        } else {
            System.out.println("La nota no es correcta.");
        }
    }

    public String toString() {
        return " " + sus + "    " + aprob + "    " + bien + "     " + not + "    " + sob;
    }

}

class Asignaturas {

    int codigo;
    String nomAsig;

    public Asignaturas(int codigo, String nomAsig) {
        this.codigo = codigo;
        this.nomAsig = nomAsig;
    }

}

class Alumnos {
    String nombre;
    String dni;
    List<Integer> codAsignatura;
    List<Integer> nota;

    public Alumnos(String nombre, String dni, List<Integer> codAsignatura, List<Integer> nota) {
        this.nombre = nombre;
        this.dni = dni;
        this.codAsignatura = codAsignatura;
        this.nota = nota;
    }

}