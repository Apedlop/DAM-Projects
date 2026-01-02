package actRes;

import java.util.Arrays;

public class ActRes12_01 {

    static <E> E[] guardar(E elem, E[] tabla) {
        E[] nuevaTabla = Arrays.copyOf(tabla, tabla.length + 1);
        nuevaTabla [nuevaTabla.length - 1] = elem;
        return nuevaTabla;
    }

    public static void main(String[] args) {

        String cadenas[] = new String[0];
        System.out.println("Antes de añadir: " + Arrays.toString(cadenas));
        cadenas = guardar("coche", cadenas);
        cadenas = guardar("camión", cadenas);
        cadenas = guardar("avión", cadenas);
        System.out.println("Después de añadir: " + Arrays.toString(cadenas));

    }

}
