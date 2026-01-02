package proyecTiempo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tiempo t1 = new Tiempo(2, 30, 40);
		Tiempo t2 = new Tiempo(0, 35, 20);

		System.out.println("Tiempo 1: " + t1);
		System.out.println("Tiempo 2: " + t2);

		Tiempo resultadoSuma = t1.suma(t2);
		System.out.println("Resultado de la suma: " + resultadoSuma);

		Tiempo resultadoResta = t1.resta(t2);
		System.out.println("Resultado de la resta: " + resultadoResta);
	}

}
