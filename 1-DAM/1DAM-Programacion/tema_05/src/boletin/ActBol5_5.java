package boletin;

public class ActBol5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int indPar = 0, indImpar = 0;
		
		int numero[] = new int[20];
		int par[] = new int[20];
		int impar[] = new int[20];
		
		for (int i = 0; i <= 19; i++) {
			numero[i] = (int) (Math.random() * 100);
		}
		
		for (int i = 0; i <= 19; i++) {
			
			if (numero[i] % 2 == 0) {
				par[indPar] = numero[i];
				indPar++;
			} else {
				impar[indImpar] = numero[i];
				indImpar++;
			}
			
		}

		int k = 0;
		
		for (int i = 0; i < indPar; i++, k++) {
			numero[k] = par[i];
		}
		
		for (int i = 0; i < indImpar; i++, k++) {
			numero[k] = impar[i];
		}
		
		for (int i = 0; i <= 19; i++) {
			System.out.print(numero[i] + " ");
		}
		
	}

}
