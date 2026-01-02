package ActAmpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ActAmpl12_27 {

    static List<Character> leeCadena() {
        List<Character> lista = new ArrayList<>();
        System.out.println("Introduce una frase: ");
        String cadena = new Scanner(System.in).nextLine();
        cadena = cadena.replaceAll(" ", "");
        for (int i = 0; i < cadena.length(); i++) {
            lista.add(cadena.charAt(i));
        }
        return lista;
    }

    public static void main(String[] args) {

        List<Character> lista = leeCadena();
        System.out.println("Lista de caracteres: " + lista);

    }

}
