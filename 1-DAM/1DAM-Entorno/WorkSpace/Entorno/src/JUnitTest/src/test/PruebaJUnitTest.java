//Ángela Kaijing Pedrera López

package test;

import u3.JUnit.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class PruebaJUnitTest {

	@Test
	void testEsPositivo() {

		PruebaJUnit p = new PruebaJUnit();

		// Comprobamos que los valores límites son verdadesros o falsos, los verdaderos
		// para los valores que si son esperados y los falsos para lo que no son esperados.
		assertTrue(p.esPositivo(2));
		assertTrue(p.esPositivo(1));
		assertFalse(p.esPositivo(0));
		assertFalse(p.esPositivo(-1));

	}

	@Test
	void testConcatenar() {

		PruebaJUnit p = new PruebaJUnit();

		// Comprobamos que el método es igual a los valores introducidos, para comprovar
		// que devuelve lo esperado.
		assertEquals(p.concatenar("Hola", " mundo"), "Hola mundo");

	}

	@ParameterizedTest
	@CsvSource({ "5, 2, 25", "1, 9, 1" })
	void testPotenciaEntero(int a, int b, int result) {

		PruebaJUnit p = new PruebaJUnit();

		// Comprobamos que los valores son los esperados
		assertEquals(result, p.potenciaEntero(a, b));
		
	}

	@Test
	void testPotenciaEntero() {

		PruebaJUnit p = new PruebaJUnit();

		// Comprobamos que el método lanza una excepción
		assertEquals(p.potenciaEntero(1, -1), 1);

	}

	@Test
	void testPotenciaCadena() {

		PruebaJUnit p = new PruebaJUnit();

		assertEquals(p.potenciaCadena(2, "55"), 3.6028797018963968E16);

	}

}
