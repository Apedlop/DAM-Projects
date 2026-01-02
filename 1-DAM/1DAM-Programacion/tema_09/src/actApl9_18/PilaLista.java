package actApl9_18;

public class PilaLista implements Pila {

    private Lista lista;

    public PilaLista() {
        lista = new Lista();
    }

    @Override
    public void apilar(Object elemento) {
        lista.insertarPrincipio(elemento);
    }

    @Override
    public Object desapilar() {
        if (!estaVacia()) {
            return lista.eliminar(0);
        }
        return null;
    }

    @Override
    public boolean estaVacia() {
        return lista.get(0) == null;
    }

    @Override
    public int tamano() {
        return lista.tabla.length;
    }
}
