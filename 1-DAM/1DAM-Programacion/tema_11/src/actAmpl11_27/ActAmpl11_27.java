package actAmpl11_27;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ActAmpl11_27 {

	static Scanner sc = new Scanner(System.in);
	static Deportistas[] d = new Deportistas[0];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion = 0;

		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("Deportistas.dat"))) {

			d = (Deportistas[]) in.readObject();

		} catch (IOException | ClassNotFoundException ex) {
			System.out.println(ex);
		}

		do {

			System.out.println("1. Alta");
			System.out.println("2. Baja");
			System.out.println("3. Modificación de datos");
			System.out.println("4. Listar por orden alfabético de nombres");
			System.out.println("5. Listar por orden de edad");
			System.out.println("6. Salir");
			opcion = sc.nextInt();

			switch (opcion) {

			case 1:
				alta();
				break;
				
			case 2:
				baja();
				break;
				
			case 3:
				modificar();
				break;
			
			case 4:
				listarNombresOrdenAlfabetico();
				break;
				
			case 5:
				listarPorEdad();
				break;

			}

		} while (opcion < 6);

		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Deportistas.dat"))) {
			out.writeObject(d);
		} catch (IOException ex) {
			System.out.println(ex);
		}

	}

	public static void alta() {

		System.out.println("Introduce el DNI del deportista:");
		String dni = sc.next();
		System.out.println("Introduce su nombre:");
		String nombre = sc.next();
		System.out.println("Introduce su fecha de nacimiento (formato: dd/mm/yyyy):");
		String fechaNacimiento = sc.next();
		System.out.println("Introduce que deporque hace:");
		String deporte = sc.next();
		Deporte dp = Deporte.valueOf(deporte.toLowerCase()); // Convierte el String en Enum

		Deportistas nuevo = new Deportistas(dni, nombre, fechaNacimiento, dp);
		d = Arrays.copyOf(d, d.length + 1);
		d[d.length - 1] = nuevo;

	}

	public static void baja() {

		System.out.println("Introduce el dni del deportista que quiere dar de baja:");
		String dni = sc.nextLine();

		for (int i = 0; i < d.length; i++) {

			if (d[i].getDni() == dni) {
				d = eliminar(d, i);
				System.out.println("Cliente dado de baja correctamente.");
				return;
			}

		}

	}

	public static Deportistas[] eliminar(Deportistas[] array, int index) {

		Deportistas[] resultado = new Deportistas[array.length - 1];
		System.arraycopy(array, 0, resultado, 0, index);
		System.arraycopy(array, index + 1, resultado, index, array.length - index - 1);

		return resultado;

	}
	
	public static void modificar() {
		
		System.out.println("Introduce el DNI del deportista:");
		String dni = sc.nextLine();
		
		for (int i = 0; i < d.length; i++) {
			
			if (d[i].getDni() == dni) {
				System.out.println("Introduce el nombre del deportista:");
				String nombre = sc.next();
				System.out.println("Introduce su fecha de nacimiento: ");
				String fechaNacimiento = sc.next();
				System.out.println("Introduce el nuevo deporte que hace:");
				String nuevoDeporteStr = sc.next();
				Deporte nuevoDeporte = Deporte.valueOf(nuevoDeporteStr.toLowerCase());
				d[i].setDeporte(nuevoDeporte);
                d[i].setNombre(nombre);
                d[i].setFecha(fechaNacimiento);
			}
			
		}
		
	}
	
	public static void listarNombresOrdenAlfabetico() {
		
        // Creamos una copia del array d para no modificar el original
        Deportistas[] copiaD = Arrays.copyOf(d, d.length);
        
        // Ordenamos la copia del array por nombre
        Arrays.sort(copiaD);

        // Imprimimos los nombres en orden alfabético
        System.out.println("Deportistas ordenados por nombre:" + Arrays.toString(d));
        
    }
	
	public static void listarPorEdad() {
        // Creamos una copia del array d para no modificar el original
        Deportistas[] copiaD = Arrays.copyOf(d, d.length);

        // Creamos una instancia del comparador de edades
        ComparadorPorEdad comparadorEdades = new ComparadorPorEdad();

        // Ordenamos la copia del array por edad utilizando el comparador
        Arrays.sort(copiaD, comparadorEdades);

        // Imprimimos los deportistas ordenados por edad
        System.out.println("Deportistas ordenados por edad:");
        for (Deportistas deportista : copiaD) {
            System.out.println(deportista.getNombre() + " - " + deportista.getFecha());
        }
    }
}
