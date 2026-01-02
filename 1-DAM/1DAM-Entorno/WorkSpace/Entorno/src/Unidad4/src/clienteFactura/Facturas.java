package clienteFactura;

public class Facturas { //Como facturas no apunta a otra relación N sino a una 1, no se usa el HashSet

	public Cliente cliente = null;
	
	public Facturas() { //Constructor
		
	}
	
	public Cliente geCliente() {
		
		return this.cliente;
		
	}
	
	public void setCliente(Cliente newCliente) {
		
		this.cliente = newCliente;
		
	}
	
}
