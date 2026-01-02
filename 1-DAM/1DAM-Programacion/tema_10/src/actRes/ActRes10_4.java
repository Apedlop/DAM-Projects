package actRes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ActRes10_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader in = null;
		
		try {
			
			in = new BufferedReader(new FileReader("NumerosReales.txt"));
			String texto = in.readLine();
			String[] subcadenas = texto.split(" "); //Separamos las subcadenas
			double suma = 0;
			
			for (int i = 0; i < subcadenas.length; i++) {
				suma += Double.valueOf(subcadenas[i]);
			}
			
			System.out.println(suma);
		
		} catch(IOException ex) {
			
			System.out.println(ex.getMessage());
			
		} finally {
			
			if (in != null) {
				
				try {
					in.close();
				} catch(IOException ex) {
					System.out.println(ex.getMessage());
				}
				
			}
			
		}
		
	}

}
