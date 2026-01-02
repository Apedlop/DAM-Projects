package actRes7_02;

public class CuentaCorriente {

	// Sobrecarga los constructores

	String dni;
	String nombre;
	double saldo;

	CuentaCorriente(String dni, String nombre) {

		this(dni, nombre, 0);

	}

	CuentaCorriente(String dni, double saldo) {
		
		this(dni, "Sin asignar", saldo);

	}
	
	public CuentaCorriente(String dni, String nombre, double saldo) {
		
		this.dni = dni;
		this.nombre = nombre;
		this.saldo = saldo;
		
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
