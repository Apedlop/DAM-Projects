package actRes;

public class ActRes3_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double suma = 0;
		
		for (int num = 1; num <= 10; num++) {
			int impar = 2 * num - 1;
			suma += impar;
		}
		
		System.out.println("La suma de los 10 primeros números primos es: " + suma);
	}

}
