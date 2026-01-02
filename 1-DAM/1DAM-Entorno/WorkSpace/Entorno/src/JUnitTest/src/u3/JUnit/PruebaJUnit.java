package u3.JUnit;

public class PruebaJUnit {
	
	// Este método verifica si un número entero dado es positivo
	public boolean esPositivo(int numero) {
		
		return numero > 0;
		
	}

	// Este método concatena dos cadenas de texto y devuelve una cadena
	public String concatenar(String cadena1, String cadena2) {
		
		return cadena1 + cadena2;
		
	}

	// Este método verifica si dos números enteros son iguales
	public boolean esIgual(int a, int b) {
		
		return a == b;
		
	}

	// Este método calcula la potencia de un nº real (base) elevado a un exponente
	// entero (exponente).
	public double potenciaEntero(double base, int exponente) {
		
		if (exponente < 0) {
			throw new IllegalArgumentException("El exponente no puede ser negativo");
		}
		
		return Math.pow(base, exponente);
		
	}

	// Este método calcula la potencia de un nºreal (base)
	// elevado a un exponente representado como una cadena de texto (exponente).
	public double potenciaCadena(double base, String exponente) {
		
		try {
			
			int exp = Integer.parseInt(exponente);
			return potenciaEntero(base, exp);
			
		} catch (NumberFormatException e) {
			
			throw new IllegalArgumentException("El exponente debe ser un número válido");
			
		}
		
	}
	
}
