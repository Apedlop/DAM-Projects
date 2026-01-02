package actApl;

public class ActApl12_17 {

    public static void main(String[] args) {

        Cola<Integer> cola = new Cola<>();
        cola.encolar(1);
        cola.encolar(2);
        cola.encolar(3);

        System.out.println("Cola original: " + cola);

        System.out.print("Desencolada: ");
        while (!cola.estaVacia()) {
            System.out.print(cola.desencolar() + " ");
        }

    }

}
