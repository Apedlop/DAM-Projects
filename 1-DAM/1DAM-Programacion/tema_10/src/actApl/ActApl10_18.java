package actApl;

public class ActApl10_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String texto = "La cadena contiene los números 123 y 456, pero también -789.";
		Integer[] numeros = leerEnteros(texto);

		System.out.println("Números encontrados:");

		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}

	}

	public static Integer[] leerEnteros(String texto) {

		// Dividir la cadena en palabras
		String[] palabras = texto.split("\\s+");

		// Crear un array temporal para almacenar los números encontrados
		Integer[] temp = new Integer[palabras.length];
		int contador = 0;

		// Iterar sobre las palabras para encontrar los números
		for (int i = 0; i < palabras.length; i++) {

			try {
				// Intentar convertir la palabra a entero
				int numero = Integer.parseInt(palabras[i]);
				temp[contador] = numero;
				contador++;
				
			} catch (NumberFormatException e) {
				// La palabra no es un número válido, continuar con la siguiente
			}
		}

		// Crear un nuevo array con el tamaño correcto y copiar los números encontrados
		Integer[] numeros = new Integer[contador];
		System.arraycopy(temp, 0, numeros, 0, contador);

		return numeros; // Devolver la matriz de números
		
	}

}
