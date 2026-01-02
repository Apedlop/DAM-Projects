package ejerRepaso;

import java.util.Scanner;

public class cuantosNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mayor = 0, menor = 0, igual = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce cuantos números se van a introducir: ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			System.out.println("Introduce un número: ");
			int n = sc.nextInt();
			if (n > mayor) {
				mayor++;
			} else if (n < menor && n != 0) {
				menor++;
			} else if (n == 0) {
				igual++;
			}
		}
		
		System.out.println("Números mayores a 0: " + mayor);
		System.out.println("Núemros menores a 0: " + menor);
		System.out.println("Números iguales a 0: " + igual);
	}

}
