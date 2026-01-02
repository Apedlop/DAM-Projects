package actApl8_24;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Triangulo triangulo = new Triangulo(5, 8);
		Rectangulo rectangulo = new Rectangulo(5, 8);

		System.out.println("Área del Triángulo: " + triangulo.area());
		System.out.println("Área del Rectángulo: " + rectangulo.area());

	}

}
