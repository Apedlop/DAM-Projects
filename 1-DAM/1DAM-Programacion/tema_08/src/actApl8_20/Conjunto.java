package actApl8_20;

import java.util.Arrays;

import actApl8_14.Lista;

public class Conjunto extends Lista {

	@Override
	public void insertarPrincipio(Integer nuevo) {

		if (!contiene(nuevo)) {
			super.insertarPrincipio(nuevo);
		} else {
			System.out.println("El elemento " + nuevo + " ya está en el conjunto.");
		}

	}

	@Override
	public void insertarFinal(Integer nuevo) {

		if (!contiene(nuevo)) {
			super.insertarFinal(nuevo);
		} else {
			System.out.println("El elemento " + nuevo + " ya está en el conjunto.");
		}

	}

	@Override
	public void insertar(int posicion, Integer nuevo) {

		if (!contiene(nuevo)) {
			super.insertar(posicion, nuevo);
		} else {
			System.out.println("El elemento " + nuevo + " ya está en el conjunto.");
		}

	}

	private boolean contiene(Integer elemento) {

		return buscar(elemento) != -1;

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}

		Conjunto otroConjunto = (Conjunto) obj;

		Integer[] thisArray = Arrays.copyOf(tabla, tabla.length);
		Integer[] otroArray = Arrays.copyOf(otroConjunto.tabla, otroConjunto.tabla.length);

		Arrays.sort(thisArray);
		Arrays.sort(otroArray);

		return Arrays.equals(thisArray, otroArray);
		
	}

}