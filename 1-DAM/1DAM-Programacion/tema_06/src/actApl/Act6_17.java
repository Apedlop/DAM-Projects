package actApl;

import java.util.Scanner;

public class Act6_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String palabra, dividida;
		int n;
		
		System.out.println("Introduce una palabra: ");
		palabra = sc.nextLine();
		
		System.out.println("Introduce en cantas letras quieres dividir la palabra: ");
		n = sc.nextInt();
		
		for (int i = 0; i < palabra.length(); i += n) {
	           
			 // Ajusta el límite para evitar desbordamientos
			 int endIndex = i + n;
	            
	         if (endIndex > palabra.length()) {
	        	 endIndex = palabra.length();
	         }

	         dividida = palabra.substring(i, endIndex);

	         System.out.println(dividida);
	            
	        }
		
	}

}
