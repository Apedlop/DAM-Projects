package actRes;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ActRes11_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("datos.dat"))) {
			
			int t[] = new int[10];
			
			for (int i = 0; i < t.length; i++) {
				t[i] = in.readInt();
			}
			
			System.out.println(Arrays.toString(t));
			
		} catch (IOException ex) {
			
			System.out.println("Error de lectura.");
			
		}
		
	}

}
