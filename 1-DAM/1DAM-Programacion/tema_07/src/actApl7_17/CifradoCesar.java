package actApl7_17;

public class CifradoCesar {

	public static String cifrar(String texto, int n) {
		
		String resultado = "";

		for (int i = 0; i < texto.length(); i++) {
			
			char caracter = texto.charAt(i);

			if (Character.isLetter(caracter)) {
				
				boolean esMayuscula = Character.isUpperCase(caracter);

				caracter = Character.toLowerCase(caracter);

				char caracterCifrado = (char) (((caracter - 'a' + n) % 26) + 'a');

				if (esMayuscula) {
					caracterCifrado = Character.toUpperCase(caracterCifrado);
				}

				resultado += caracterCifrado;
				
			} else {
				
				resultado += caracter;
				
			}
			
		}

		return resultado;
		
	}

}
