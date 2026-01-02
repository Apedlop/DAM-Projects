package actApl;

import java.util.Scanner;

public class Act2_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba cuántos grados tiene el ángulo: ");
		double angulo = sc.nextDouble();
		
		if (angulo >= 0 && angulo <= 360) {
			double rad = (angulo * Math.PI) / 180;
			System.out.println(angulo + "· es igual a " + rad + " radianes.");
		} else {
			double rad2 = ((angulo % 360) * Math.PI) / 180;
			System.out.println(angulo + "· es igual a " + rad2 + " radianes.");
		}
	}

}
