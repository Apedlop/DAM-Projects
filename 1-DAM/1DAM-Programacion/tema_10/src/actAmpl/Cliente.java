package actAmpl;

public class Cliente {

	private String dni;
    private String nombreCompleto;
    private String fechaNacimiento;
    private double saldo;

    public Cliente(String dni, String nombreCompleto, String fechaNacimiento, double saldo) {
        
    	this.dni = dni;
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.saldo = saldo;
    
    }

    public String getDni() {
    
    	return dni;
    
    }

    public String getNombreCompleto() {
        
    	return nombreCompleto;
    
    }

    public String getFechaNacimiento() {
    
    	return fechaNacimiento;
    
    }

    public double getSaldo() {
    
    	return saldo;
    
    }

    @Override
    public String toString() {
    
    	return dni + ", " + nombreCompleto + ", " + fechaNacimiento + ", " + saldo;
    
    }
	
}
