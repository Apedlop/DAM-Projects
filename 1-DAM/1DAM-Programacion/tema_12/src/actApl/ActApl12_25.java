package actApl;

import actRes.ActRes12_11_Socio;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class ActApl12_25 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, Socio_Apodo> socio = new TreeMap<>();
        List<Socio_Apodo> listaSocio = new ArrayList<>();

        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("club.dat"))) {
            socio = (LinkedHashMap<String, Socio_Apodo>) in.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }

        int opcion;

        do {

            System.out.println("1. Alta socio");
            System.out.println("2. Baja socio");
            System.out.println("3. Modificación socio");
            System.out.println("4. Listar socios por apodo");
            System.out.println("5. Listar socios por antigüedad");
            System.out.println("6. Listar los socios con alta anterior a un año determinado");
            System.out.println("7. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce el apodo del nuevo socio: ");
                    String nuevoApodo = sc.next();
                    System.out.println("Introduce el nombre del nuevo socio: ");
                    String nuevoNombre = sc.next();
                    System.out.println("Introduce la fecha de ingreso del nuevo socio (formato dd/MM/yyyy): ");
                    String nuevaFechaIngreso = sc.next();
                    Socio_Apodo nuevoSocio = new Socio_Apodo(nuevoApodo, nuevoNombre, nuevaFechaIngreso);
                    socio.put(nuevoApodo, nuevoSocio);
                    listaSocio.add(nuevoSocio);
                    System.out.println("Nuevo socio añadido correctamente.");
                    break;
                case 2:
                    System.out.println("Introduce el apodo del socio: ");
                    nuevoApodo = sc.next();
                    socio.remove(nuevoApodo);
                    break;
                case 3:
                    System.out.println("Introduce el apodo del socio:");
                    nuevoApodo = sc.next();
                    System.out.println("Introduce el nuevo nombre: ");
                    String nombreNuevo = sc.next();
                    System.out.println("Introduce la nueva fecha de ingreso (con formato dd/MM/yyyy): ");
                    String fechaIngresoNueva = sc.next();
                    nuevoSocio = new Socio_Apodo(nuevoApodo, nombreNuevo, fechaIngresoNueva);
                    socio.put(nuevoApodo, nuevoSocio);
                    break;
                case 4:
                    System.out.println(socio);
                    break;
                case 5:
                    Comparator<Socio_Apodo> c = new Comparator<Socio_Apodo>() {
                        @Override
                        public int compare(Socio_Apodo o1, Socio_Apodo o2) {
                            return o2.antiguedad() - o1.antiguedad();
                        }
                    };
                    // Crear una lista vacía para almacenar los socios
                    List<Socio_Apodo> listaSocios = new ArrayList<>();
                    // Agregar todos los socios del mapa a la lista
                    listaSocios.addAll(socio.values());
                    // Ordenar la lista de socios por antigüedad utilizando el comparador
                    Collections.sort(listaSocios, c);
                    // Imprimir la lista de socios ordenada por antigüedad
                    System.out.println(listaSocios);
                    break;
                case 6:
                    System.out.println("Introduce el año para listar los socios con alta anterior a ese año: ");
                    int añoDeterminado = sc.nextInt();
                    List<Socio_Apodo> sociosAnteriores = new ArrayList<>();
                    // Iterar sobre cada socio en el mapa
                    for (Socio_Apodo socios : socio.values()) {
                        // Obtener el año de ingreso del socio
                        int añoIngreso = socios.fechaIngreso().getYear();
                        // Comparar el año de ingreso con el año determinado
                        if (añoIngreso < añoDeterminado) {
                            // Si la fecha de ingreso es anterior al año determinado, agregar el socio a la lista
                            sociosAnteriores.add(socios);
                        }
                    }
                    // Imprimir la lista de socios con alta anterior al año determinado
                    System.out.println("Socios con alta anterior a " + añoDeterminado + ": ");
                    for (Socio_Apodo socios : sociosAnteriores) {
                        System.out.print(socios);
                    }
                    break;
            }

        } while (opcion != 7);

        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("club.dat"))) {
            out.writeObject(socio);
        } catch (IOException ex) {
            System.out.println(ex);
        }

    }
}