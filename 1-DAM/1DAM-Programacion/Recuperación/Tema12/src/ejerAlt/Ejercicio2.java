package ejerAlt;

import java.util.*;
import java.io.*;

public class Ejercicio2 {

    public static void main(String[] args) {

        List<Individuo> individuos = new ArrayList<>();

        individuos.add(new Individuo("Juan", 25, "Madrid"));
        individuos.add(new Individuo("María", 30, "Barcelona"));
        individuos.add(new Individuo("Carlos", 20, "Valencia"));

        Set<Individuo> individuoSet = new TreeSet<>(individuos);

        System.out.println(individuoSet);

        Map<String, String> mapaIndividuos = new TreeMap<>();
        for (Individuo ind : individuos) {
            mapaIndividuos.put(ind.getNombre(), ind.getCiudad());
        }
        System.out.println(mapaIndividuos);

        // Guardar la información en un fichero binario
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("individuos.bin"))) {
            oos.writeObject(individuos);
            oos.writeObject(individuoSet);
            oos.writeObject(mapaIndividuos);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Leer la información del fichero binario
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("individuos.bin"))) {
            List<Individuo> individuosLeidos = (List<Individuo>) ois.readObject();
            TreeSet<Individuo> individuosSetLeidos = (TreeSet<Individuo>) ois.readObject();
            Map<String, String> mapaIndividuosLeidos = (Map<String, String>) ois.readObject();

            // Mostrar la información leída
            System.out.println("Individuos leídos del fichero:");
            for (Individuo ind : individuosLeidos) {
                System.out.println(ind);
            }

            System.out.println("\nIndividuos ordenados por edad leídos del fichero:");
            for (Individuo ind : individuosSetLeidos) {
                System.out.println(ind);
            }

            System.out.println("\nMapa de individuos leídos del fichero:");
            for (Map.Entry<String, String> entry : mapaIndividuosLeidos.entrySet()) {
                System.out.println("Nombre: " + entry.getKey() + ", Ciudad: " + entry.getValue());
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}

class Individuo implements Comparable<Individuo>, Serializable {

    private static final long serialVersionUID = 1L;
    String nombre;
    int edad;
    String ciudad;

    public Individuo(String nombre, int edad, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Individuo{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", ciudad='" + ciudad + '\'' +
                "}";
    }

    @Override
    public int compareTo(Individuo o) {
        return Integer.compare(this.edad, o.edad);
    }
}
