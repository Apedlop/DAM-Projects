package actRes;

import java.util.Arrays;

public class ActRes5_05 {

	static int[] rellenarPares(int longitud, int fin) {
		
		int par[] = new int[longitud];
		
		int i = 0; 
		
		while (i < par.length) {
			int num = (int) (Math.random() * fin + 1);
			if (num % 2 == 0) {
				par[i] = num;
				i++;
			}
		}
		
		Arrays.sort(par);
		
		return par;
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int vector[];
	vector = rellenarPares(10, 50);
	System.out.println(Arrays.toString(vector));
		
		
	}

}
