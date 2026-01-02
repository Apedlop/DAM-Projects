package actApl;

public class ActApl12_18 {

    public static void main(String[] args) {

        Pila<Integer> pila = new Pila<>();
        pila.apilar(1);
        pila.apilar(2);
        pila.apilar(3);

        System.out.println("Pila original: " + pila);

        System.out.print("Desapilamos: ");
        while (!pila.estaVacia()) {
            System.out.print(pila.desapilar() + " ");
        }

    }

}
