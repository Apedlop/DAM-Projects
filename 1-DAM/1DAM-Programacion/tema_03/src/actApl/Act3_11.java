package actApl;

import java.util.Scanner;

public class Act3_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número decimal positivo: ");
        int numero = sc.nextInt();
        
        while (numero > 0) {
            int binario = numero % 2;
            System.out.println(binario); 
            numero /= 2;
        }
        
	}

}
