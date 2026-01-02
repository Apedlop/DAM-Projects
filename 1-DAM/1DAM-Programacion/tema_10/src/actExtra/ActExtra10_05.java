package actExtra;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ActExtra10_05 {

    public static void main(String[] args) {

        try (BufferedReader in = new BufferedReader(new FileReader("Matriculas.txt"));
             BufferedWriter out = new BufferedWriter(new FileWriter("MatriculasValidas.txt"))) {

            String linea;

            while ((linea = in.readLine()) != null) {

                if (esMatriculaValida(linea)) {
                    out.write(linea);
                    out.newLine(); // Agregar una nueva línea después de escribir cada matrícula válida
                }

            }

        } catch (IOException ex) {

            System.out.println(ex.getMessage());

        }

        System.out.println("Se han insertado correctamente las matrículas válidas.");

    }

    private static boolean esMatriculaValida(String matricula) {

        // Verificar si la longitud de la matrícula es correcta
        if (matricula.length() != 8) {
            return false;   
        }

        // Verificar las tres letras iniciales
        for (int i = 0; i < 3; i++) {
        	
            char letra = matricula.charAt(i);
            
            // Verificar si es una letra mayúscula y no vocal
            if (!(Character.isUpperCase(letra) && !esVocal(letra))) 
                return false;
            
        }

        // Verificar el espacio en blanco en la cuarta posición
        if (matricula.charAt(3) != ' ')
            return false;

        // Verificar los cuatro dígitos
        for (int i = 4; i < 8; i++) {
            if (!Character.isDigit(matricula.charAt(i)))
                return false;
        }

        return true;
        
    }

    // Función para verificar si un carácter es una vocal
    private static boolean esVocal(char c) {
    	
        c = Character.toUpperCase(c);
        
        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    
    }
    
}
