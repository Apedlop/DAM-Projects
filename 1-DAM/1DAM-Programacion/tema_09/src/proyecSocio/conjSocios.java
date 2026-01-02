package proyecSocio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;

class ConjSocio {

	private Socio[] socios;
	private int cantidadSocios;

	public ConjSocio(int maxSocios) {

		this.socios = new Socio[maxSocios];
		this.cantidadSocios = 0;

	}

	public void altaSocio(int id, String nombre, String fechaNac) {

		for (int i = 0; i < cantidadSocios; i++) {

			if (socios[i].id == id) {
				System.out.println("El ID no es único.");
			}

		}

		Socio nuevoSocio = new Socio(id, nombre, fechaNac);

		socios[cantidadSocios] = nuevoSocio;
		cantidadSocios++;

		System.out.println("Socio dado de alta correctamente.");

	}

	public void eliminarSocio(int id) {

		boolean encontrado = false;

		for (int i = 0; i < cantidadSocios; i++) {

			if (socios[i].id == id) {

				for (int j = i; j < cantidadSocios - 1; j++) {
					socios[j] = socios[j + 1];
				}

				cantidadSocios--;
				encontrado = true;

			}

		}

		if (!encontrado) {
			System.out.println("No se encontró ningún socio con ese ID.");
		} else {
			System.out.println("Socio eliminado correctamente.");
		}

	}

	public void consultarNumeroSocios() {

		System.out.println("Número de socios existentes: " + cantidadSocios);

	}

	public void consultarDatosSocio(int id) {

		for (int i = 0; i < cantidadSocios; i++) {

			if (socios[i].id == id) {
				System.out.println("Datos del socio:");
				System.out.println("ID: " + socios[i].id);
				System.out.println("Nombre: " + socios[i].nombre);
				System.out.println("Fecha de nacimiento: " + socios[i].fechaNacimiento);
			}

		}

		System.out.println("No se encontró ningún socio con ese ID.");

	}

	public void modificarFechaNacimiento(int id, String nuevaFechaNacimiento) {

		for (int i = 0; i < cantidadSocios; i++) {

			if (socios[i].id == id) {
				socios[i].fechaNacimiento = LocalDate.parse(nuevaFechaNacimiento,
						DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				System.out.println("Fecha de nacimiento modificada correctamente.");
			}

		}

		System.out.println("No se encontró ningún socio con ese ID.");

	}

	public void listarSociosOrdenadoPorID() {

		Arrays.sort(socios, 0, cantidadSocios, Comparator.comparingInt(s -> s.id));

		for (int i = 0; i < cantidadSocios; i++) {
			System.out.println(socios[i]);
		}

	}

	public void listarSociosOrdenadoPorEdadYNombre() {

		Arrays.sort(socios, 0, cantidadSocios);

		for (int i = 0; i < cantidadSocios; i++) {
			System.out.println(socios[i]);
		}

	}

}
