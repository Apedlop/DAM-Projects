package actRes;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ActRes5_02 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		double vector[] = new double[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Introduce un " + (i + 1) + "º número: ");
			vector[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(vector));
		
	}

}
