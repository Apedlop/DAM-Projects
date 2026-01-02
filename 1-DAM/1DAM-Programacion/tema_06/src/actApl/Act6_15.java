package actApl;

import java.util.Scanner;

public class Act6_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String titulo = "<h1>", titulo2 = "</h1>", parrafo = "<p>", parrafo2 = "</p>";
		String tituloWeb, contenidoParrafo;
		
		System.out.println("Introduce el título de la página web: ");
		tituloWeb = sc.nextLine();
		
		System.out.println("Introduce el contenido del párrafo: ");
		contenidoParrafo = sc.nextLine();
		
		System.out.println(titulo + tituloWeb + titulo2);
		System.out.println(parrafo + contenidoParrafo + parrafo2);
		
	}

}
