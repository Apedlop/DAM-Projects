package actRes;

import java.util.Scanner;

public class ActRes2_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe tu nota entera: ");
		int nota = sc.nextInt();
		
		if (nota >= 0 && nota < 5) {
			System.out.println("Su nota es insuficiente.");
		} else if (nota == 5) {
			System.out.println("Su nota es suficiente.");
		} else if (nota == 6) {
			System.out.println("Su nota es bien.");
		} else if (nota == 7 || nota == 8) {
			System.out.println("Su nota el notable.");
		} else if (nota == 9 || nota == 10) {
			System.out.println("Su nota es sobresaliente.");
		}
	}

}
