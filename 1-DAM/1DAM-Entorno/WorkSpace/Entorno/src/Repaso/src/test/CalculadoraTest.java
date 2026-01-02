package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import calculadora.Calculadora;

class CalculadoraTest {

	@Test
	void testSuma() {
		Calculadora c = new Calculadora(5, 8);
		
		assertEquals(13, c.suma());
	}

	@ParameterizedTest
	@CsvSource({"7, 4, 3", "19, 15, 4"})
	void testResta(int a, int b, int result) {
		
		Calculadora c = new Calculadora(a, b);
		
		assertEquals(result, c.resta());
		
	}

	@ParameterizedTest
	@ValueSource(ints = {31, 21, 17})
	void testMultiplica(int valor) {
		
		Calculadora c = new Calculadora(7, 3);
		
		assertEquals(valor, c.multiplica());
		
	}

	@Test
	void testDivide() {
		fail("Not yet implemented");
	}

	@Test
	void testValorAbsoluto() {
		fail("Not yet implemented");
	}

	@Test
	void testRestaPositiva() {
		fail("Not yet implemented");
	}

	@Test
	void testDivideAcepta0() {
		fail("Not yet implemented");
	}

	@Test
	void testCuadradoNum() {
		fail("Not yet implemented");
	}

	@Test
	void testNumMayor() {
		fail("Not yet implemented");
	}

	@Test
	void testPotencia() {
		fail("Not yet implemented");
	}

}
