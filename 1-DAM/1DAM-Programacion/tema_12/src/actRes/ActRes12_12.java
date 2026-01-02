package actRes;

import java.util.HashSet;
import java.util.Set;

public class ActRes12_12 {

    static <E> Set<E> union(Set<E> conj1, Set<E> conj2) {
        Set<E> resultado = new HashSet<>(conj1);
        resultado.addAll(conj2);
        return resultado;
    }

    static <E> Set<E> interseccion(Set<E> conj1, Set<E> conj2) {
        Set<E> interseccion = new HashSet<>(conj1);
        interseccion.retainAll(conj2); // Borra todos los elementos de interseccion salvo los que estén en conj2. Solo quedan los comunes a ambos
        return interseccion;
    }

    static <E> Set<E> diferencia(Set<E> conj1, Set<E> conj2) {
        Set<E> diferencia = new HashSet<>(conj1);
        diferencia.removeAll(conj2); // Elimina todos los elementos de conj1 que también estén en conj2
        return diferencia;
    }

    public static void main(String[] args) {
        Set<Integer> conjunto1 = new HashSet<>();
        conjunto1.add(1);
        conjunto1.add(2);
        conjunto1.add(3);

        Set<Integer> conjunto2 = new HashSet<>();
        conjunto2.add(3);
        conjunto2.add(4);
        conjunto2.add(5);

        // Probando la unión
        Set<Integer> unionSet = union(conjunto1, conjunto2);
        System.out.println("Unión: " + unionSet);

        // Probando la intersección
        Set<Integer> interseccionSet = interseccion(conjunto1, conjunto2);
        System.out.println("Intersección: " + interseccionSet);

        // Probando la diferencia
        Set<Integer> diferenciaSet = diferencia(conjunto1, conjunto2);
        System.out.println("Diferencia: " + diferenciaSet);
    }
}
