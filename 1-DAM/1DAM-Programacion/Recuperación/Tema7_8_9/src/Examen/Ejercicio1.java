package Examen;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Vehiculo[] vehiculos = new Vehiculo[0];
        int opcion;

        do  {

            System.out.println("1. Alta coche");
            System.out.println("2. Alta moto");
            System.out.println("3. Alta coche autónomo");
            System.out.println("4. Listado vehículos");
            System.out.println("5. Listado de coches alquilados");
            System.out.println("6. Listado de motos");
            System.out.println("7. Alquilar vehículo");
            System.out.println("8. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Marca del coche: ");
                    String marca = sc.next();
                    System.out.println("Modelo del coche: ");
                    String modelo = sc.next();
                    Coche c = new Coche(marca, modelo);
                    vehiculos = agregarVehiculo(vehiculos, c);
                    break;
                case 2:
                    System.out.println("Marca de la moto: ");
                    String marcaMoto = sc.next();
                    System.out.println("Modelo de la moto: ");
                    String modeloMoto = sc.next();
                    Moto m = new Moto(marcaMoto, modeloMoto);
                    vehiculos = agregarVehiculo(vehiculos, m);
                    break;
                case 3:
                    System.out.println("Marca del coche autónomo: ");
                    String marcaAuto = sc.next();
                    System.out.println("Modelo del coche autónomo: ");
                    String modeloAuto = sc.next();
                    CocheAutonomo ca = new CocheAutonomo(marcaAuto, modeloAuto);
                    vehiculos = agregarVehiculo(vehiculos, ca);
                    break;
                case 4:
                    System.out.println("Listado de vehículos:");
                    listarVehiculos(vehiculos);
                    break;
                case 5:
                    System.out.println("Listado de coches alquilados:");
                    listarCochesAlquilados(vehiculos);
                    break;
                case 6:
                    System.out.println("Listado de motos:");
                    listarMotos(vehiculos);
                    break;
                case 7:
                    System.out.println("Ingrese el ID del vehículo a alquilar: ");
                    int idAlquilar = sc.nextInt();
                    alquilarVehiculo(vehiculos, idAlquilar);
                    break;
            }

        } while (opcion != 8);

    }

    public static Vehiculo[] agregarVehiculo(Vehiculo[] vehiculos, Vehiculo vehiculo) {
        Vehiculo[] temp = new Vehiculo[vehiculos.length + 1];
        System.arraycopy(vehiculos, 0, temp, 0, vehiculos.length);
        temp[temp.length - 1] = vehiculo;
        return temp;
    }

    public static void listarVehiculos(Vehiculo[] vehiculos) {
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
        }
    }

    public static void listarCochesAlquilados(Vehiculo[] vehiculos) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.esCocheAlquilado()) {
                System.out.println(vehiculo);
            }
        }
    }

    public static void listarMotos(Vehiculo[] vehiculos) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.esMoto()) {
                System.out.println(vehiculo);
            }
        }
    }

    public static void alquilarVehiculo(Vehiculo[] vehiculos, int id) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getNumIdentificacion() == id) {
                vehiculo.alquilar();
                System.out.println("Vehículo con ID " + id + " alquilado correctamente.");
                return;
            }
        }
        System.out.println("No se encontró ningún vehículo con ID " + id + ".");
    }
}

abstract class Vehiculo {

    private static int contador = 1;
    private int numIdentificacion;
    private String marca;
    private String modelo;
    boolean alquilado;

    public Vehiculo(String marca, String modelo) {
        this.numIdentificacion = contador++;
        this.marca = marca;
        this.modelo = modelo;
        this.alquilado = false; // Por defecto, el vehículo no está alquilado
    }

    public abstract boolean esCocheAlquilado();
    public abstract boolean esMoto();
    public void alquilar() {
        this.alquilado = true;
    }

    public int getNumIdentificacion() {
        return numIdentificacion;
    }

    @Override
    public String toString() {
        return "Vehículo: [ID: " + numIdentificacion + ", Marca: " + marca + ", Modelo: " + modelo + ", Alquilado: " + alquilado + "]";
    }
}

class Coche extends Vehiculo {

    int capacidadPasajeros;

    public Coche(String marca, String modelo) {
        super(marca, modelo);
        this.capacidadPasajeros = 2;
    }

    @Override
    public boolean esCocheAlquilado() {
        return super.alquilado;
    }

    @Override
    public boolean esMoto() {
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + " [Coche - Capacidad de Pasajeros: " + capacidadPasajeros + "]";
    }
}

class CocheAutonomo extends Coche {

    int numSensores;

    public CocheAutonomo(String marca, String modelo) {
        super(marca, modelo); // Aquí se inicializan correctamente marca y modelo
        this.numSensores = 3;
    }

    @Override
    public void alquilar() {
        super.alquilar();
    }

    @Override
    public String toString() {
        return super.toString() + " [Coche Autónomo - Sensores: " + numSensores + "]";
    }
}

class Moto extends Vehiculo {

    boolean sidecar;

    public Moto(String marca, String modelo) {
        super(marca, modelo);
        this.sidecar = false;
    }

    @Override
    public boolean esCocheAlquilado() {
        return super.alquilado;
    }

    @Override
    public boolean esMoto() {
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + " [Moto - Sidecar: " + sidecar + "]";
    }
}
