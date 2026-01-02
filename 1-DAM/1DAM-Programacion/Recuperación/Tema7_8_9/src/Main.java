import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] t = {1, 3, 5, 7};
        int[] t2 = {2, 4, 6, 8};

        int[] tNuevo = new int[t.length + t2.length]; // Nuevo arreglo con longitud total

        // Copiar elementos del primer arreglo
        System.arraycopy(t, 0, tNuevo, 0, t.length);

        // Copiar elementos del segundo arreglo
        System.arraycopy(t2, 0, tNuevo, t.length, t2.length);

        // Ordenar el nuevo arreglo
        Arrays.sort(tNuevo);

        // Imprimir el nuevo arreglo
        System.out.println(Arrays.toString(tNuevo));
    }
}
