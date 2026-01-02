package actExtra;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ActExtra10_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (BufferedReader in = new BufferedReader(new FileReader("Prueba.txt"));
			 BufferedWriter out1 = new BufferedWriter(new FileWriter("Mayúsculas.txt"));
			 BufferedWriter out2 = new BufferedWriter(new FileWriter("Minúsculas.txt"))) {

			String linea;

			while ((linea = in.readLine()) != null) {

				String min = "";
				String may = "";

				for (int i = 0; i < linea.length(); i++) {

					char c = linea.charAt(i);

					if (Character.isLowerCase(c)) {
						min += c;
					} else if (Character.isUpperCase(c)) {
						may += c;
					}

				}

				if (!min.isEmpty()) {
					out2.write(min);
					out2.newLine();
				}

				if (!may.isEmpty()) {
					out1.write(may);
					out1.newLine(); // Nueva línea en el archivo de mayúsculas
				}

			}

			System.out.println("Se han separado las minúsculas y mayúsculas correctamente.");

		} catch (IOException ex) {

			System.out.println(ex.getMessage());

		}

	}

}