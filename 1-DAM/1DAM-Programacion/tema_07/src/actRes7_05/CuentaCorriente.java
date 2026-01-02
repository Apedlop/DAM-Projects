package actRes7_05;

public class CuentaCorriente {

	String dni;
	public String nombre;
	private double saldo;
	Gestor gestor;
	
	CuentaCorriente(String dni, String nombre, Gestor gestor) {
		
		this.gestor = gestor;
		this.dni = dni;
		this.nombre = nombre;
		setSaldo(0); 
		
	}
	
	void Gestor(Gestor gestor) {
		
		this.gestor = gestor;
		
	}
	
	boolean egreso(double cant) {
		
		boolean operacionPosible;
		
		if (getSaldo() >= cant) {
			setSaldo(getSaldo() - cant);
			operacionPosible = true;
		} else {
			operacionPosible = false;
			System.out.println("No hay suficiente dinero.");
		}
		
		return (operacionPosible);
		
	}
	
	void ingreso(double cant) {
		
		setSaldo(getSaldo() + cant);
		
	}
	
	void mostrar() {
		
		System.out.println("Nombre: " + nombre);
		System.out.println("DNI: " + dni);
		System.out.println("Saldo: " + getSaldo() + "€");
		System.out.println("Nombre del Banco: " + getBanco());
		
		if (gestor == null) {
			System.out.println("Cuenta sin gestor");
		} else {
			System.out.println("Información del gestor:");
			gestor.mostrar();
		}
		
		System.out.println("Información del la cuenta:");
		System.out.println("Nombre: " + nombre);
		System.out.println("DNI: " + dni);
		System.out.println("Saldo: " + saldo);
		
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	static private String nombreBanco = "International Java Bank";
	
	static void setBanco(String nuevoNombre) {
		
		nombreBanco = nuevoNombre;
		
	}
	
	static String getBanco() {
		
		return nombreBanco;
		
	}
	
}
