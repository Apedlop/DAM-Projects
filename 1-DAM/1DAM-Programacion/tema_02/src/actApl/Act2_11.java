package actApl;

import java.util.Scanner;

public class Act2_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Escrime un número comprendido entre 0 y 9999: ");
		int n = sc.nextInt();
		
        int unidad = n % 10;
        int decena = (n / 10) % 10;
        int centena = (n / 100) % 10;
        int millar = (n / 1000) % 10;
            
        if (n >= 1000 && n < 10000) 
        	if (unidad == millar && decena == centena) {
        	System.out.println(n + " es un número capicúa.");
        	} else {
            System.out.println(n + " no es un número capicúa.");
            }
        else if (n >= 100 && n < 1000) 
        	if (unidad == centena) {
        	System.out.println(n + " es un número capicúa.");
        	} else {
            System.out.println(n + " no es un número capicúa.");
        	}
        else if (n >= 10 && n < 100) 
        	if (unidad == decena) {
        	System.out.println(n + " es un número capicúa.");
        	} else {
            System.out.println(n + " no es un número capicúa.");
        	}
        else if (n >= 0 && n < 10) {
        	System.out.println(n + " es un número capicúa.");
        	} else {
            System.out.println(n + " no es un número capicúa.");
        	}
		
	}

}
