package actRes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ActRes11_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		Registro[] reg = new Registro[0];
		int opcion;
		
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("temperatura.dat"))) {
			
			reg = (Registro[]) in.readObject();
			
		} catch (IOException | ClassNotFoundException ex) {
			
			System.out.println(ex);
			
		}
		
		
		do {
			
			System.out.println("1. Nuevo registro");
			System.out.println("2. Mostrar historial");
			System.out.println("3. Salir");
			opcion = sc.nextInt();
			
			switch (opcion) {
			
			case 1:
				System.out.println("Introducir temperatura:");
				double temperatura = sc.nextDouble();
				Registro nuevo = new Registro(temperatura);
				reg = Arrays.copyOf(reg, reg.length + 1);
				reg[reg.length - 1] = nuevo;
				
			case 2:
				System.out.println(Arrays.deepToString(reg));
				
			}
			
		} while (opcion < 3);
		
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("temperatura.dat"))) {
			
			out.writeObject(reg);
			
		} catch (IOException ex) {
			
			System.out.println(ex);
			
		}
		
	}

}
