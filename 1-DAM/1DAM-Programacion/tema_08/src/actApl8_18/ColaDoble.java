package actApl8_18;

import java.util.Arrays;

import actApl8_17.Cola;

public class ColaDoble extends Cola {

	public void encolarPrincipio(Integer elemento) {
		
	    if (longitud == cola.length) {
	        cola = Arrays.copyOf(cola, cola.length + 1);
	    }

	    // Desplaza los elementos hacia la derecha
	    for (int i = longitud; i > 0; i--) {
	        cola[i] = cola[i - 1];
	    }

	    cola[0] = elemento;
	    longitud++;
	    
	}
	
	public Integer desencolarFinal() {
		
		if (longitud == 0) {
	        System.out.println("La cola está vacía.");
	    }

	    Integer elementoDesencolado = cola[longitud - 1]; 

	    for (int i = longitud - 1; i > 0; i--) {
	        cola[i] = cola[i - 1];
	    }

	    longitud--;

	    return elementoDesencolado;
		
	}

}
