package actRes;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ActRes11_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("datos.dat"))) {
			
			int[] t = (int[]) in.readObject();
			System.out.println(Arrays.toString(t));
			
		} catch (IOException ex) {
			
			System.out.println("Error de entrada/salida.");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Esl fichero no almacena un objeto tabla.");
		}
		
	}

}
