package actRes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ActRes10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		leerEntero();
		
	}
	
	static Integer leerEntero() {
		
		Integer resultado;
		
		while (true) {
			
			try {
				
				System.out.println("Introducir entero:");
				resultado = new Scanner(System.in).nextInt();
				break;
				
			} catch (InputMismatchException ex) {
				
				System.out.println("Tipo erroneo.");
				
			}
			
		}
		
		return resultado;
	}

}
