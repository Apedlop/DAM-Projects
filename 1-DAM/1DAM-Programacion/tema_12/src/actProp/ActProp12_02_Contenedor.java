package actProp;

public class ActProp12_02_Contenedor<T> implements ActProp12_02_Cola<T> {

    private Object[] elementos;
    private int tamaño;
    private int capacidadInicial = 10;

    public ActProp12_02_Contenedor() {
        this.elementos = new Object[capacidadInicial];
        this.tamaño = 0;
    }

    @Override
    public void encolar(T elemento) {
        if (tamaño == elementos.length) {
            ampliarCapacidad();
        }
        elementos[tamaño++] = elemento;
    }

    @Override
    public T desencolar() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        T elementoDesencolado = (T) elementos[0];
        System.arraycopy(elementos, 1, elementos, 0, tamaño - 1);
        tamaño--;
        return elementoDesencolado;
    }

    @Override
    public boolean estaVacia() {
        return tamaño == 0;
    }

    private void ampliarCapacidad() {
        int nuevaCapacidad = elementos.length * 2;
        Object[] nuevoArreglo = new Object[nuevaCapacidad];
        System.arraycopy(elementos, 0, nuevoArreglo, 0, tamaño);
        elementos = nuevoArreglo;
    }

}
