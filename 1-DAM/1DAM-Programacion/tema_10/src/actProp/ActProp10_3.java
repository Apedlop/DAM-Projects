package actProp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ActProp10_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader in = null;

		int totalEdad = 0;
		double totalEstatura = 0;
		int cantidadJugadores = 0;

		try {

			in = new BufferedReader(new FileReader("Jugadores.txt"));

			String linea;

			while ((linea = in.readLine()) != null) {

				// Dividir la línea en partes separadas por espacios
				String[] datos = linea.split(" ");
				String nombre = datos[0];
				int edad = Integer.valueOf(datos[1]);
				double estatura = Double.valueOf(datos[2]);

				// Mostrar el nombre del jugador
				System.out.println("Nombre: " + nombre);

				// Sumar la edad y la estatura para calcular la media
				totalEdad += edad;
				totalEstatura += estatura;
				cantidadJugadores++;

			}

			// Calcular la media de la edad y la estatura
			double mediaEdad = (double) totalEdad / cantidadJugadores;
			double mediaEstatura = totalEstatura / cantidadJugadores;
			System.out.println("\nMedia de edad: " + mediaEdad);
			System.out.println("Media de estatura: " + mediaEstatura);

		} catch (IOException ex) {

			System.out.println(ex.getMessage());

		}

	}

}
