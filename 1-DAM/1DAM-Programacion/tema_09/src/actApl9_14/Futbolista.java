package actApl9_14;

public class Futbolista {

	String dni;
	String nombre;
	int edad;
	int numGoles;

	public Futbolista(String dni, String nombre, int edad, int numGoles) {
		
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.numGoles = numGoles;
        
    }
	
	public void setDni(String dni) {
		
		this.dni = dni;
		
	}
	
	public String getDni() {
		
		return dni;
		
	}
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
		
	}
	
	public String getNombre() {
		
		return nombre;
		
	}
	
	public void setEdad(int edad) {
		
		this.edad = edad;
		
	}
	
	public int getEdad() {
		
		return edad;
		
	}
	
	public void setNumGoles(int numGoles) {
		
		this.numGoles = numGoles;
		
	}
	
	public int getNumGoles() {
		
		return numGoles;
		
	}
	
	 @Override
	    public boolean equals(Object obj) {
		 
	        if (this == obj) {
	        	 return true;
	        }
	        	
	           
	        if (obj == null) {
	            return false;
	        }
	        
	        if (getClass() != obj.getClass()) {
	        	return false;
	        }
	            
	        Futbolista otroFutbolista = (Futbolista) obj;
	        
	        if (dni == null) {
	        	
	            if (otroFutbolista.dni != null) {
	                return false;
	            }
	            
	        } else if (!dni.equals(otroFutbolista.dni)) {
	        	
	            return false;
	            
	        }
	        
	        return true;
	        
	    }

	    // Implementación del método compareTo de la interfaz Comparable
	    public int compareTo(Futbolista futbolista) {
	    	
	        return this.dni.compareTo(futbolista.dni);
	        
	    }

	
}
