package proyecCartas;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Jugador jugador1 = new Jugador("Jugador 1");
		Jugador jugador2 = new Jugador("Jugador 2");

		// Crear el arreglo de cartas
		Carta[] cartas = new Carta[52];
		int index = 0;
		for (int numero = 1; numero <= 13; numero++) {
		    for (int i = 0; i < TipoPalo.values().length; i++) {
		        TipoPalo palo = TipoPalo.values()[i];
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

		// Repartir 5 cartas a cada jugador
		for (int i = 0; i < 5; i++) {
			jugador1.agregarCarta(cartas[i]);
			jugador2.agregarCarta(cartas[i + 5]); // Se asume que las primeras 5 cartas ya fueron repartidas al jugador1
		}

		// Imprimir las manos de los jugadores
		System.out.println("Mano del " + jugador1.getNombre() + ":");
		jugador1.mostrarMano();
		System.out.println("\nMano del " + jugador2.getNombre() + ":");
		jugador2.mostrarMano();

	}

}
