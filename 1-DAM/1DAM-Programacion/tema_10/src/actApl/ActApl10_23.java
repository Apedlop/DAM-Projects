package actApl;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ActApl10_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (FileInputStream in = new FileInputStream("Deportistas.txt"); 
			 FileWriter out1 = new FileWriter("Nombre-Edad.txt");
			 FileWriter out2 = new FileWriter("Nombre-Pesos.txt");
			 FileWriter out3 = new FileWriter("Nombre-Estatura.txt")) {
		
			 Scanner sc = new Scanner(in).useLocale(Locale.US);
			
			 sc.nextLine();
			 
			while (sc.hasNextLine()) {
				
				String nombre = "";
				
				while (!sc.hasNextInt()) {
					nombre += sc.next() + " ";
				}
				
				int edad = sc.nextInt();
				double peso = sc.nextDouble();
				double estatura = sc.nextDouble();
				
				out1.write("Nombre: " + nombre.trim() + "\tEdad: " + edad + "\n");
				out2.write("Nombre: " + nombre.trim() + "\tPeso: " + peso + "\n");
				out3.write("Nombre: " + nombre.trim() + "\tEstatura: " + estatura + "\n");
				
			}
			
		} catch (IOException ex) {
			
			System.out.println(ex.getMessage());
			
		}
		
	}

}
