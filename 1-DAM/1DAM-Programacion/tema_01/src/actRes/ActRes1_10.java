package actRes;

import java.security.KeyStore.TrustedCertificateEntry;
import java.util.Scanner;

public class ActRes1_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean llueve, finalizarTarea, irBiblioteca;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Está lloviendo? (true/false)");
		llueve = sc.nextBoolean();
		System.out.println("¿Ha finalizado la tarea? (true/false)");
		finalizarTarea = sc.nextBoolean();
		System.out.println("¿Tiene que ir a la biblioteca? (true/false)");
		irBiblioteca = sc.nextBoolean();
		boolean salir = !llueve && finalizarTarea || irBiblioteca;
		System.out.println("Puedes salir: " + salir);
	}

}
