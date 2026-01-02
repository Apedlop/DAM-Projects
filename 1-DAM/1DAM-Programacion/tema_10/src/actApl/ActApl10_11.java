package actApl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ActApl10_11 {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre de un fichero: ");
        String fichero = sc.nextLine();

        // Si el usuario no proporciona ningún nombre de archivo, utiliza "prueba.txt" por defecto
        if (fichero.isEmpty()) {
            fichero = "prueba.txt";
        }

        try {
        	
            BufferedReader in = new BufferedReader(new FileReader(fichero));
            String linea;

            System.out.println("Contenido del archivo '" + fichero + "':");
            
            while ((linea = in.readLine()) != null) {
                System.out.println(linea);
            }
            
        } catch (IOException ex) {
        	
            System.err.println(ex.getMessage());
            
        }
    }
}
