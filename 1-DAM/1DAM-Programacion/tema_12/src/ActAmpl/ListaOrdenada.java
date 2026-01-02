package ActAmpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListaOrdenada<E extends Comparable<E>> {

    List<E> listaOrdenada;
    Comparator<E> ordenar;

    public ListaOrdenada() {
        this.listaOrdenada = new ArrayList<>();
        this.ordenar = Comparator.naturalOrder();
    }

    public ListaOrdenada(Comparator<E> orden) {
        this.listaOrdenada = new ArrayList<>();
        this.ordenar = orden;
        Collections.sort(listaOrdenada, orden);
    }

    void insertar(E num) {
        listaOrdenada.add(num);
        Collections.sort(listaOrdenada, ordenar);
    }

    public List<E> getListaOrdenada() {
        return listaOrdenada;
    }

    @Override
    public String toString() {
        return listaOrdenada.toString();
    }

}
