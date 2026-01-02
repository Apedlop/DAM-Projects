package proyecCartas;

public class Jugador {

	private String nombre;
    private Carta[] mano;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.mano = new Carta[5]; // Cada jugador tiene una mano de 5 cartas
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarCarta(Carta carta) {
        // Buscar el primer espacio vacío en la mano y agregar la carta
        for (int i = 0; i < mano.length; i++) {
            if (mano[i] == null) {
                mano[i] = carta;
                break;
            }
        }
    }

    public void mostrarMano() {
        for (int i = 0; i < mano.length; i++) {
            Carta carta = mano[i];
            if (carta != null) {
                System.out.println(carta);
            }
        }
    }
	
}
