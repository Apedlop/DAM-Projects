package actRes;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ActRes10_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream flujo = null;
		
		try {
			flujo = new FileInputStream("Enteros.txt");
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		
		Scanner sc = new Scanner(flujo);
		
		int contador = 0;
		int suma = 0;
		
		while (sc.hasNext()) {
			int n = sc.nextInt();
			System.out.println(n + " ");
			suma += n;
			contador++;
		}
		
		double media = (double) suma / contador;
		System.out.println("\nSuma: " + suma);
		System.out.println("Media: " + media);
		
	}

}
