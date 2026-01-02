package actApl;

import java.util.*;

public class ActApl12_26 {

    static List<List<String>> repartidorAlumnos(List<String> lista, int numGrupos) {
        // Barajar la lista de alumnos de forma aleatoria
        Collections.shuffle(lista);

        List<List<String>> grupos = new ArrayList<>();

        int alumnosRestantes = lista.size() % numGrupos;
        int indiceAlumno = 0;

        for (int i = 0; i < numGrupos; i++) {
            int tamanoGrupo =  lista.size() / numGrupos;
            if (alumnosRestantes > 0) {
                tamanoGrupo++;
                alumnosRestantes--;
            }
            List<String> grupo = new ArrayList<>(lista.subList(indiceAlumno, indiceAlumno + tamanoGrupo));
            grupos.add(grupo);
            indiceAlumno += tamanoGrupo;
        }
        return grupos;
    }

    public static void main(String[] args) {

        List<String> alumnos = new ArrayList<>();
        alumnos.add("Juan");
        alumnos.add("Maria");
        alumnos.add("Pedro");
        alumnos.add("Ana");
        alumnos.add("Luis");
        alumnos.add("Elena");
        alumnos.add("Carlos");
        alumnos.add("Laura");

        int numGrupos = 3;

        List<List<String>> grupos = repartidorAlumnos(alumnos, numGrupos);

        for (int i = 0; i < grupos.size(); i++) {
            System.out.println("Grupo " + (i + 1) + ": " + grupos.get(i));
        }

    }
}
