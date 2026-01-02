package actApl9_13;

import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {
    	
        // Crear un array de futbolistas
        Futbolista[] futbolistas = {
            new Futbolista("11111111A", "Lionel Messi", 34, 745),
            new Futbolista("22222222B", "Cristiano Ronaldo", 36, 801),
            new Futbolista("33333333C", "Neymar Jr.", 29, 280),
            new Futbolista("44444444D", "Robert Lewandowski", 33, 517),
            new Futbolista("55555555E", "Kylian Mbappé", 23, 156)
        };

        // Mostrar array de futbolistas ordenado por DNI
        System.out.println("Futbolistas ordenados por DNI:");
        Arrays.sort(futbolistas);
        
        for (int i = 0; i < futbolistas.length; i++) {
            System.out.println(futbolistas[i]);
        }

        // Mostrar array de futbolistas ordenado por nombre
        System.out.println("\nFutbolistas ordenados por nombre:");
        Arrays.sort(futbolistas);
        
        for (int i = 0; i < futbolistas.length; i++) {
            System.out.println(futbolistas[i]);
        }

        // Mostrar array de futbolistas ordenado por edad
        System.out.println("\nFutbolistas ordenados por edad:");
        Arrays.sort(futbolistas);
        
        for (int i = 0; i < futbolistas.length; i++) {
            System.out.println(futbolistas[i]);
        }
    }
}
