package boletin;

import java.util.Scanner;

public class Practica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el número de num que habrá en el círculo: ");
		int num = sc.nextInt();
		
		System.out.println("Cada cuántas personas se baja una: ");
		int k = sc.nextInt();
		
		int [] circulo = josephus(num, k);
		
		for (int i = 0; i < circulo.length; i++) {
			System.out.print(i + 1 + "\t");
			System.out.println(circulo[i]);
		}
	}
	
	public static int[] josephus(int num, int k) {
		
		int [] circulo = new int[num];
		
		for (int i = 0; i < num; i++) {
			circulo[i] = 1;
		}
		
		int indice = 0;
		
		while (num > 1) {
			
			for (int i = 0; i < k; i++) {
				
				if (indice > circulo.length - 1) {
					indice = 0;
				}
				
				while (circulo[indice] == 0) {
					
					indice++;
					
					if (indice > circulo.length - 1) {
						indice = 0;
					}
				}
				
				indice++;
				
			}
			
			circulo[indice - 1] = 0;
			num = num - 1;
			
		}
		
		return circulo;
	}

}
