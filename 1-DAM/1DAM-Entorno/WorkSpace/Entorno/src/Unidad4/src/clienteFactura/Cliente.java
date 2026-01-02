package clienteFactura;

import java.util.HashSet;

public class Cliente { //Cliente tiene muchas facturas (Usamos HashSet) 

	public HashSet<Facturas> facturas = new HashSet<Facturas>(); //El HashSet se usa cada vez que una una relación apunta a otra que es N
	
	public Cliente() { //Contructor
		
	}
	
	public void setFacturas(HashSet<Facturas> newFacturas) {
		
		this.facturas = newFacturas;
		
	}
	
}
