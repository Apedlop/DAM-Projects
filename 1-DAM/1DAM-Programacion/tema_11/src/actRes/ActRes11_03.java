package actRes;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Locale;
import java.util.Scanner;

public class ActRes11_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("datos2.dat"))) {

			System.out.println("Introduce un número de elementos:");
			int n = sc.nextInt();

			double t[] = new double[n];

			for (int i = 0; i < t.length; i++) {
				System.out.println("Introduce un número real:");
				t[i] = sc.useLocale(Locale.US).nextDouble();
			}

			salida.writeObject(t);

		} catch (IOException ex) {

			System.out.println(ex);

		}

	}

}
