package ActExtra;

import java.util.Scanner;

public class ActExtra3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe un número: ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
            for (int j = 0; j < num - i; j++) { 
            	System.out.print(" ");
			}
            for (int k = 1; k <= 2 * i - 1; k++) {
            	if (k == 1 || i == num || k == 2 * i - 1) { 
            		System.out.print("*");
            	} else {
            		System.out.print(" ");
            	}
            	
            }
			
            System.out.println("");
		}
		
	}

}
