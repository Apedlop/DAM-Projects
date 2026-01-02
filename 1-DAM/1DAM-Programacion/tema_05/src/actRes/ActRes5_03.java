package actRes;

import java.util.Scanner;

public class ActRes5_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cuántos números quieres introducir?");
		int num = sc.nextInt();
		
		int vector[] = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.println("Introduce el " + (i + 1) + "º número: ");
			vector[i] = sc.nextInt();
		}
		
		for (int i = vector.length - 1; i >= 0; i--) {
			System.out.print(vector[i] + " ");
		}
	}

}
