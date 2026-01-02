package actApl;

import java.util.Scanner;

public class Act3_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		int num = sc.nextInt();
		
		for (int i = 1; i < num; i++) {
			int expo = (int) Math.pow(i, 2);
			if (expo <= num) {
				System.out.print((expo / i) + "² = " + expo + ", ");
				//System.out.println("\n\" La raiz cuadrada de " + num + " es " + (expo / i) + " con un resto de " + (num - expo));
			}
		} 
	}

}
