package actApl;

import java.util.Scanner;

public class Act3_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número: ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) { //Espacios
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println("");
		}
		
		//Para hacer una casita
		for (int n = 0; n < num - 1; n++) {
			for (int l = 0; l < num - 1; l++) {
				System.out.print(" *");
			}
			System.out.println("");
		}
	}

}
