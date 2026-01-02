package actApl7_16;

public class Punto {
	
	private double x, y;

	public Punto (double x, double y) {
		
		this.x = x;
		this.y = y;
		
	}
	
	public void desplazaX(double dx) {
		
		x += dx;
		
	}
	
	public void desplazaY(double dy) {
		
		y += dy;
		
	}
	
	public void desplaza(double dx, double dy) {
		
		x += dx;
		y += dy;
		
	}
	
	public double distanciaEuclidea(Punto otro) {
		
		System.out.println("x2: " + otro.x);
		System.out.println("y2: " + otro.y);
		System.out.println("P2 = (" + otro.x + ", " + otro.y + ")");
		
		double resultado = Math.sqrt(Math.pow((otro.x - x), 2) + Math.pow(otro.y - y, 2));
		
		System.out.println("\nd(P1, P2) = " + resultado);
		
		return resultado;
		
	}
	
	public void muestra() {
		
		System.out.println("x1: " + x);
		System.out.println("y1: " + y);
		System.out.println("P1 = (" + x + ", " + y + ")");
		
	}
	
}
