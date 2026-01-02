package actApl;

import actRes.ActRes12_11_Socio;

import java.io.*;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ActApl12_16 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Set<Socio> socios = new TreeSet<>(); // Para que la lista se mantenga ordenada por DNI

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("socios.dat"))) {
            socios = (TreeSet<Socio>) in.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }

        int opcion;
        do {
            System.out.println("1. Alta");
            System.out.println("2. Baja");
            System.out.println("3. Modificación");
            System.out.println("4. Listar por nombre");
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
                    socios.remove(new Socio(dni));
                    alta(socios, dni);
                    break;
                case 4:
                    System.out.println(socios);
                    break;
                case 5:
                    Comparator<Socio> c = new Comparator<Socio>() {
                        @Override
                        public int compare(Socio o1, Socio o2) {
                            return o2.antiguedad() - o1.antiguedad();
                        }
                    };
                    Set<Socio> s = new TreeSet<>(c);
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

    static boolean alta(Set<Socio> socios, String dni) {
        System.out.print("nombre: ");
        String nombre = sc.next();
        System.out.print("fechaAlta: ");
        String fechaAlta = sc.next();
        Socio nuevo = new Socio(dni, nombre, fechaAlta);
        return socios.add(nuevo);
    }


}
