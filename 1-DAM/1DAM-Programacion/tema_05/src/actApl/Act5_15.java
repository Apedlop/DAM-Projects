package actApl;

import java.util.Scanner;

public class Act5_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

        int[][] nota = new int[15][3]; 
        int indicador = 0, cont = 0, media = 0, mediaAlum = 0;

        for (int i = 0; i < 3; i++) {
        	
            System.out.println((i + 1) + "º trimestre: ");

            for (int j = 0; j < 5; j++) {
            	
                System.out.println("Introduce la nota del " + (j + 1) + "º alumno: ");
                
                int notaAlum = sc.nextInt();
                
                nota[j][i] = notaAlum; 
                cont++;
                media += notaAlum;
                
            }

            System.out.println("Media de la clase: " + (media / cont));

            media = 0;
            cont = 0;
        }

        System.out.println("¿De qué alumno quiere ver la nota media? (1-5): ");
        int alumSelecc = sc.nextInt();

        if (alumSelecc >= 1 && alumSelecc <= 5) {
        	
            int inicio = (alumSelecc - 1) * 3; 
            int fin = inicio + 3;

            for (int k = inicio; k < fin; k++) {
                mediaAlum += nota[alumSelecc - 1][k % 3];
            }

            double avgAlumno = (double) mediaAlum / 3;
            
            System.out.println("Media del alumno " + alumSelecc + ": " + avgAlumno);
            
        } else {
        	
            System.out.println("Número de alumno no válido.");
            
        }
    }
}
