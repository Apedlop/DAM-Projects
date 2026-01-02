package actProp;

import java.util.Scanner;

public class ActProp2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número: ");
		int n1 = sc.nextInt();
		System.out.println("Escriba otro número: ");
		int n2 = sc.nextInt();
		boolean num = (n1 != n2 || n1 == 0 && n2 == 0);
		System.out.println("Ambos números son distintos entre sí o alguno de ellos es cero: " + num);
		
	}

}
