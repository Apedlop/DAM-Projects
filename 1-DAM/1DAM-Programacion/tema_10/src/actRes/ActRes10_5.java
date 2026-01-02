package actRes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ActRes10_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader in = null;
		
		try {
			
			in = new BufferedReader(new FileReader("Numeros.txt"));
			Scanner sc;
			double numero;
			double suma = 0; 
			String linea = in.readLine();
			
			while (linea != null) {
				
				sc = new Scanner(linea);
				
				if (sc.hasNextDouble()) {
					numero = sc.nextDouble();
					suma += numero;
				}
				
				linea = in.readLine();
				
			}
			
			System.out.println("Suma = " + suma);
			
		} catch (IOException ex) {

			System.out.println(ex.getMessage());
			
		} finally {
			
			if (in != null) {
				
				try {
					in.close();
				} catch (IOException ex) {
					System.out.println(ex.getMessage());
				}
				
			}
		}
		
	}

}
