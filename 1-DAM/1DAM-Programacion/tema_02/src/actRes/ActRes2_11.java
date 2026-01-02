package actRes;

import java.util.Scanner;

public class ActRes2_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número entre 1 y 7: ");
		int n = sc.nextInt();
		
		switch (n) {
			case 1 ->  System.out.println("Lunes");
			case 2 ->  System.out.println("Martes");
			case 3 ->  System.out.println("Miércoles");
			case 4 ->  System.out.println("Jueves");
			case 5 ->  System.out.println("Viernes");
			case 6 ->  System.out.println("Sábado");
			case 7 ->  System.out.println("Domingo");
		}
	}

}
