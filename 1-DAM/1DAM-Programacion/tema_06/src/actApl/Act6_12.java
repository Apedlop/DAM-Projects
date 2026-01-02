package actApl;

import java.util.Scanner;

public class Act6_12 {
	
//  ---
// |   |
// |   o
// |  /|\
// |   |
// |  / \
// |
//-----
	
	static void muñeco(int intentos) {
		
		switch (intentos) {
			case 0:
				System.out.println("  ---");
				System.out.println(" |   |");
				System.out.println(" |   o");
				System.out.println(" |  /|\\");
				System.out.println(" |   |");
				System.out.println(" |  / \\");
				System.out.println(" |");
				System.out.println("-----");
				break;
			case 1:
				System.out.println("  ---");
				System.out.println(" |   |");
				System.out.println(" |   o");
				System.out.println(" |  /|\\");
				System.out.println(" |   |");
				System.out.println(" |");
				System.out.println(" |");
				System.out.println("-----");
				break;
			case 2:
				System.out.println("  ---");
				System.out.println(" |   |");
				System.out.println(" |   o");
				System.out.println(" |   |");
				System.out.println(" |   |");
				System.out.println(" |");
				System.out.println(" |");
				System.out.println("-----");
				break;
			case 3:
				System.out.println("  ---");
				System.out.println(" |   |");
				System.out.println(" |   o");
				System.out.println(" |");
				System.out.println(" |");
				System.out.println(" |");
				System.out.println(" |");
				System.out.println("-----");
				break;
			case 4:
				System.out.println("  ---");
				System.out.println(" |   |");
				System.out.println(" |");
				System.out.println(" |");
				System.out.println(" |");
				System.out.println(" |");
				System.out.println(" |");
				System.out.println("-----");
				break;
			case 5: 
				System.out.println("  ---");
				System.out.println(" |");
				System.out.println(" |");
				System.out.println(" |");
				System.out.println(" |");
				System.out.println(" |");
				System.out.println(" |");
				System.out.println("-----");
				break;
			case 6:
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("-----");
				break;
				
		}
		
	}

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String original, pista = "";
        int intentos = 7;

        System.out.println("Jugador 1, introduce la palabra secreta: ");
        original = sc.nextLine().toLowerCase();

        for (int i = 0; i < original.length(); i++) {
            pista += "_ ";
        }

        while (intentos > 0 && !pista.equals(original)) {

            System.out.println(pista);
            muñeco(intentos);
            System.out.println("Intentos restantes: " + intentos);

            System.out.println("Jugador 2, introduce una letra o la palabra completa: ");
            String entrada = sc.nextLine().toLowerCase();

            if (entrada.length() == 1 && Character.isLetter(entrada.charAt(0))) {

                char letra = entrada.charAt(0);
                boolean letraAdivinada = false;

                StringBuilder nuevaPalabra = new StringBuilder(pista);

                for (int i = 0; i < original.length(); i++) {
                    if (original.charAt(i) == letra) {
                        nuevaPalabra.setCharAt(2 * i, letra); // Cambia la posición de los guiones bajos
                        letraAdivinada = true;
                    }
                }

                if (!letraAdivinada) {
                    intentos--;
                }

                pista = nuevaPalabra.toString();

            } else if (entrada.length() == original.length() && entrada.equals(original)) {

                pista = original;

            } else {

                System.out.println("Entrada no válida. Intenta de nuevo.");

            }

        }

        if (pista.equals(original)) {
            System.out.println("¡Acertaste!");
        } else {
        	muñeco(intentos);
            System.out.println("Perdiste.");
            System.out.println("La palabra era: " + original);
        }

    }
}


