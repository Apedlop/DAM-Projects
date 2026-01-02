package actApl7_13;

public class Colores {

	private String[] colores;

	public Colores() {
		
		colores = new String[] { "Rojo", "Verde", "Azul", "Amarillo", "Naranja", "Morado" };
		
	}

	public void addColor(String nuevoColor) {
		

		String[] nuevoArray = new String[colores.length + 1];

		System.arraycopy(colores, 0, nuevoArray, 0, colores.length);

		nuevoArray[colores.length] = nuevoColor;

		colores = nuevoArray;
	
	}

	public String[] seleccionarColores(int n) {
		
		if (n > colores.length) {
			System.out.println("No hay suficientes colores disponibles.");
			return new String[0];
		}

		String[] resultado = new String[n];
		String[] coloresDisponibles = colores.clone();

		for (int i = 0; i < n; i++) {
			int indice = (int) (Math.random() * coloresDisponibles.length);
			resultado[i] = coloresDisponibles[indice];
			coloresDisponibles = quitarElemento(coloresDisponibles, indice);
		}

		return resultado;
		
	}

	private String[] quitarElemento(String[] array, int indice) {
		
		String[] nuevoArray = new String[array.length - 1];
		
		System.arraycopy(array, 0, nuevoArray, 0, indice);
		System.arraycopy(array, indice + 1, nuevoArray, indice, array.length - indice - 1);
		
		return nuevoArray;
	
	}

}
