package boletin;


public class ActBol5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero[] = new int[20];
		int cuadrado[] = new int[20];
		int cubo[] = new int[20];
		
		for (int i = 0; i <= 19; i++) {
			numero [i] = (int) (Math.random() * 100);
		}
		
		for (int i = 0; i <= 19; i++) {
			cuadrado[i] = numero[i] * numero[i];
			cubo[i] = numero[i] * numero[i] * numero[i];
		}
		
		for (int j = 0; j <= 19; j++) {
			System.out.print(numero[j]);
			System.out.print(" " + cuadrado[j]);
			System.out.println(" " + cubo[j]);
		}
		
		
	}

}
