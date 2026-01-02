package actRes7_04;

public class CuentaCorriente {

	String dni;
	public String nombre;
	private double saldo;
	
	CuentaCorriente(String dni, String nombre) {
		
		this.dni = dni;
		this.nombre = nombre;
		setSaldo(0); 
		
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
