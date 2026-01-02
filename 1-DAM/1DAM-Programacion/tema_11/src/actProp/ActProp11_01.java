package actProp;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class ActProp11_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int t[] = new int[10];
		
		try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("datos1.dat"))) {
			
			for (int i = 0; i < 10; i++) {
				t[i] = i;
				salida.writeObject(t[i]);
			}
			
			System.out.println(Arrays.toString(t));
			
		} catch (IOException ex) {
			
			System.out.println(ex);
			
		}
		
	}

}
