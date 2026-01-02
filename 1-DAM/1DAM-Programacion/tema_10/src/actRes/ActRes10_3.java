package actRes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ActRes10_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String texto = "";
		BufferedReader in = null;
		
		try {
			
			in = new BufferedReader(new FileReader("Main.txt"));
			String linea = in.readLine();
			
			while (linea != null) {
				texto = texto + linea + '\n';
				linea = in.readLine();
			}
			
		} catch (IOException ex) {
		
			System.out.println(ex.getMessage());
			
		} finally {
			
			if (in != null) {
				
				try {				
					in.close();
				} catch (IOException ex) {
					System.out.println(ex);
				}
				
			}
		
		}
		
		System.out.println(texto);
		
	}

}
