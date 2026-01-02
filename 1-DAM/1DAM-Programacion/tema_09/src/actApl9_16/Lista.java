package actApl9_16;

import java.util.Arrays;

public class Lista implements Cola, Pila {

    private Object[] tabla;

    public Lista() {
        tabla = new Object[0];
    }

    @Override
    public void encolar(Object nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = nuevo;
    }

    @Override
    public Object desencolar() {
        if (tabla.length == 0) {
            return null;
        }
        Object resultado = tabla[0];
        Object[] nuevaTabla = new Object[tabla.length - 1];
        System.arraycopy(tabla, 1, nuevaTabla, 0, tabla.length - 1);
        tabla = nuevaTabla;
        return resultado;
    }

    @Override
    public boolean estaVacia() {
        return tabla.length == 0;
    }

    @Override
    public int tamano() {
        return tabla.length;
    }

    @Override
    public void apilar(Object elemento) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1);
        tabla[0] = elemento;
    }

    @Override
    public Object desapilar() {
        if (tabla.length == 0) {
            return null;
        }
        Object resultado = tabla[0];
        Object[] nuevaTabla = new Object[tabla.length - 1];
        System.arraycopy(tabla, 1, nuevaTabla, 0, tabla.length - 1);
        tabla = nuevaTabla;
        return resultado;
    }
}