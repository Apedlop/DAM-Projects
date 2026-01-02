package actApl;

import java.util.ArrayList;

public class Pila<E> {

    ArrayList<E> elementos;

    public Pila() {
        this.elementos = new ArrayList<>();
    }

    public void apilar (E elemento) {
        elementos.add(elemento);
    }

    public E desapilar() {
        return elementos.remove(elementos.size() - 1); // El -1 devuelve el índice del último elemento en la lista elementos.
    }

    public boolean estaVacia() {
        return elementos.isEmpty();
    }

    public String toString() {
        return elementos.toString();
    }
}
