package actApl;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ActApl10_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			FileInputStream in = new FileInputStream("Deportistas.txt");
			Scanner sc = new Scanner(in).useLocale(Locale.US);

			int edad = 0;
			double sumaEdad = 0;
			double peso = 0;
			double sumaPeso = 0;
			double estatura = 0;
			double sumaEstatura = 0;
			int contadorDeportistas = 0;

			// Saltar la pruiemra línea
			sc.nextLine();

			// Leer cada línea de datos de deportistas y procesarla
			while (sc.hasNextLine()) {
				
			    String nombre = "";
			    
			    while (!sc.hasNextInt()) {
			        nombre += sc.next() + " ";
			    }
			    
			    contadorDeportistas++;
			    
			    edad = sc.nextInt();
			    sumaEdad += edad;
			    
			    peso = sc.nextDouble();
			    sumaPeso += peso;
			    
			    estatura = sc.nextDouble();
			    sumaEstatura += estatura; 
			    
			    System.out.println("Nombre: " + nombre + "\tEdad: " + edad + "\tPeso: " + peso + "\tEstatura: " + estatura);
			}
			
			System.out.println("\nMedia edades: " + sumaEdad / contadorDeportistas);
			System.out.println("Media pesos: " + sumaPeso / contadorDeportistas);
			System.out.println("Media estatura: " + sumaEstatura / contadorDeportistas);
		
		} catch (IOException ex) {

			System.out.println(ex.getMessage());

		}

	}

}
