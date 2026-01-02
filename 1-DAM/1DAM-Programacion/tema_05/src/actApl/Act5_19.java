package actApl;

import java.util.Arrays;
import java.util.Scanner;

public class Act5_19 {

    static Scanner sc = new Scanner(System.in);

    static int[] menorEdad(int[] corredores) {
        for (int i = 0; i < corredores.length; i++) {
            System.out.print("Introduce la edad del corredor con dorsal " + corredores[i] + ": ");
            int edad = sc.nextInt();

            if (edad < 18 && i > 0) {
                // Adelantar a los corredores menores de edad una posición
                int corredorMenorEdad = corredores[i];
                for (int j = i; j > 0; j--) {
                    corredores[j] = corredores[j - 1];
                }
                corredores[0] = corredorMenorEdad;
            }
        }

        System.out.println(Arrays.toString(corredores));
        return corredores;
    }

    static int[] testAntidopaje(int[] corredores) {
    	
        for (int i = 0; i < corredores.length; i++) {
            System.out.print("¿El corredor con el dorsal " + corredores[i] + " ha dado positivo en el test antidopaje? (1 = sí, 2 = no): ");
            int testAnti = sc.nextInt();

            if (testAnti == 1) {
                // Buscar la posición del corredor en el array
                int index = Arrays.binarySearch(corredores, corredores[i]);

                    // Eliminar al corredor que dio positivo
                    int[] temp = new int[corredores.length - 1];
                    System.arraycopy(corredores, 0, temp, 0, index);
                    System.arraycopy(corredores, index + 1, temp, index, corredores.length - index - 1);
                    corredores = temp;
               
            }
        }

        System.out.println(Arrays.toString(corredores));
        return corredores;
    }
    
//    static int[] hanPagado(int[] corredores) {
//    	
//    	int dorsalNoPagado = corredores[index];
//        int[] temp = Arrays.copyOf(array, array.length);
//
//        for (int i = index; i < array.length - 1; i++) {
//            temp[i] = temp[i + 1];
//        }
//
//        temp[temp.length - 1] = dorsalNoPagado;
//
//        return temp;
//    	
//    	return corredores;
//    	
//    }

    public static void main(String[] args) {
        int corredores[] = new int[0];
        int dorsal = 0, indicador = 0;

        while (dorsal != -1) {
            System.out.println("¿Qué dorsal llega?");
            dorsal = sc.nextInt();

            if (dorsal != -1) {
                corredores = Arrays.copyOf(corredores, indicador + 1);
                corredores[indicador++] = dorsal;
            }
        }

        corredores = menorEdad(corredores);
        corredores = testAntidopaje(corredores);

        System.out.println("Medalla de Oro: " + corredores[0]);
        System.out.println("Medalla de Plata: " + corredores[1]);
        System.out.println("Medalla de Bronce: " + corredores[2]);
    }
}