package actApl;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ActApl10_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

        try (BufferedWriter out = new BufferedWriter(new FileWriter("datos.txt", true));) {
            
        	System.out.println("Introduce tu nombre: ");
            String nombre = sc.nextLine();

            System.out.println("Introduce tu edad: ");
            int edad = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea pendiente
            
            // Si el archivo no existe, se crea automáticamente
            // Guardar los datos al final del archivo en una nueva línea
            out.write(nombre + ", " + edad);
            out.newLine();

            out.close();

            System.out.println("Datos guardados correctamente en datos.txt.");
            
        } catch (IOException ex) {
        	
            System.out.println(ex.getMessage());
            
        }
    }
}		
