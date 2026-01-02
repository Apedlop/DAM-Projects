package actAmp8_27;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Punto punto1 = new Punto(1, 2);
		Punto punto2 = new Punto(1, 2);
		Punto punto3 = new Punto(3, 4);

		Punto3D punto3D1 = new Punto3D(1, 2, 3);
		Punto3D punto3D2 = new Punto3D(1, 2, 3);
		Punto3D punto3D3 = new Punto3D(4, 5, 6);

		// Comparar puntos
		System.out.println("Puntos:");
		System.out.println("¿Punto 1 = Punto 2? " + punto1.equals(punto2)); // Debería ser true
		System.out.println("¿Punto 1 = Punto 3? " + punto1.equals(punto3)); // Debería ser false

		// Comparar puntos 3D
		System.out.println("\nPuntos 3D:");
		System.out.println("¿Punto3D 1 = Punto3D 2? " + punto3D1.equals(punto3D2)); // Debería ser true
		System.out.println("¿Punto3D 1 = Punto3D 3?: " + punto3D1.equals(punto3D3)); // Debería ser false
	}

}
