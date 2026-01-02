/* El tipo short permite almacenar valores comprendido entre -32768 y 32767
 * Escribir un programa que compruebe que el rango de valores de un tipo 
 * se comporta de forma cíclica, es decir, el valor siguiente al máximo es 
 * el valor mínimo*/

package actRes;

public class ActRes1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short num;
		num = 32767;
		System.out.println("El valor máx para el tipo short es: " + num);
		num++;
		System.out.println("El valor mín para el tipo short es: " + num);
	}

}
