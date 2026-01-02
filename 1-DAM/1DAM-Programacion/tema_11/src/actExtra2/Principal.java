package actExtra2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class Principal {

	static Scanner sc = new Scanner(System.in);
	static Alumno[] a = new Alumno[0]; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("Alumnos"))) {
			
			a = (Alumno[]) in.readObject();
			
		} catch (IOException | ClassNotFoundException ex) {
			System.out.println(ex);
		}
		
		int opcion = 0;
		
		do {
			
			System.out.println("1. Añadir alumno");
			System.out.println("2. Modificar nota");
			System.out.println("3. Calcular nota media");
			System.out.println("4. Consultar nota");
			System.out.println("5. Mostrar alumno con mayor y menor calificación");
			System.out.println("6. Listar nombre y nota media, ordenado por nombre");
			System.out.println("7. Listar nombre y nota media, ordenado por nota media");
			System.out.println("8. Salir");
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 1:
				
			case 2:
				
			case 3:
				
			case 4:
				
			case 5:
				
			case 6:
				
			case 7:
				
			}
			
		} while (opcion < 8);
		
	}

}
