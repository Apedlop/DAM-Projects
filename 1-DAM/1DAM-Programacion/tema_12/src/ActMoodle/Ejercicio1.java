package ActMoodle;

import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Ejercicio1 {

    public static void main(String[] args) {

        SortedSet<Persona> persona = new TreeSet<>();
        Scanner sc = new Scanner(System.in);

        int opcion;

        do {

            System.out.println("1. Agregar una nueva persona a la lista.");
            System.out.println("2. Eliminar una persona específica de la lista basándose en su nombre.");
            System.out.println("3. Actualizar la edad de una persona específica.");
            System.out.println("4. Mostrar la lista completa de personas.");
            System.out.println("5. Calcular y mostrar la edad promedio de las personas en la lista.");
            System.out.println("6. Salir.");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce un nombre: ");
                    String nombre = sc.next();
                    System.out.println("Introduce una edad: ");
                    int edad = sc.nextInt();
                    Persona p = new Persona(nombre, edad);
                    persona.add(p);
                    break;
                case 2:
                    System.out.println("Introduce el nombre de la persona: ");
                    nombre = sc.next();
                    persona.remove(new Persona(nombre));
                    break;
                case 3:
                    System.out.println("Introduce el nombre de la persona: ");
                    nombre = sc.next();
                    System.out.println("Introduce la nueva edad: ");
                    edad = sc.nextInt();
                    Persona.modificarEdadPorNombre(persona, nombre, edad);
                    break;
                case 4:
                    System.out.println(persona);
                    break;
                case 5:
                    if (persona.isEmpty()) {
                        System.out.println("La lista de personas está vacía.");
                    } else {
                        int sumaEdad = 0;
                        for (Persona personaActual : persona) { // Cambio de nombre de la variable p a personaActual
                            sumaEdad += personaActual.getEdad();
                        }
                        double edadPromedio = (double) sumaEdad / persona.size();
                        System.out.println("La edad promedio de las personas en la lista es: " + edadPromedio);
                    }
                    break;

            }

        } while (opcion != 6);

    }

}
