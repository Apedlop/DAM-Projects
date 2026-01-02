package avAplicacion11_17;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Introduce línea a línea");
		String l=new Scanner(System.in).nextLine();
		
		try (MyObjectOutputStream out=new MyObjectOutputStream("texto.dat")){
			
			while (!l.equals("")) {
				out.writeObject(l);
				l=new Scanner(System.in).nextLine();
			}
			
		} catch (IOException e) {
				System.out.println(e);
		}
		
//		try (ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("src/avAplicacion11_17/texto.dat", true))){
//			while (!l.equals("")) {
//				out.writeObject(l);
//				l=new Scanner(System.in).nextLine();
//			}
//		} catch (IOException e) {
//				System.out.println(e);
//		}
	
		try (ObjectInputStream in=new ObjectInputStream(new FileInputStream("texto.dat"))){
			
			while (true) {
				System.out.println((String) in.readObject());
			}
			
		} catch (EOFException e) {
			System.out.println("");
		} catch (IOException | ClassNotFoundException e) {
			System.out.println(e);
		}
	}

}
