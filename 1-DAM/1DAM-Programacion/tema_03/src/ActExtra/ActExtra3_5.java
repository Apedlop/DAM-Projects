package ActExtra;

import java.util.Scanner;

public class ActExtra3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1, n2, num;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1- Suma ");
			System.out.println("2- Resta");
			System.out.println("3- Multiplicación");
			System.out.println("4- División");
			System.out.println("5- Raíz cuadrada");
			System.out.println("6- Salir");
			do {
			System.out.println("Introduzca una opción: ");
			num = sc.nextInt();
			} while (num > 6 || num < 1);
			switch (num) {
				case 1: 
					System.out.println("Introduce un número: ");
					n1 = sc.nextInt();
					System.out.println("Imptroduce otro número: ");
					n2 = sc.nextInt();
					System.out.println("El resultado es: " + (n1 + n2));
					break;
				case 2: 
					System.out.println("Introduce un número: ");
					n1 = sc.nextInt();
					System.out.println("Imptroduce otro número: ");
					n2 = sc.nextInt();
					System.out.println("El resultado es: " + (n1 - n2));
					break;
				case 3: 
					System.out.println("Introduce un número: ");
					n1 = sc.nextInt();
					System.out.println("Imptroduce otro número: ");
					n2 = sc.nextInt();
					System.out.println("El resultado es: " + (n1 * n2));
					break;
				case 4: 
					System.out.println("Introduce un número: ");
					n1 = sc.nextInt();
					System.out.println("Imptroduce otro número: ");
					n2 = sc.nextInt();
					System.out.println("El resultado es: " + (n1 / n2));
					break;
				case 5: 
					System.out.println("Introduce un número: ");
					n1 = sc.nextInt();
					if (n1 >= 0) {
						System.out.println("El resultado es: " + (Math.sqrt(n1)));
					} else {
						System.out.println("No se puede calcular la raíz cuadrada de " + n1);
					}
					break;
			}
		} while (num != 6);
		
		
	}

}
