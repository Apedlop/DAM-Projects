package ActAmpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

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

    // Método ejercicioApl 12.12
    void ordenar(Comparator<T> c) {
        Arrays.sort(objetos, c);
    }

    // Método ejercicioApl 12.13
    void ordenarMayorMenor(Comparator<T> c) {
        Arrays.sort(objetos, c);
    }

    //Método ejercicioApl 12.14
    T get(int indice){
        return objetos[indice];
    }

    // Métodos del ejercicioAmpl 12.29
    int[] buscarTodos(Object e) {
        int count = 0;
        for (int i = 0; i < objetos.length; i++) {
            if (objetos[i] != null && objetos[i].equals(e)) {
                count++; // Contamos cuantos objetos hay iguales
            }
        }
        int[] indices = new int[count]; // Hacemos una tabla que sea igual de grande que los objetos encontrados iguales
        int j = 0;
        for (int i = 0; i < objetos.length; i++) {
            if (objetos[i] != null && objetos[i].equals(e)) {
                indices[j++] = i; // Si se cumple el if añadimos i, que es la posición de donde está el igual
            }
        }
        return indices;
    }

    boolean eliminarTodos(Object e) {
        boolean eliminar = false;
        for (int i = 0; i < objetos.length; i++) {
            if (objetos[i] != null && objetos[i].equals(e)) {
                eliminarElemento(i);
                eliminar = true;
            }
        }
        return eliminar;
    }

    void eliminarElemento(int indice) {
        T[] nuevo = Arrays.copyOf(objetos, objetos.length - 1);
        System.arraycopy(objetos, 0, nuevo, 0, indice);
        System.arraycopy(objetos, indice + 1, nuevo, indice, objetos.length - indice - 1);
        objetos = nuevo;
    }

    public String toString() {
        return Arrays.deepToString(objetos);
    }

}
