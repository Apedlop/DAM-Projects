package ActExtra3;

public class Ejercicio1 {

    public static void main(String[] args) {

        int dado1 = (int) (Math.random() * 6 + 1);
        int dado2 = (int) (Math.random() * 6 + 1);

        while (dado1 != dado2) {
            System.out.println("Dado 1: " + dado1 + ", Dado 2: " + dado2);
            dado1 = (int) (Math.random() * 6 + 1);
            dado2 = (int) (Math.random() * 6 + 1);
        }

        System.out.println("Dado 1: " + dado1 + ", Dado 2: " + dado2);

    }

}
