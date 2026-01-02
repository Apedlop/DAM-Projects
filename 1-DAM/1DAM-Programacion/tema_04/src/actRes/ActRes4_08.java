package actRes;

import java.util.Scanner;

public class ActRes4_08 {

	static double calculadora(double a, double b, int operacion) {
		
		double result;
		
		result = switch (operacion) {
			case 1 -> 
				a + b;
			case 2 -> 
				a - b;
			case 3 ->
				a * b;
			case 4 ->
				(double) a / b;
			default -> {
				System.out.println("Operación no válida");
				yield 0;
			}
		};
		
		return (result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		int a = sc.nextInt();
		System.out.println("Introduce otro número: ");
		int b = sc.nextInt();
		
		for (int operacion = 1; operacion <= 4; operacion++) {
			double resultado = calculadora(a, b, operacion);
			
			System.out.println(operacion + ". " + resultado);
		}
	}

}
