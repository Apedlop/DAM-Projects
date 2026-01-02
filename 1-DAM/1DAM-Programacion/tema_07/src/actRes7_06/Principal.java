package actRes7_06;

import java.util.Scanner;

public class Principal {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hora h = new Hora();
		
		System.out.println("Hora: ");
		int valor = sc.nextInt();
		
		h.setHora(valor);
		
		System.out.println("Minuto: ");
		valor = sc.nextInt();
		
		h.setMinuto(valor);
		
		System.out.println("Segundo: ");
		valor = sc.nextInt();
		
		h.setSegundo(valor);
		
		System.out.println("¿Cuántos segundos quieres mostrar?");
		int numSeg = sc.nextInt();
		
		for (int i = 0; i <= numSeg; i++) {
			System.out.println(h.getHora() + " : " + h.getMinuto() + " : " + h.getSegundo());
			h.increSeg();
		}
		
	}

}
