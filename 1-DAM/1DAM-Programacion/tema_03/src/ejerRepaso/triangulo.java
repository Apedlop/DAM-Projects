package ejerRepaso;

import java.util.Scanner;

public class triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe una altura para la figura: ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= (num / 2 + 1); i++) {
			for (int j = num / 2 + 2; j <= (num / 2) + i; j++) { //Espacios
                System.out.print(" ");
            }
			for (int k = i - 1; k <= num - i; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
		}
	}

}
