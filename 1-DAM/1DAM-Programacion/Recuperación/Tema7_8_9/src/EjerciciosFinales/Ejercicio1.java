/*Menú socios: alta, eliminación, consulta número de socios, consulta datos de un
socio, modificación fecha de nacimiento, listado ordenado por id, listado ordenado
por edad y nombre*/

package EjerciciosFinales;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Socio> socio = new ArrayList<>();
        int opcion;

        do {
            System.out.println("1. Alta");
            System.out.println("2. Eliminación");
            System.out.println("3. Consultar número de socios");
            System.out.println("4. Consultar datos de un socio");
            System.out.println("5. Listar por ID");
            System.out.println("6. Listar por edad y nombre");
            System.out.println("7. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Nombre: ");
                    String nombre = sc.next();
                    sc.nextLine();  // Consume el carácter de nueva línea pendiente
                    System.out.println("Fecha de nacimiento (formato dd/MM/yyyy): ");
                    String fechaNacimiento = sc.nextLine();
                    Socio s = new Socio(nombre, fechaNacimiento);
                    socio.add(s);
                    break;
                case 2:
                    System.out.println("Introduce el ID del socio a eliminar: ");
                    int id = sc.nextInt();
                    socio.remove(id);
                    break;
                case 3:
                    System.out.println("Número de socios: " + socio.size());
                    break;
                case 4:
                    System.out.println("Introduce el ID del socio a ver los datos: ");
                    id = sc.nextInt();
                    System.out.println(socio.get(id));
                    break;
                case 5:
                    System.out.println("Lista ordenada por ID: " + socio);
                    break;
                case 6:
                    Comparator<Socio> c = new Comparator<Socio>() {
                        @Override
                        public int compare(Socio o1, Socio o2) {
                            // Compara por edad
                            int comparacionPorEdad = Integer.compare(o1.edad(), o2.edad());

                            // Si las edades son iguales, compara por nombre
                            if (comparacionPorEdad == 0) {
                                return o1.nombre.compareToIgnoreCase(o2.nombre);
                            }

                            // Retorna la comparación por edad si son diferentes
                            return comparacionPorEdad;
                        }
                    };
                    Set<Socio> lsocio = new TreeSet<>(c);
                    lsocio.addAll(socio);
                    System.out.println(lsocio);
            }

        } while (opcion != 7);

    }

}

class Socio implements Comparable {

    static int contador = 1;
    int id;
    String nombre;
    LocalDate fechaNacimiento;

    public Socio(String nombre, String fechaNac) {
        this.id = contador++;
        this.nombre = nombre;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaNacimiento = LocalDate.parse(fechaNac, f);
    }

    int edad() {
        return (int) fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    @Override
    public int compareTo(Object o) {
        return id - ((Socio) o).id;
    }

    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Edad: " + edad() + "\n";
    }

}
