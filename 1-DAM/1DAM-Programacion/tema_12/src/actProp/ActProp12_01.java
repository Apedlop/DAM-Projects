package actProp;

import java.util.Arrays;

public class ActProp12_01 {

    static <E> E[] concatenar(E[] elem1, E[] elem2) {
        E[] nuevaTabla = Arrays.copyOf(elem1, elem1.length + elem2.length);
        System.arraycopy(elem2, 0, nuevaTabla, elem1.length, elem2.length);
        return nuevaTabla;
    }

    public static void main(String[] args) {
        Integer t1[] = {1, 2, 3};
        Integer t2[] = {4, 5, 6};
        Integer concatenado[] = concatenar(t1, t2);
        System.out.println("Tabla concatenada: " + Arrays.toString(concatenado));
    }

}
