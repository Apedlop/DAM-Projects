package actApl7_22;

public class Conjunto {

	private Integer[] elementos;
    private int tamaño;

    public Conjunto() {
    	
        this.elementos = new Integer[10];
        this.tamaño = 0;
        
    }

    public int numeroElementos() {
    	
        return tamaño;
        
    }

    public boolean insertar(Integer nuevo) {
    	
        if (!contiene(nuevo)) {
        	
            if (tamaño == elementos.length) {
                duplicarCapacidad();
            }
            
            elementos[tamaño++] = nuevo;
            return true;
            
        }
        
        return false;
        
    }

    public boolean insertar(Conjunto otroConjunto) {
    	
        boolean modificado = false;
        
        if (otroConjunto != null) {
        	
            for (Integer elemento : otroConjunto.elementos) {
            	
                if (elemento != null && insertar(elemento)) {
                    modificado = true;
                }
                
            }
            
        }
        
        return modificado;
    }

    public boolean eliminarElemento(Integer elemento) {
    	
        int indice = buscarIndice(elemento);
        
        if (indice != -1) {
            desplazarIzquierda(indice);
            tamaño--;
            return true;
        }
        
        return false;
        
    }

    public boolean eliminarConjunto(Conjunto otroConjunto) {
    	
        boolean modificado = false;
        
        for (Integer elemento : otroConjunto.elementos) {
        	
            if (elemento != null && eliminarElemento(elemento)) {
                modificado = true;
            }
            
        }
        
        return modificado;
        
    }

    public boolean pertenece(Integer elemento) {
    	
        return contiene(elemento);
        
    }

    public void mostrar() {
    	
        System.out.print("{ ");
        
        for (int i = 0; i < tamaño; i++) {
            System.out.print(elementos[i] + " ");
        }
        
        System.out.println("}");
        
    }

    private boolean contiene(Integer elemento) {
    	
        for (int i = 0; i < tamaño; i++) {
        	
            if (elementos[i] != null && elementos[i].equals(elemento)) {
                return true;
            }
            
        }
        
        return false;
        
    }

    private void duplicarCapacidad() {
    	
        Integer[] nuevoArreglo = new Integer[tamaño * 2];
        
        System.arraycopy(elementos, 0, nuevoArreglo, 0, tamaño);
        elementos = nuevoArreglo;
        
    }

    private int buscarIndice(Integer elemento) {
    	
        for (int i = 0; i < tamaño; i++) {
        	
            if (elementos[i] != null && elementos[i].equals(elemento)) {
                return i;
            }
            
        }
        
        return -1;
        
    }

    private void desplazarIzquierda(int indice) {
    	
        if (indice >= 0 && indice < tamaño) {
        	
            for (int i = indice; i < tamaño - 1; i++) {
                elementos[i] = elementos[i + 1];
            }
            
        }
        
    }

    public static boolean incluido(Conjunto c1, Conjunto c2) {
    	
        for (Integer elemento : c1.elementos) {
        	
            if (elemento != null && !c2.contiene(elemento)) {
                return false;
            }
            
        }
        
        return true;
        
    }

    public static Conjunto union(Conjunto c1, Conjunto c2) {
    	
        Conjunto resultado = new Conjunto();
        
        resultado.insertar(c1);
        resultado.insertar(c2);
        
        return resultado;
        
    }

    public static Conjunto interseccion(Conjunto c1, Conjunto c2) {
    	
        Conjunto resultado = new Conjunto();
        
        for (Integer elemento : c1.elementos) {
        	
            if (elemento != null && c2.contiene(elemento)) {
                resultado.insertar(elemento);
            }
            
        }
        
        return resultado;
        
    }

    public static Conjunto diferencia(Conjunto c1, Conjunto c2) {
    	
        Conjunto resultado = new Conjunto();
        
        for (Integer elemento : c1.elementos) {
        	
            if (elemento != null && !c2.contiene(elemento)) {
                resultado.insertar(elemento);
            }
            
        }
        
        return resultado;
        
    }
	
}
