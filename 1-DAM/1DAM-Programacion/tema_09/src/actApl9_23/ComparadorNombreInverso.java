package actApl9_23;

import java.util.Comparator;

public class ComparadorNombreInverso implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Socio socio1 = (Socio) o1;
        Socio socio2 = (Socio) o2;
        return socio2.nombre.compareTo(socio1.nombre);
    }
}