package actRes;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ActRes11_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String estrofa = "Con diez cañones por banda, \n" + 
						 "viento en popa a toda vela, \n" +
						 "no corta el mar, sino vuela, \n" +
						 "un velero bergantín.";
		
		try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("cancionPirata.dat"))) {
			
			salida.writeObject(estrofa);
			
		} catch (IOException ex) {
			
			System.out.println(ex);
			
		}
		
	}

}
