package ActAmp8_25;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Punto punto1 = new Punto(1, 2);
		Punto punto2 = new Punto(4, 6);

		System.out.println("Distancia entre punto1 y punto2: " + punto1.distancia(punto2));

		Punto3D punto3D1 = new Punto3D(1, 2, 3);
		Punto3D punto3D2 = new Punto3D(4, 6, 8);

		System.out.println("Distancia entre punto3D1 y punto3D2: " + punto3D1.distancia(punto3D2));

	}

}
