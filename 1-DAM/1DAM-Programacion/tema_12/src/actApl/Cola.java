package actApl;

import java.util.ArrayList;

public class Cola<E> {

    ArrayList<E> elementos;

    public Cola() {
        this.elementos = new ArrayList<>();
    }

    public void encolar(E elemento) {
        elementos.add(elemento);
    }

    public E desencolar() {
        E desencola = elementos.get(0); // Obtenemos el primer número
        elementos.remove(0); // Eliminamos la primera posición
        return desencola;
    }

    public boolean estaVacia() {
        return elementos.isEmpty();
    }

    public String toString() {
        return elementos.toString();
    }

}
