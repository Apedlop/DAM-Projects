package actRes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class ActRes11_08 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Socio[] tablaSocios = new Socio[4];
		
		tablaSocios[0] = new Socio("1", "Pepe");
		tablaSocios[1] = new Socio("2", "Juan");
		tablaSocios[2] = new Socio("3", "María");
		tablaSocios[3] = new Socio("4", "Paula");
		
		System.out.println(Arrays.deepToString(tablaSocios));
		
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Socios.dat"))) {
			
			out.writeObject(tablaSocios);
			
		} catch (IOException ex) {
			
			System.out.println(ex);
			
		}
		
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("Socios.dat"))) {
			
			tablaSocios = (Socio[]) in.readObject();
			
		} catch (IOException | ClassNotFoundException ex) {
			
			System.out.println(ex);
			
		}
		
		System.out.println(Arrays.deepToString(tablaSocios));
		
	}

}
