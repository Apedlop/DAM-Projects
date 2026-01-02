package actRes;

import java.io.*;
import java.util.*;

public class ActRes12_15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, Integer> existencias = new TreeMap<>();

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("existencias.dat"))) {
            existencias = (TreeMap<String, Integer>) in.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }

        int opcion;
        do {

            System.out.println("1. Alta producto");
            System.out.println("2. Baja producto");
            System.out.println("3. Cambio stock de producto");
            System.out.println("4. Listar existencias");
            System.out.println("5. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Código producto: ");
                    String codigo = sc.next();
                    if (!existencias.containsKey(codigo)) { // Nos aseguramos de que el código no existe
                        existencias.put(codigo, 0);
                    } else {
                        System.out.println("El producto ya existe.");
                    }
                    break;
                case 2:
                    System.out.println("Código producto: ");
                    codigo = sc.next();
                    existencias.remove(codigo);
                    break;
                case 3:
                    System.out.println("Código producto: ");
                    codigo = sc.next();
                    System.out.println("Nuevo stock: ");
                    int stock = sc.nextInt();
                    existencias.put(codigo, stock);
                    break;
                case 4:
                    System.out.println(existencias);
                    break;
            }

        } while (opcion != 5);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("existencias.dat"))) {
            out.writeObject(existencias);
        } catch (IOException ex) {
            System.out.println(ex);
        }

    }

}
