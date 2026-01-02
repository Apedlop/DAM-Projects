package actApl7_12;

public class SegundoGrado {

	private double a, b, c;

	public SegundoGrado(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

	public void setA(double a) {
		this.a = a;
	}

	public void setB(double b) {
		this.b = b;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public boolean discriminantePositivo() {
		
		double discriminante = b * b - 4 * a * c;
		
		return discriminante > 0;
		
	}

	public double[] solucion() {
		
		double discriminante = b * b - 4 * a * c;

		if (discriminante < 0) {
			return new double[0];
		} else if (discriminante == 0) {
			double x = -b / (2 * a);
			return new double[] { x };
		} else {
			double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
			double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
			return new double[] { x1, x2 };
		}
	}

	public void mostrarDatos() {
		
		System.out.println("Coeficientes: a = " + a + ", b = " + b + ", c = " + c);
	
	}

}
