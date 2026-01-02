package actExtra3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) {
		  String linea = "";
	        // variables alumno
	        String dni, nombre, apellidos, direccion;
	        Alumno alumno;
	        String nombreA1, nombreA2, nombreA3;
	        double[] notas1 = new double[3];
	        double[] notas2 = new double[3];
	        double[] notas3 = new double[3];
	        Asignatura asignatura1, asignatura2, asignatura3;
	        // tabla para incluir en el alumno
	        Asignatura[] asignaturas = new Asignatura[3];
	        // contadores notaMedia
	        Double contA1 = 0.0, contA2 = 0.0, contA3 = 0.0;

	        try (BufferedReader lee = new BufferedReader(new FileReader("1dam20102011.txt"))) {
	            linea = lee.readLine();
	            while (linea != null) {
	                String[] tabla = linea.split(";");
	                dni = tabla[0];
	                nombre = tabla[1];
	                apellidos = tabla[2];
	                direccion = tabla[3];

	                // asignaturas
	                nombreA1 = tabla[4];
	                notas1[0] = Double.valueOf(tabla[5]);
	                notas1[1] = Double.valueOf(tabla[6]);
	                notas1[2] = Double.valueOf(tabla[7]);
	                contA1 = (notas1[0] + notas1[1] + notas1[2]) / 3;
	                asignatura1 = new Asignatura(nombreA1, notas1);

	                nombreA2 = tabla[8];
	                notas2[0] = Double.valueOf(tabla[9]);
	                notas2[1] = Double.valueOf(tabla[10]);
	                notas2[2] = Double.valueOf(tabla[11]);
	                contA2 = (notas2[0] + notas2[1] + notas2[2]) / 3;
	                asignatura2 = new Asignatura(nombreA2, notas2);

	                nombreA3 = tabla[12];
	                notas3[0] = Double.valueOf(tabla[13]);
	                notas3[1] = Double.valueOf(tabla[14]);
	                notas3[2] = Double.valueOf(tabla[15]);
	                contA3 = (notas3[0] + notas3[1] + notas3[2]) / 3;
	                asignatura3 = new Asignatura(nombreA3, notas3);

	                // pongo asignaturas para meterlas en el alumno
	                asignaturas[0] = asignatura1;
	                asignaturas[1] = asignatura2;
	                asignaturas[2] = asignatura3;
	                alumno = new Alumno(dni, nombre, apellidos, direccion, asignaturas);

	                // IMPRESIÓN DEL LISTADO
	                System.out.println("DNI\t\t\tNOMBRE");
	                System.out.println(alumno.getDni() + "\t\t" + alumno.getNombre());
	                System.out.println("NOMBRE ASIGNATURA\tNOTA MEDIA");
	                System.out.println(alumno.getAsignaturas()[0].getNombre() + "\t\t" + contA1);
	                System.out.println(alumno.getAsignaturas()[1].getNombre() + "\t\t\t" + contA2);
	                System.out.println(alumno.getAsignaturas()[2].getNombre() + "\t\t" + contA3);
	                double notaMediaFinal = (contA1 + contA2 + contA3) / 3;
	                System.out.println("MEDIA DEL CURSO:\t" + notaMediaFinal +
	                        "\n------------------------------------------------------");

	                contA1 = 0.0;
	                contA2 = 0.0;
	                contA3 = 0.0;
	                linea = lee.readLine();
	            }
	        } catch (IOException e) {
	            System.out.println(e.getMessage());
	        }

	    }
	}
