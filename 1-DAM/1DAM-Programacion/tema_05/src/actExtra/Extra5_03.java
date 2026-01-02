//Crear una tabla de 10 números enteros y asignar los valores de forma 
//aleatoria, en un rango que vaya de 1 a 10, calcular el máximo y mínimo, 
//mostrar todos los números por pantalla.

package actExtra;

public class Extra5_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int max = 0, min = 10;
		
		int t1[] = new int [10];
		
		for (int i = 0; i < t1.length; i++) {
			t1[i] = (int) (Math.random() * 10 + 1);
			if (t1[i] > max) {
				max = t1[i];
			}
			if (t1[i] < min) {
				min = t1[i];
			}
			System.out.print(t1[i] + " ");
		}
		
		System.out.println("\nMáximo: " + max);
		System.out.println("Mínimo: " + min);
	}

}
