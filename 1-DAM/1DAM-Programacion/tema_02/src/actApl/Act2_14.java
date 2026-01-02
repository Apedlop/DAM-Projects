package actApl;

import java.util.Scanner;

public class Act2_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número comprendido entre 0 y 99");
		int n = sc.nextInt();
		
		int unidad = n % 10;
	    int decena = (n / 10);
	    
	    if (n >= 10 & n <= 19) {
	    	switch (n){
	    	case 10: System.out.println("Diez");
	    	case 11: System.out.println("Once");
			case 12: System.out.println("Doce");
			case 13: System.out.println("Trece");
			case 14: System.out.println("Catorce");
			case 15: System.out.println("Quince");
			case 16: System.out.println("Dieciseis");
			case 17: System.out.println("Diecisiete");
			case 18: System.out.println("Dieciocho");
			case 19: System.out.println("Diecinueve");
			break; }
	    } else if (n < 10) { 
	    	switch (unidad) { 
	    	case 0: System.out.println("Cero");
	    	case 1: System.out.println("Uno");
	    	case 2: System.out.println("Dos");
	    	case 3: System.out.println("Tres");
	    	case 4: System.out.println("Cuatro");
	    	case 5: System.out.println("Cinco");
	    	case 6: System.out.println("Seis");
	    	case 7: System.out.println("Siete");
	    	case 8: System.out.println("Ocho");
	    	case 9: System.out.println("Nueve");
	    	break; }
	    } else if (n >= 20 || n < 100) {
	    	
	    	switch (decena) {
	    	case 2: 
	    		if (unidad == 0) { 
	    		System.out.println("Veinte");
	    	} else {
				System.out.println("Veinti");
			} break; 
	    			
	    	case 3:
				if (unidad == 0) {
					System.out.println("Treinta");
				} else {
					System.out.println("Treinta y ");
				} break; 
				
			case 4: 
				if (unidad == 0) {
					System.out.println("Cuarenta");
				} else {
					System.out.println("Cuarenta y ");
				} break;
			
			case 5: 
				if (unidad == 0) {
					System.out.println("Cincuenta");
				} else {
					System.out.println("Cincuenta y ");
				} break;
				
			case 6: 
				if (unidad == 0) {
					System.out.println("Sesenta");
				} else {
					System.out.println("Sesenta y ");
				} break;
				
			case 7: 
				if (unidad == 0) {
					System.out.println("Setenta");
				} else {
					System.out.println("Setenta y ");
				} break;
				
			case 8: 
				if (unidad == 0) {
					System.out.println("Ochenta");
				} else {
					System.out.println("Ochenta y ");
				} break;
				
			case 9: 
				if (unidad == 0) {
					System.out.println("Noventa");
				} else {
					System.out.println("Noventa y ");
				} break;
	    	}
	    	
	    }
	    	
	}

}
