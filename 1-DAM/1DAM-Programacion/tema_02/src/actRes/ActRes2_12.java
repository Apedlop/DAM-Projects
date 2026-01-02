package actRes;

import java.util.Scanner;

public class ActRes2_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dia, mes, año;
		boolean fechaCorrecta;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un día: ");
		dia = sc.nextInt();
		System.out.println("Introduzca un mes: ");
		mes = sc.nextInt();
		System.out.println("Introduzca un año: ");
		año = sc.nextInt();
		
		if (año == 0) {
			fechaCorrecta = false;
		} else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (1 >= dia && dia <= 30)) {
				fechaCorrecta = true;
			} else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (1 >= dia && dia <= 31)) {
					fechaCorrecta = true;
				} else if (mes == 2 && (1 >= dia && dia <= 28)) {
						fechaCorrecta = true;
					} else {
						fechaCorrecta = false;
					}
	
		if (fechaCorrecta) {
		System.out.println("Fecha OK: " + dia + "/" + mes +"/" + año);
		} else {
			System.out.println("Fecha incorrecta.");
		}
	}
}
