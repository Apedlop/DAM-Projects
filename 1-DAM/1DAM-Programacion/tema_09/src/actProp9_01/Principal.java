package actProp9_01;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        Lista c = new Lista(); 
        
        System.out.println("Introduce un número negativo para salir: ");
        int n = sc.nextInt();

        while (n >= 0) {
        	
            c.encolar(n);
            
            System.out.println("Introduce número: ");
            n = sc.nextInt();
            
        }

        Integer desencolado = c.desencolar(); 
        
        while (desencolado != null) {
        	
            System.out.println(desencolado + " ");
            desencolado = c.desencolar(); 
            
        }
        
    }
    
}
