package actApl7_22;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conjunto c1 = new Conjunto();
		c1.insertar(1);
		c1.insertar(2);
		c1.insertar(3);

		Conjunto c2 = new Conjunto();
		c2.insertar(3);
		c2.insertar(4);
		c2.insertar(5);

		c1.mostrar();
		c2.mostrar();

		System.out.println("Número de elementos en c1: " + c1.numeroElementos());

		c1.insertar(c2);
		c1.mostrar();

		c1.eliminarElemento(2);
		c1.mostrar();

		c1.eliminarConjunto(c2);
		c1.mostrar();

		System.out.println("¿El elemento 4 pertenece a c1? " + c1.pertenece(4));

		System.out.println("¿c1 está incluido en c2? " + Conjunto.incluido(c1, c2));

		Conjunto unionResult = Conjunto.union(c1, c2);
		System.out.print("Unión de c1 y c2: ");
		unionResult.mostrar();

		Conjunto interseccionResult = Conjunto.interseccion(c1, c2);
		System.out.print("Intersección de c1 y c2: ");
		interseccionResult.mostrar();

		Conjunto diferenciaResult = Conjunto.diferencia(c1, c2);
		System.out.print("Diferencia entre c1 y c2: ");
		diferenciaResult.mostrar();
		
	}

}
