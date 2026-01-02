package actRes;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ActRes11_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int t[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("datos.dat"))) {
			
			for (int i = 0; i < t.length; i++) {
				salida.writeInt(i);
			}
			
		} catch (IOException ex) {
			
			System.out.println(ex);
			
		}
		
	}

}
