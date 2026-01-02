package ActAmpl;

public class ActAmpl12_31 {

    public static void main(String[] args) {

        // Cola
        Cola<Integer> cola = new Cola<>();
        cola.encolar(1);
        cola.encolar(2);
        cola.encolar(3);

        System.out.println("Cola original: " + cola);

        System.out.print("Desencolada: ");
        while (!cola.estaVacia()) {
            System.out.print(cola.desencolar() + " ");
        }

        // Pila
        Pila<Integer> pila = new Pila<>();
        pila.apilar(1);
        pila.apilar(2);
        pila.apilar(3);

        System.out.println("\nPila original: " + pila);

        System.out.print("Desapilamos: ");
        while (!pila.estaVacia()) {
            System.out.print(pila.desapilar() + " ");
        }

    }

}
