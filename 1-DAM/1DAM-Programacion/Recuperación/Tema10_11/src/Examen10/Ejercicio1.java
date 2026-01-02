package Examen10;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
public class Ejercicio1 {

    public static void main(String[] args) {

        List<Empleado> empleados = new ArrayList<>();
        double sumSalario = 0.0;
        int contSalario = 0;
        String empeladosMasSalario, empeladoMenosSalrio;

        try (BufferedReader br = new BufferedReader(new FileReader("empleados.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String nombre = linea.split(":")[1].trim();
                String fechaNacimiento = br.readLine().split(":")[1].trim();
                String departamento = br.readLine().split(":")[1].trim();
                double salario = Double.parseDouble(br.readLine().split(":")[1].trim());

                Empleado empleado = new Empleado(nombre, fechaNacimiento, departamento, salario);
                empleados.add(empleado);

                sumSalario += salario;
                contSalario++;
                // Leer la línea vacía entre registros
                br.readLine();
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        Empleado maximo = Collections.max(empleados, new Comparator<Empleado>() {
            @Override
            public int compare(Empleado o1, Empleado o2) {
                return (int) (o1.salario - o2.salario);
            }
        });
        Empleado minimo = Collections.min(empleados, new Comparator<Empleado>() {
            @Override
            public int compare(Empleado o1, Empleado o2) {
                return (int) (o1.salario - o2.salario);
            }
        });
        Empleado masJoven = Collections.min(empleados, new Comparator<Empleado>() {
            @Override
            public int compare(Empleado o1, Empleado o2) {
                return o1.edad() - o2.edad();
            }
        });

        System.out.println("Empleado con el salario más alto: " + maximo.nombre + " con " + maximo.salario);
        System.out.println("Empleado con el salario más bajo: " + minimo.nombre + " con " + minimo.salario);
        System.out.println("Empleado más joven: " + masJoven.nombre + " con " + masJoven.edad() + " años");
        System.out.println("Salario promedio: " + (sumSalario / contSalario));
        Collections.sort(empleados);
        System.out.println("Listado por nombre: \n" + empleados);
        Collections.sort(empleados, new Comparator<Empleado>() {
            @Override
            public int compare(Empleado o1, Empleado o2) {
                return o2.edad() - o1.edad();
            }
        });
        System.out.println("Listado por edad: \n" + empleados);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("empleadosSalida.txt"))) {
            for (Empleado empleado : empleados) {
                bw.write(empleado.nombre + ": " + empleado.edad() + "\n");
            }
        } catch (IOException e) {
            System.out.println(e);
        }


    }

    private static String extraerValor(String linea) {
        return linea.split(":")[1].trim();
    }
}

class Empleado implements Comparable<Empleado> {
    String nombre;
    LocalDate fechaNacimiento;
    String departamento;
    double salario;

    public Empleado(String nombre, String fechaNacimiento, String departamento, double salario) {
        this.nombre = nombre;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("d-M-yyyy"); // Ajustar el patrón aquí
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento, f);
        this.departamento = departamento;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    int edad() {
        return (int) fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", departamento='" + departamento + '\'' +
                ", salario=" + salario +
                "}\n";
    }

    @Override
    public int compareTo(Empleado o) {
        return nombre.compareToIgnoreCase((o).nombre);
    }

}
