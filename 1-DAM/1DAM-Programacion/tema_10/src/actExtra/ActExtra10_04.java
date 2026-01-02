package actExtra;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ActExtra10_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (BufferedReader in = new BufferedReader(new FileReader("LineasOrdenadas.txt"));
			 BufferedWriter out1 = new BufferedWriter(new FileWriter("Menores.txt"));
			 BufferedWriter out2 = new BufferedWriter(new FileWriter("Mayores.txt"))) {
		
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Introduce cuál va a ser la longitud mínima de la palabra: ");
			int min = sc.nextInt();
			
			String linea;
			
			while ((linea = in.readLine()) != null) {
				
				String[] palabras = linea.split(" ");
				
				for (int i = 0; i < palabras.length; i++) {
					
				    String palabra = palabras[i];
				    
				    if (palabra.length() < min) {
				        // Escribir en el archivo de palabras menores
				        out1.write(palabra + " ");
				    } else {
				        // Escribir en el archivo de palabras mayores
				        out2.write(palabra + " ");
				    }
				    
				}
				
			}
			
            System.out.println("Se han introducido correctamente las palabras.");
			
		} catch (IOException ex) {
			
			System.out.println(ex.getMessage());
			
		}
		
	}

}
