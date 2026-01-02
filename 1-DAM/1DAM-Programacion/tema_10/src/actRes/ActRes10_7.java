package actRes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ActRes10_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (BufferedWriter out = new BufferedWriter(new FileWriter("Quijote.txt"))) {
			
			String cadena = "En un lugar de la mancha, ";
			out.write(cadena);
			
//			for (int i = 0; i < cadena.length(); i++) {
//				out.write(cadena.charAt(i));
//			}

			cadena = "de cuyo nombre no quiero acordarme.";
			out.newLine();
			out.write(cadena);
			
		} catch (IOException ex) {
			
			System.out.println(ex.getMessage());
			
		}
		
	}

}
