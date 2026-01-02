package actRes;

import java.util.*;

public class ActRes12_16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<Character, ActRes12_16_Academico> academia = new TreeMap<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Letra: ");
            Character letra = sc.next().charAt(0);
            System.out.println("Nombre: ");
            String nombre = sc.next();
            System.out.println("Año de ingreso: ");
            int ingreso = sc.nextInt();
            nuevoAcademico(academia, new ActRes12_16_Academico(nombre, ingreso), letra);
        }

        System.out.println("Orden por letra: " + academia);

        Collection<ActRes12_16_Academico> sinLetra = academia.values();
        List<ActRes12_16_Academico> listaSinletra = new ArrayList<>(sinLetra);
        Collections.sort(listaSinletra);
        System.out.println("Por nombre sin letra: " + listaSinletra);

        // Ordenado por año de ingreso
        Comparator<ActRes12_16_Academico> comparaIngreso = new Comparator<ActRes12_16_Academico>() {
            @Override
            public int compare(ActRes12_16_Academico o1, ActRes12_16_Academico o2) {
                return o1.aIngreso - o2.aIngreso;
            }
        };

        Collections.sort(listaSinletra, comparaIngreso);
        System.out.println("Por año sin letra: " + listaSinletra);

        // Para que aparezca la letra
        Set<Map.Entry<Character, ActRes12_16_Academico>> conLetra = academia.entrySet();
        List<Map.Entry<Character, ActRes12_16_Academico>> listaConLetra = new ArrayList<>(conLetra); // Convertimos en lista para ordenar las entradas

        // Ordenamos por año de ingreso
        Collections.sort(listaConLetra, new Comparator<Map.Entry<Character, ActRes12_16_Academico>>() {
            @Override
            public int compare(Map.Entry<Character, ActRes12_16_Academico> o1, Map.Entry<Character, ActRes12_16_Academico> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        System.out.println("Orden por nombre: " + listaConLetra);

    }

    public static boolean nuevoAcademico(Map<Character, ActRes12_16_Academico> academia, ActRes12_16_Academico nuevo, Character letra) {
        boolean insertado = false;
        if ((letra >= 'A' && letra <= 'Z') || (letra >= 'a' && letra <= 'z') || letra == 'ñ' || letra == 'Ñ') {
            academia.put(letra, nuevo);
            insertado = true;
        } else {
            System.out.println("Letra no válida.");
        }
        return insertado;
    }

}
