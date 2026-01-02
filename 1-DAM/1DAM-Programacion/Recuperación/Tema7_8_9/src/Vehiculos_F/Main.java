package Vehiculos_F;

import java.util.Scanner;

public class Main {

	static Scanner teclado=new Scanner(System.in);
	
	static void mostrarOpciones() {
		System.out.println("1. ALTA de un coche");
		System.out.println("2. ALTA de una moto");
		System.out.println("3. ALTA de un coche autónomo");
		System.out.println("4. LISTADO de todos los vehiculos creados con todas sus característivas y al final mostrar el número total existentes");
		System.out.println("5. LISTADO de coches alquilados");
		System.out.println("6. LISTADO de motos");
		System.out.println("7. Alquilar un vehiculo");
		System.out.println("8. Devolver un vehiculo");
		System.out.println("9. Salir");
		System.out.print("¿Qué opción desea?");
	}
	
	static void opciones(int indice, ConjuntoVehiculos c) {
		switch (indice) {
		case 1: //1. ALTA de un coche
			System.out.print("Introduce la marca del coche: ");
			String marca1=teclado.next();
			System.out.print("Introduce el modelo del coche: ");
			String modelo1=teclado.next();
			c.altaCoche(marca1, modelo1);
			break;

		case 2: //2.ALTA de una moto
			System.out.print("Introduce la marca de la moto: ");
			String marca2=teclado.next();
			System.out.print("Introduce el modelo de la moto: ");
			String modelo2=teclado.next();
			c.altaMoto(marca2, modelo2);
			break;	
			
			
		case 3: //3.ALTA de un coche autónomo
			System.out.print("Introduce la marca del coche autonomo: ");
			String marca3=teclado.next();
			System.out.print("Introduce el modelo del coche autonomo: ");
			String modelo3=teclado.next();
			c.altaCocheAutonomo(marca3, modelo3);
			break;	
			
			
		case 4: //4.LISTADO de todos los vehiculos creados con todas sus característivas y al final mostrar el número total existentes
			c.listadoVehiculos();
			c.numVehiculos();
			break;
			
			
		case 5: //5. LISTADO de coches alquilados
			c.listadoCochesAlquilados();
			break;
			
			
		case 6: //6. LISTADO de motos
			c.listadoMotos();
			break;
			
		
		case 7: //7. Alquilar un vehiculo
			System.out.print("Introduce el número de identificación del vehiculo a alquilar: ");
			int indice1=teclado.nextInt();
			c.alquilarVehiculo(indice1);;
			break;	
			
			
		case 8: //8. Devolver un vehiculo
			System.out.print("Introduce el número de identificación del vehiculo a devolver: ");
			int indice2=teclado.nextInt();
			c.devolverVehiculo(indice2);
			break;
			
		default: //9. Salir
			break;
		}
	}
	
	public static void main(String[] args) {
		ConjuntoVehiculos c=new ConjuntoVehiculos();
		
		mostrarOpciones();
		int indice=teclado.nextInt();
		
		do {
			opciones(indice, c);
			mostrarOpciones();
			indice=teclado.nextInt();
		} while (indice>0 && indice<9);
	}

}
