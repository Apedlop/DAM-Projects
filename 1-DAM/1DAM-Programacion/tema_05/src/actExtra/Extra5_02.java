//inicializar una tabla de 10 números enteros mediante 10 valores
//(los que queramos) y contar cuantos pares hay.

package actExtra;

public class Extra5_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int par = 0;

		int t[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for (int i = 0; i < t.length; i++) {
			if(i % 2 == 0) {
				par++;
			}
			System.out.print(t[i] + " ");
		}
		
		System.out.println("\nHay " + par + " pares.");
		
	}

}
