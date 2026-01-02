package actApl;

import java.util.Arrays;
import java.util.Comparator;

public class Contenedor<T> {

    private T[] objetos;

    public Contenedor(T[] objetos) {
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

    // Método ejercicio 12.12
    void ordenar(Comparator<T> c) {
        Arrays.sort(objetos, c);
    }

    // Método ejercicio 12.13
    void ordenarMayorMenor(Comparator<T> c) {
        Arrays.sort(objetos, c);
    }

    //Método ejercicio 12.14
    T get(int indice){
        return objetos[indice];
    }

    public String toString() {
        return Arrays.deepToString(objetos);
    }

}
