package Examen4y5;

public class Ejercicio4 {

    public static void main(String[] args) {
        int[] vectorReferencia = {1, 2, 3, 4, 5};
        int[] secuencia1 = {1, 2, 3}; // Secuencia a buscar
        int[] secuencia2 = {1, 3, 2}; // Otra secuencia

        boolean contieneSecuencia1 = contieneSecuencia(vectorReferencia, secuencia1);
        boolean contieneSecuencia2 = contieneSecuencia(vectorReferencia, secuencia2);

        System.out.println("¿El vector contiene la secuencia 1? " + contieneSecuencia1);
        System.out.println("¿El vector contiene la secuencia 2? " + contieneSecuencia2);
    }

    public static boolean contieneSecuencia(int[] vector, int[] secuencia) {
        if (secuencia.length > vector.length) {
            return false; // La secuencia es más larga que el vector, no puede estar contenida
        }

        for (int i = 0; i <= vector.length - secuencia.length; i++) {
            boolean match = true;
            for (int j = 0; j < secuencia.length; j++) {
                if (vector[i + j] != secuencia[j]) {
                    match = false;
                    break;
                }
            }
            if (match) {
                return true; // Encontramos la secuencia
            }
        }
        return false; // No se encontró la secuencia
    }
}


