package Comparar;

import java.util.Arrays;
import java.util.Comparator;

public class Principal {
    public static void main(String[] args) {
        Alumno[] alumnos = {
            new Alumno("123", "Juan", 7.5),
            new Alumno("456", "María", 8.2),
            new Alumno("789", "Pedro", 6.8)
        };

        // Ordenar por nombre
        Arrays.sort(alumnos);

        // Imprimir tabla ordenada por nombre
        System.out.println("Tabla ordenada por nombre:");
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println(alumnos[i]);
        }

        // Ordenar por nota media
        Arrays.sort(alumnos, Comparator.comparingDouble(Alumno::getNotaMedia));

        // Imprimir tabla ordenada por nota media
        System.out.println("\nTabla ordenada por nota media:");
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println(alumnos[i]);
        }
        
        // Ordenamos el array por nota media usando un comparador personalizado como clase anónima
        Arrays.sort(alumnos, new Comparator() {
            @Override
            public int compare(Object a, Object b) {
                return Double.compare(((Alumno)a).getNotaMedia(), ((Alumno)b).getNotaMedia());
            }
        });


        // Imprimimos el array ordenado por nota media
        System.out.println("\nTabla ordenada por nota media:");
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println(alumnos[i]);
        }
    }
}
