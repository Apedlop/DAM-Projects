package actRes;

public class ActRes5_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vector[] = new int[10];
		
		for (int i = 0; i < vector.length; i++) {
			vector[i] = (int) (Math.random() * 100 + 1);
		}
		
		System.out.print("Tabla original: ");
		for (int j = 0; j < vector.length; j++) {
			System.out.print(vector[j] + " ");
		}
		
		int suma = 0;
		
		for (int valor: vector) {
			suma += valor;
		}
		
		System.out.println("\nLa suma de los valores son: " + suma);
		
	}

}
