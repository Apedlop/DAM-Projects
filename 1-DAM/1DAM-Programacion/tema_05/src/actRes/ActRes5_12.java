package actRes;

import java.util.Arrays;
import java.util.Scanner;

public class ActRes5_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int t[][] = new int[5][5];
		
		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j < 5; j++) {
				
				t[i][j] = 10 * i + j;
				
			}
			
		}
		
		System.out.println(Arrays.deepToString(t));
		
	}

}
