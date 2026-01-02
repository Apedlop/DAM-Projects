package actProp;

import java.util.Scanner;
import java.util.Spliterator.OfPrimitive;

import javax.xml.validation.TypeInfoProvider;

public class ActProp3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número positivo: ");
		int num = sc.nextInt();
		
		if (num < 0) {
            System.out.println("El número ingresado no es positivo.");
        } else {
            System.out.println("Los guarismos del número son:");
            while (num > 0) {
                int digito = num % 10; 
                System.out.println(digito);
                num = num / 10; 
            }
        }
		
	}

}
