package ejerPrueba;

public class Principal {

    public static void main(String[] args) {

        Persona p = new Persona();
        String hoy = "Miércoles";
        Persona.setHoy(hoy);
        String nomb = "Alberto";
        p.setNombre(nomb);
        p.setEdad((byte) 22);
        double est = 1.67;
        p.setEstatura(est);
        System.out.println("El nombre de la persona es " + p.getNombre());
        System.out.println("Día hoy: " + Persona.getHoy());
        p.mostrar();
        p.cambiarEdad();

        System.out.println("");

        Persona p2 = new Persona();
        p2.setNombre("Laura");
        p2.setEdad((byte)40);
        p2.setEstatura(1.58);
        System.out.println("El nombre de la persona es " + p2.getNombre());
        System.out.println("Día hoy: " + Persona.getHoy());
        p2.mostrar();
        p2.cambiarEdad();

        System.out.println("");

        Persona p3 = new Persona("Claudia", (byte) 8, 1.20);
        System.out.println("El nombre de la persona es " + p3.getNombre());
        System.out.println("Día hoy: " + Persona.getHoy());
        
        System.out.println("");

        Vehiculo v = new Vehiculo();
        v.matricula = "1234JJJJ";
        v.color = "azul";
        v.marca = "renault";
        v.modelo = "clio";
        v.mostrar();
        v.pintar("amarillo");
    }
}
