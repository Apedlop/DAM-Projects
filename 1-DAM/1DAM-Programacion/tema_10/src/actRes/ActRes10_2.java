package actRes;

import java.io.FileReader;
import java.io.IOException;

public class ActRes10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String texto = "";
		FileReader in = null;
		
		try {
			
			in = new FileReader("Main.txt");
			int c = in.read();
			
			while (c != -1) {
				texto = texto + (char) c;
				c = in.read();
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
