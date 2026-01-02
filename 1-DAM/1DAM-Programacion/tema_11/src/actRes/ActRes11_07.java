package actRes;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ActRes11_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("numeros.dat"))) {
			
			System.out.println("Introduce un número entero positivo: ");
			int num = sc.nextInt();
			
			while (num >= 0) {
				out.writeInt(num);
				System.out.println("Introduce un número entero positivo: ");
				num = sc.nextInt();
			}
			
		} catch (IOException ex) {
			
			System.out.println(ex);
			
		}
		
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("numeros.dat"));
			 ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("numerosCopia.dat"))) {
			
			System.out.print("[");
			
			while (true) {
				int num = in.readInt();
				System.out.print(num + " ");
				out.writeInt(num);
			}
			
		} catch (EOFException ex) {
		
			System.out.println("] \nFin de fichero.");
			
		} catch (IOException ex) {
			
			System.out.println(ex);
			
		}
		
	}

}
