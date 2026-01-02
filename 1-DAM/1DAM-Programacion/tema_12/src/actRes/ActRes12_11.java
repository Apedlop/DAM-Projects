package actRes;

import java.io.*;
import java.util.*;

public class ActRes12_11 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Set<ActRes12_11_Socio> socios = new TreeSet<>(); // Para que la lista se mantenga ordenada por DNI

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("socios.dat"))) {
            socios = (TreeSet<ActRes12_11_Socio>) in.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }

        int opcion;
        do {
            System.out.println("1. Alta");
            System.out.println("2. Baja");
            System.out.println("3. Modificación");
            System.out.println("4. Listado por dni");
            System.out.println("5. Listado por antiguedad");
            System.out.println("6. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("dni: ");
                    String dni = sc.next();
                    alta(socios, dni);
                    break;
                case 2:
                    System.out.print("dni socio: ");
                    dni = sc.next();
                    socios.remove(new ActRes12_11_Socio((dni)));
                    break;
                case 3:
                    System.out.print("dni: ");
                    dni = sc.next();
                    socios.remove(new ActRes12_11_Socio(dni));
                    alta(socios, dni);
                    break;
                case 4:
                    System.out.println(socios);
                    break;
                case 5:
                    Comparator<ActRes12_11_Socio> c = new Comparator<ActRes12_11_Socio>() {
                        @Override
                        public int compare(ActRes12_11_Socio o1, ActRes12_11_Socio o2) {
                            return o2.antiguedad() - o1.antiguedad();
                        }
                    };
                    Set<ActRes12_11_Socio> s = new TreeSet<>(c);
                    s.addAll(socios);
                    System.out.println(s);
            }
        } while (opcion != 6);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("socios.dat"))) {
            out.writeObject(socios);
        } catch (IOException ex) {
            System.out.println(ex);
        }

    }

    static boolean alta(Set<ActRes12_11_Socio> socios, String dni) {
        System.out.print("nombre: ");
        String nombre = sc.next();
        System.out.print("fechaAlta: ");
        String fechaAlta = sc.next();
        ActRes12_11_Socio nuevo = new ActRes12_11_Socio(dni, nombre, fechaAlta);
        return socios.add(nuevo);
    }

}
