package Examen;

import java.util.*;

public class Ejercicio1_Colecciones {

    static List<Vehiculo1> v = new ArrayList<>();

    public static void main(String[] args) {

        List<Moto1> m = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {

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
                    System.out.println("Marca: ");
                    String marca = sc.next();
                    System.out.println("Modelo: ");
                    String modelo = sc.next();
                    Coche1 coche = new Coche1(marca, modelo);
                    v.add(coche);
                    break;
                case 2:
                    System.out.println("Marca: ");
                    marca = sc.next();
                    System.out.println("Modelo: ");
                    modelo = sc.next();
                    Moto1 moto = new Moto1(marca, modelo);
                    v.add(moto);
                    m.add(moto);
                    break;
                case 3:
                    System.out.println("Marca: ");
                    marca = sc.next();
                    System.out.println("Modelo: ");
                    modelo = sc.next();
                    CocheAutonomo1 cocheAutonomo = new CocheAutonomo1(marca, modelo);
                    v.add(cocheAutonomo);
                    break;
                case 4:
                    System.out.println(v);
                    break;
                case 5:
                    for (Vehiculo1 vehiculo : v) {
                        if (vehiculo.alquilado) {
                            System.out.println(vehiculo);
                        }
                    }
                    break;
                case 6:
                    System.out.println(m);
                    break;
                case 7:
                    System.out.println("Introduce el id del vehículo: ");
                    int id = sc.nextInt();
                    alquilar(id);
                    break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    break;
            }

        } while (opcion != 8);

    }

    public static void alquilar(int id) {
        for (Vehiculo1 vehiculo : v) {
            if (vehiculo.id == id) {
                vehiculo.alquilar();
                System.out.println("El vehículo con ID " + id + " ha sido alquilado.");
                return;
            } else {
                System.out.println("No se ha encontrado el ID.");
            }
        }
    }

}

class Vehiculo1 {

    static int contador = 1;
    int id;
    String marca;
    String modelo;
    boolean alquilado;

    public Vehiculo1(String marca, String modelo) {
        this.id = contador;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void alquilar() {
        alquilado = true;
    }

    public String toString() {
        return "\nVehículo - ID: " + id + ", Marca: " + marca + ", Modelo: " + modelo + ", Alquilado: " + alquilado;
    }

}

class Coche1 extends Vehiculo1 {

    int pasajeros;

    public Coche1(String marca, String modelo) {
        super(marca, modelo);
        this.pasajeros = 2;
    }

    public String toString() {
        return super.toString() + " [ Coche - Pasajeros: " + pasajeros + " ]";
    }

}

class CocheAutonomo1 extends Coche1 {

    int numSensores;

    public CocheAutonomo1(String marca, String modelo) {
        super(marca, modelo);
        this.numSensores = 3;
    }

    public String toString() {
        return super.toString() + " [ Coche Autónomo - Número de Sensores: " + numSensores + " ]";
    }

}

class Moto1 extends Vehiculo1 {

    boolean sidecar;

    public Moto1(String marca, String modelo) {
        super(marca, modelo);
        this.sidecar = false;
    }

    public String toString() {
        return super.toString() + " [ Moto - Sidecar: " + sidecar + " ]";
    }

}