package actApl;

import java.util.Scanner;

public class Act1_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el número de hormigas capturadas: ");
		int numHorm = sc.nextInt();
		System.out.println("Introduzca el número de arañas capturadas: ");
		int numArañ = sc.nextInt();
		System.out.println("Introduzca el número de cohinillas capturadas: ");
		int numCochi = sc.nextInt();
		int totalPatas = (numHorm * 6) + (numArañ * 8) + (numCochi * 14);
		System.out.println("En total hay " + totalPatas + " patas.");
	}

}
