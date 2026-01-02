package ex1Ev2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc = new Scanner(System.in);

        String frase;
        String[] palabras;
        int[] frecuencia;

        System.out.println("Introduce una frase: ");
        frase = sc.nextLine();

        palabras = frase.split("\\s+");

        frecuencia = new int[palabras.length];

        for (int i = 0; i < palabras.length; i++) {
          
            palabras[i] = palabras[i].toLowerCase();

            for (int j = 0; j < palabras.length; j++) {
                if (palabras[i].equals(palabras[j])) {
                    frecuencia[i]++;
                }
            }
        }

        for (int i = 0; i < palabras.length; i++) {
        	
            boolean mostrada = false;
            
            for (int j = 0; j < i; j++) {
            	
                if (palabras[i].equals(palabras[j])) {
                    mostrada = true;
                }
                
            }

            if (!mostrada) {
                System.out.println(palabras[i] + ": " + frecuencia[i] + " veces");
            }
            
        }
        
    }
    
}
