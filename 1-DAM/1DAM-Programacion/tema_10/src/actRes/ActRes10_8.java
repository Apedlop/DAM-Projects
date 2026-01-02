package actRes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ActRes10_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe el nombre del fichero: ");
		String fichero = sc.nextLine();
		
		String copiaFichero = "copia_de_" + fichero;
		
		try (BufferedReader in = new BufferedReader(new FileReader(fichero));
			 BufferedWriter out = new BufferedWriter(new FileWriter(copiaFichero))) {
					
			int c = in.read();
			
			while (c != -1) {
				out.write(c);
				c = in.read();
			}
			
		} catch (IOException ex) {
			
			System.out.println(ex.getMessage());
			
		}
		
	}

}
