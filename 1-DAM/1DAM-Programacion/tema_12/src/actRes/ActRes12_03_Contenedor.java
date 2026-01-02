package actRes;

import java.util.Arrays;

public class ActRes12_03_Contenedor<T> implements ActRes12_03_Pila<T> {

    private T[] objetos;

    public ActRes12_03_Contenedor(T[] objetos) {
        this.objetos = objetos;
    }
    void insertarAlFinal(T nuevo) {
        objetos = Arrays.copyOf(objetos, objetos.length + 1);
        objetos[objetos.length - 1] = nuevo;
    }

    void insertarAlPrincipio(T nuevo) {
        objetos = Arrays.copyOf(objetos, objetos.length + 1);
        System.arraycopy(objetos, 0, objetos, 1, objetos.length - 1);
        objetos[0] = nuevo;
    }

    T extraerDelFinal() {
        T res = null;
        if (objetos.length > 0) {
            res = objetos[objetos.length - 1];
            objetos = Arrays.copyOf(objetos, objetos.length - 1);
        }
        return res;
    }

    T extraerDelPrincipio() {
        T res = null;
        if (objetos.length > 0) {
            res = objetos[0];
            objetos = Arrays.copyOfRange(objetos, 1, objetos.length);
        }
        return res;
    }

    void ordenar() {
        Arrays.sort(objetos);
    }

    public String toString() {
        return Arrays.deepToString(objetos);
    }

    @Override
    public void apilar(T nuevo) {
        this.insertarAlPrincipio(nuevo);
    }

    @Override
    public T desapilar() {
        return this.extraerDelPrincipio();
    }
}
