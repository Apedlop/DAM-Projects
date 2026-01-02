package Vehiculos_F;

import java.util.Arrays;


public class ConjuntoVehiculos {

	Vehiculo conjuntoVehiculos[]=new Vehiculo[0];
	
	//1. ALTA de un coche
	public void altaCoche(String marca, String modelo) {
		conjuntoVehiculos=Arrays.copyOf(conjuntoVehiculos, conjuntoVehiculos.length+1);
		
		if (conjuntoVehiculos.length==1) {
			conjuntoVehiculos[0]=new Automovil(1, marca, modelo);
		}else {
			conjuntoVehiculos[conjuntoVehiculos.length-1]=new Automovil((conjuntoVehiculos[conjuntoVehiculos.length-2]).numIdentificacion+1, marca, modelo);

		}
	}
	
	
	//2.ALTA de una moto
	public void altaMoto(String marca, String modelo) {
		conjuntoVehiculos=Arrays.copyOf(conjuntoVehiculos, conjuntoVehiculos.length+1);
		
		if (conjuntoVehiculos.length==1) {
			conjuntoVehiculos[0]=new Motocicleta(1, marca, modelo);
		}else {
			conjuntoVehiculos[conjuntoVehiculos.length-1]=new Motocicleta((conjuntoVehiculos[conjuntoVehiculos.length-2]).numIdentificacion+1, marca, modelo);

		}
	}
	
	
	//3.ALTA de un coche autónomo
	public void altaCocheAutonomo(String marca, String modelo) {
		conjuntoVehiculos=Arrays.copyOf(conjuntoVehiculos, conjuntoVehiculos.length+1);
		
		if (conjuntoVehiculos.length==1) {
			conjuntoVehiculos[0]=new CocheAutonomo(1, marca, modelo);
		}else {
			conjuntoVehiculos[conjuntoVehiculos.length-1]=new CocheAutonomo((conjuntoVehiculos[conjuntoVehiculos.length-2]).numIdentificacion+1, marca, modelo);
		}
	}
	
	
	//4.LISTADO de todos los vehiculos creados con todas sus característivas y al final mostrar el número total existentes
	public void listadoVehiculos() {
		System.out.println(Arrays.deepToString(conjuntoVehiculos));
	}
	
	public void numVehiculos() {
		System.out.println("Hay un total de "+conjuntoVehiculos.length+" vehiculos");
	}
	
	
	//5. LISTADO de coches alquilados
	public void listadoCochesAlquilados() {
		for (int i=0; i<conjuntoVehiculos.length; i++) {
			if (conjuntoVehiculos[i] instanceof Automovil && conjuntoVehiculos[i].alquilado==true) {
				System.out.println(conjuntoVehiculos[i].toString());
			}
		}
	}
	
	
	//6. LISTADO de motos
	public void listadoMotos() {
		for (int i=0; i<conjuntoVehiculos.length; i++) {
			if (conjuntoVehiculos[i] instanceof Motocicleta) {
				System.out.println(conjuntoVehiculos[i].toString());
			}
		}
	}
		
	//7. Alquilar un vehiculo
	public void alquilarVehiculo(int numIdentificacion) {
		for (int i=0; i<conjuntoVehiculos.length; i++) {
			if (conjuntoVehiculos[i].numIdentificacion == numIdentificacion) {
				conjuntoVehiculos[i].alquilar();
			}
		}
	}
	
	//8. Devolver un vehiculo
		public void devolverVehiculo(int numIdentificacion) {
			for (int i=0; i<conjuntoVehiculos.length; i++) {
				if (conjuntoVehiculos[i].numIdentificacion == numIdentificacion) {
					conjuntoVehiculos[i].devolver();
				}
			}
		}
}
