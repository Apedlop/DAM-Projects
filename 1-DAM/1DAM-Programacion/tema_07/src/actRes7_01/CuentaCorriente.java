package actRes7_01;

public class CuentaCorriente {

	String dni;
	String nombre;
	double saldo;
	
	CuentaCorriente(String dni, String nombre) {
		
		this.dni = dni;
		this.nombre = nombre;
		saldo = 0; 
		
	}
	
	boolean egreso(double cant) {
		
		boolean operacionPosible;
		
		if (saldo >= cant) {
			saldo -= cant;
			operacionPosible = true;
		} else {
			operacionPosible = false;
			System.out.println("No hay suficiente dinero.");
		}
		
		return (operacionPosible);
		
	}
	
	void ingreso(double cant) {
		
		saldo += cant;
		
	}
	
	void mostrar() {
		
		System.out.println("Nombre: " + nombre);
		System.out.println("DNI: " + dni);
		System.out.println("Saldo: " + saldo + "€");
		
	}
	
}
