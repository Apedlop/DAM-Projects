package ActExtra3;

public class Ejercicio2 {

    public static void main(String[] args) {

        int num, max = 0, min = 200;

        for (int i = 0; i < 50; i++) {
            num = (int) (Math.random() * (199 - 100 + 1) + 100);
            System.out.print(num + " ");
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("\nMáximo:" + max);
        System.out.println("Mínimo: " + min);

    }

}
