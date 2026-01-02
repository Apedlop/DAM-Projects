package actApl;

import java.util.Scanner;

public class Act3_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int exp = 0;
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número binario: ");
        int binario = sc.nextInt();
        
        int decimal = 0;
        int base = 1;
        
        while (binario != 0) {
        	int unidBinaria = binario % 2;
        	binario /= 10;
        	decimal += base * unidBinaria;
        	base *= 2;
        }
        
        System.out.println(decimal);
	}

}
