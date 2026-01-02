 package actRes;

import java.util.Scanner;

public class ActRes1_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nota1, nota2, nota3;
		int notaBoletin;
		double notaExpediente;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nota primer trimestre: ");
		nota1 = sc.nextInt();
		System.out.println("Nota segundo trimestre: ");
		nota2 = sc.nextInt();
		System.out.println("nota tercer trimestre: ");
		nota3 = sc.nextInt();
		
		notaExpediente = (nota1 + nota2 + nota3) / 3.0;
		notaBoletin = (int) notaExpediente;
		
		System.out.println("La nota media en el boletín es: " + notaBoletin);
		System.out.println("La nota media en el expediente es: " + notaExpediente);
	}

}
