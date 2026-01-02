package actApl;

import java.util.Arrays;
import java.util.Scanner;

import javax.lang.model.element.Element;

public class Act5_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

        int sueldo = 0, max = 0, min = 0, indicador = 0, cont = 0, media = 0;
        int[] t = new int[0];

        while (sueldo != -1) {
            System.out.println("Introduce tu sueldo, para salir introduce -1: ");
            sueldo = sc.nextInt();

            if (sueldo != -1) {
                t = Arrays.copyOf(t, indicador + 1);
                t[indicador++] = sueldo;
            }
            
            if (indicador == 1 || sueldo < min && sueldo != -1) {
                min = sueldo; 
            }
            
            if (sueldo > max) {
            	max = sueldo;
            }
            
            cont++;
            media += sueldo;
        }
        
       Arrays.sort(t);
       
       System.out.print("Los sueldos son: ");
       for (int i = t.length - 1; i > 0; i--) {
    	   System.out.print(t[i] + " ");
       }
       
       System.out.println("\nMínimo: " + min);
       System.out.println("Máximo: " + max);
       System.out.println("La media de los salarios es: " + (media / cont));
       
	}

}
