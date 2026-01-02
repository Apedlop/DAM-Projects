package proyecCartas;

public class OrdenaNumero {

	public static void ordenarPorNumero(Carta[] cartas) {
        for (int i = 0; i < cartas.length - 1; i++) {
            for (int j = i + 1; j < cartas.length; j++) {
                if (cartas[i].getNumero() > cartas[j].getNumero() || (cartas[i].getNumero() == cartas[j].getNumero() && cartas[i].getPalo().compareTo(cartas[j].getPalo()) > 0)) {
                    Carta temp = cartas[i];
                    cartas[i] = cartas[j];
                    cartas[j] = temp;
                }
            }
        }
    }
	
}
