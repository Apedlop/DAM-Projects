package actApl7_19;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pila p = new Pila(5);

		System.out.println(p.desapilar());

		for (int i = 0; i < 10; i++) {
			p.apilar(i);
		}

		p.mostrar();

		Integer num = p.desapilar();

		while (num != null) {
			System.out.println(num + " ");
			num = p.desapilar();
		}

	}

}
