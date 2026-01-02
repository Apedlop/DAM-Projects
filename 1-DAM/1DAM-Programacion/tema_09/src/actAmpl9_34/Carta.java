package actAmpl9_34;

public class Carta {

	private int numero;
    private TipoPalo palo;

    public Carta(int numero, TipoPalo palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public TipoPalo getPalo() {
        return palo;
    }

    @Override
    public String toString() {
        return numero + " de " + palo;
    }

    // Método estático para devolver una carta al azar
    public static Carta devolverCarta() {
        int numero = (int) (Math.random() * 13) + 1; // Genera un número aleatorio entre 1 y 13
        TipoPalo palo = TipoPalo.values()[(int) (Math.random() * TipoPalo.values().length)]; // Obtiene un palo aleatorio
        return new Carta(numero, palo);
    }
}
