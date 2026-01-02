package actApl;

import java.util.Scanner;

public class ActApl10_16 {

	public static String[] firmas = new String[10]; // Tamaño inicial
	public static int contadorFirmas = 0;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
//		String[] tabla;
//		cargaFichaTabla(tabla);
		
		int opcion;

		do {
			
			System.out.println("1. Insertar nueva firma");
			System.out.println("2. Mostrar libro de firmas");
			System.out.println("3. Salir");
			System.out.print("Elige una opción: ");
			opcion = sc.nextInt();

			switch (opcion) {
			
			case 1:
				insertarFirma();
				break;
				
			case 2:
				mostrarFirmas();
				break;
			}
			
		} while (opcion != 3);
		
	}
	
	public static void mostrarFirmas() {
		
		if (contadorFirmas == 0) {
			
			System.out.println("El libro de firmas está vacío.");
			
		} else {
			
			System.out.println("----- Firmas -----");
			
			for (int i = 0; i < contadorFirmas; i++) {
				System.out.println(firmas[i]);
			}
			
			System.out.println("------- Fin -------");
			
		}
		
	}

	public static void insertarFirma() {
		
		boolean nombreRepetido;
		
		while (true) {
			
			nombreRepetido = false;
			
			System.out.print("Ingrese el nombre para la firma: ");
			String nuevaFirma = sc.nextLine();

			if (existeFirma(nuevaFirma)) {
				
				System.out.println("¡Error! Este nombre ya existe en el libro de firmas.");
				nombreRepetido = true;
				
			} else {
				
				if (contadorFirmas == firmas.length) {
					aumentarTamañoArray();
				}
				
				firmas[contadorFirmas] = nuevaFirma;
				contadorFirmas++;
				
				System.out.println("Firma añadida correctamente.");
				break; // Salir del bucle si se agregó la firma correctamente
				
			}
			
		}
		
	}

	public static void aumentarTamañoArray() {
		
		String[] nuevoArray = new String[firmas.length * 2];
		
		for (int i = 0; i < firmas.length; i++) {
			nuevoArray[i] = firmas[i];
		}
		
		firmas = nuevoArray;
		
	}

	public static boolean existeFirma(String nuevaFirma) {
		
		for (int i = 0; i < contadorFirmas; i++) {
			
			if (firmas[i].equals(nuevaFirma)) {
				return true;
			}
			
		}
		
		return false;
		
	}
	
}