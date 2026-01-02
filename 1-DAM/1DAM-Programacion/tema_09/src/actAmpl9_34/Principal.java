package actAmpl9_34;

public class Principal {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Carta[] cartas = new Carta[52];
        int index = 0;
        for (int numero = 1; numero <= 13; numero++) {
            for (TipoPalo palo : TipoPalo.values()) {
                cartas[index++] = new Carta(numero, palo);
            }
        }

        // Barajar las cartas
        for (int i = 0; i < cartas.length; i++) {
            int randomIndex = (int) (Math.random() * cartas.length);
            Carta temp = cartas[i];
            cartas[i] = cartas[randomIndex];
            cartas[randomIndex] = temp;
        }

        // Imprimir las cartas desordenadas
        System.out.println("Cartas desordenadas:");
        for (Carta carta : cartas) {
            System.out.println(carta);
        }

        // Imprimir las cartas ordenadas por palo
        System.out.println("\nCartas ordenadas por palo:");
        for (Carta carta : cartas) {
            System.out.println(carta);
        }

        // Ordenar las cartas por número
        OrdenaNumero.ordenarPorNumero(cartas);

        // Imprimir las cartas ordenadas por número
        System.out.println("\nCartas ordenadas por número:");
        for (Carta carta : cartas) {
            System.out.println(carta);
        }

        // Obtener una carta al azar
        Carta cartaAlAzar = Carta.devolverCarta();
        System.out.println("\nCarta al azar: " + cartaAlAzar);

    }

}
