package actApl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class ActApl10_13_1 {

    public static void main(String[] args) {

        // Inicializar variables y lista vacía
        try (BufferedReader entrada1 = new BufferedReader(new FileReader("lista1.txt"));
             BufferedReader entrada2 = new BufferedReader(new FileReader("lista2.txt"));
             BufferedWriter salida = new BufferedWriter(new FileWriter("listaOrdenada.txt"))) {

            String linea1, linea2 = null;
            int[] numeros = new int[0]; // Array vacío para almacenar los números

            // Leer y acumular números de ambos archivos
            while ((linea1 = entrada1.readLine()) != null || (linea2 = entrada2.readLine()) != null) {

                // Agregar los números de la primera lista a la lista combinada
                if (linea1 != null) {
                    int numero1 = Integer.valueOf(linea1);
                    numeros = Arrays.copyOf(numeros, numeros.length + 1); // Redimensionar el array
                    numeros[numeros.length - 1] = numero1; // Agregar número de lista1
                }

                // Agregar los números de la segunda lista a la lista combinada
                if (linea2 != null) {
                    int numero2 = Integer.valueOf(linea2);
                    numeros = Arrays.copyOf(numeros, numeros.length + 1); // Redimensionar el array
                    numeros[numeros.length - 1] = numero2; // Agregar número de lista2
                }
                
            }

            // Ordenar los números acumulados con el método de burbuja
            boolean intercambiado;
            
            do {
            	
                intercambiado = false;
                for (int i = 0; i < numeros.length - 1; i++) {
                
                	if (numeros[i] > numeros[i + 1]) {
                        int temp = numeros[i];
                        numeros[i] = numeros[i + 1];
                        numeros[i + 1] = temp;
                        intercambiado = true;
                    }
                
                }
                
            } while (intercambiado);

            // Escribir los números ordenados en el archivo de salida
            for (int numero : numeros) {
                salida.write(Integer.toString(numero));
                salida.newLine();
            }

            System.out.println("Listas combinadas y guardadas en orden en listaOrdenada.txt.");

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
