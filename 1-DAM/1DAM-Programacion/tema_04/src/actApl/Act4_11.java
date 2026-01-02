package actApl;

import java.util.Scanner;

public class Act4_11 {

	static double volumen(int rad) {
		
		double vol;
		
		vol = (4 * Math.PI) / 3 * Math.pow(rad, 3);
	
		System.out.println("Volumen: " + vol);
		
		return vol;
		
	}
	
	static double superficie(int rad) {
		
		double sup;
		
		sup = 4 * Math.PI * Math.pow(rad, 2);
		
		System.out.println("Superficie: " + sup);
		
		return sup;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un radio: ");
		int rad = sc.nextInt();
		
		volumen(rad);
		superficie(rad);
	}

}
