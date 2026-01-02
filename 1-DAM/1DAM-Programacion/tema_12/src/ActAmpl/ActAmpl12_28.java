package ActAmpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ActAmpl12_28 {

    static List<Character> uneCadenas(List<Character> cad1, List<Character> cad2) {
        List<Character> resultado = new ArrayList<>(cad1); // Inicializamos la lista resultado con los elementos de cad1
        resultado.addAll(cad2); // Agregamos todos los elementos de cad2 a la lista resultado
        return resultado; // Devolvemos la lista resultado que contiene la unión de cad1 y cad2
    }

    public static void main(String[] args) {

        List<Character> cad1 = new ArrayList<>();
        System.out.println("Introduce una frase: ");
        String frase1 = new Scanner(System.in).nextLine();
        for (int i = 0; i < frase1.length(); i++) {
            cad1.add(frase1.charAt(i));
        }

        List<Character> cad2 = new ArrayList<>();
        System.out.println("Introduce otra frase: ");
        String frase2 = new Scanner(System.in).nextLine();
        for (int i = 0; i < frase2.length(); i++) {
            cad1.add(frase2.charAt(i));
        }

        List<Character> unir = uneCadenas(cad1, cad2);

        System.out.println("Lista unida: " + unir);

    }

}
