package ejerApl;

import java.util.Scanner;

public class Ejer3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
        int pares = 0;
        int impares = 0;
        
		Scanner sc = new Scanner(System.in);
		System.out.print("Por favor, introduzca un número entero positivo: ");
	    long numero = sc.nextLong();
	       
	    while (numero > 0) {
	    	long digito = numero % 10;
	        if (digito % 2 == 0) {
	        	pares++;
	        } else {
	            impares++;
	        }
	        numero /= 10;
	    }
	        
	    System.out.println("El número ingresado contiene " + pares + " dígitos pares y " + impares + " dígitos impares.");
	}
}
