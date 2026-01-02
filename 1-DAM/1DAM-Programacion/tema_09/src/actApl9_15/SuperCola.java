package actApl9_15;

import java.util.Arrays;

class Supercola {
	
    private int[] cola1;
    private int[] cola2;
    private int tamaño1;
    private int tamaño2;

    public Supercola() {
    	
        cola1 = new int[10]; // Tamaño inicial de la cola1
        cola2 = new int[10]; // Tamaño inicial de la cola2
        tamaño1 = 0; // Tamaño actual de la cola1
        tamaño2 = 0; // Tamaño actual de la cola2
        
    }

    public void encolarCola1(int elemento) {
    	
        if (tamaño1 == cola1.length) {
            cola1 = Arrays.copyOf(cola1, tamaño1 * 2); // Duplicar tamaño de la cola1 si está llena
        }
        
        cola1[tamaño1++] = elemento;
        System.out.println("Elemento " + elemento + " encolado en cola1.");
        
    }

    public void encolarCola2(int elemento) {
    	
        if (tamaño2 == cola2.length) {
            cola2 = Arrays.copyOf(cola2, tamaño2 * 2); // Duplicar tamaño de la cola2 si está llena
        }
        
        cola2[tamaño2++] = elemento;
        
        System.out.println("Elemento " + elemento + " encolado en cola2.");
        
    }

    public Integer desencolarCola1() {
    	
        if (tamaño1 > 0) {
        	
            int elemento = cola1[0];
            
            // Desplazar los elementos hacia la izquierda
            for (int i = 1; i < tamaño1; i++) {
                cola1[i - 1] = cola1[i];
            }
            
            tamaño1--;
            
            return elemento;
            
        } else if (tamaño2 > 0) {
        	
            return desencolarCola2(); // Desencolar de la cola2 si la cola1 está vacía
            
        } else {
        	
            return null;
            
        }
        
    }

    public Integer desencolarCola2() {
    	
        if (tamaño2 > 0) {
            int elemento = cola2[0];
            // Desplazar los elementos hacia la izquierda
            for (int i = 1; i < tamaño2; i++) {
                cola2[i - 1] = cola2[i];
            }
            tamaño2--;
            return elemento;
        } else if (tamaño1 > 0) {
            return desencolarCola1(); // Desencolar de la cola1 si la cola2 está vacía
        } else {
            return null;
        }
    }

    public void mostrarEstadoColas() {
        System.out.println("Estado de la cola1: " + Arrays.toString(Arrays.copyOf(cola1, tamaño1)));
        System.out.println("Estado de la cola2: " + Arrays.toString(Arrays.copyOf(cola2, tamaño2)));
    }
}
