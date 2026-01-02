package actApl;
import java.util.*;

public class ActApl12_19 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();

        String[] palabras = frase.split(" ");

        // Convertir el arreglo de palabras en una lista
        List<String> listaPalabras = new ArrayList<>(Arrays.asList(palabras));
        System.out.println("Lista completa: " + listaPalabras);

        // Creamos la lista de no repetidos añadiendole la listaPalabras (que es la original)
        Set<String> sinRepeticiones = new LinkedHashSet<>(listaPalabras);
        System.out.println("Lista sin repetidos: " + sinRepeticiones);

        // Creamos la lista de las repetidas añadiendole la listaPalabras (que es la original)
        List<String> listaRepetidas = new ArrayList<>(listaPalabras);
        for (String e : sinRepeticiones) {
            listaRepetidas.remove(e);
        }
        System.out.println("Repetidas: " + listaRepetidas);

        Set<String> listaUnicas = new HashSet<>(listaPalabras);
        listaUnicas.removeAll(listaRepetidas);
        System.out.println("Lista únicas: " + listaUnicas);
    }
}
