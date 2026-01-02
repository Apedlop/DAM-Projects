package actApl;

import java.util.Scanner;

public class Act6_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String frase;
        int indiceResultado = 0;
        boolean dentroComentario = false;
		
		System.out.println("Introduce una frase que contenga un comentario (los comentarios se escriben entre \"/* */\"):");
		frase = sc.nextLine();
		
		char[] resultado = new char[frase.length()];

	        for (int i = 0; i < frase.length(); i++) {
	        	
	            if (i < frase.length() - 1 && frase.charAt(i) == '/' && frase.charAt(i + 1) == '*') {
	                dentroComentario = true;
	                i++; // Saltar el asterisco después de la barra
	            } else if (i < frase.length() - 1 && frase.charAt(i) == '*' && frase.charAt(i + 1) == '/') {
	                dentroComentario = false;
	                i++; // Saltar la barra después del asterisco
	            } else if (!dentroComentario) {
	                resultado[indiceResultado] = frase.charAt(i);
	                indiceResultado++;
	            }
	            
	        }
		
	        System.out.println(resultado);
	        
	}
	
}
