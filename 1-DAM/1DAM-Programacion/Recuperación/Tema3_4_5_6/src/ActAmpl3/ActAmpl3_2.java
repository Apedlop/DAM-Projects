package ActAmpl3;

public class ActAmpl3_2 {

    public static void main(String[] args) {

        int num, max = 99, min = 200, contador = 0, suma = 0;

        for (int i = 0; i < 5; i++) {
            contador++;
            num = (int) (Math.random() * (199 - 100) + 100);
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            suma += num;
        }

        System.out.println("El máximo es: " + max);
        System.out.println("El mínimo es: " + min);
        double media = (double) suma / contador;
        System.out.println("La media es: " + media);
        
    }

}
