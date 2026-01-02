package actApl8_19;

import actApl8_14.Lista;

public class Conjunto extends Lista {

    @Override
    public void insertarPrincipio(Integer nuevo) {
    	
        if (!contiene(nuevo)) {
            super.insertarPrincipio(nuevo);
        } else {
            System.out.println("El elemento " + nuevo + " ya está en el conjunto.");
        }
        
    }

    @Override
    public void insertarFinal(Integer nuevo) {
    	
        if (!contiene(nuevo)) {
            super.insertarFinal(nuevo);
        } else {
            System.out.println("El elemento " + nuevo + " ya está en el conjunto.");
        }
        
    }

    @Override
    public void insertar(int posicion, Integer nuevo) {
    	
        if (!contiene(nuevo)) {
            super.insertar(posicion, nuevo);
        } else {
            System.out.println("El elemento " + nuevo + " ya está en el conjunto.");
        }
        
    }

    private boolean contiene(Integer elemento) {
    	
        return buscar(elemento) != -1;
        
    }

}
