package testJUnit;

import calculadora.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class CalculadoraTest {

	@ParameterizedTest
	@ValueSource(ints = { 10, 20, 30 })
	public void testSuma(int valor) {

		assertNotNull(valor);
		
//		Calculadora c = new Calculadora(10, 5);
//		assertEquals(15, c.suma());

	}

	@ParameterizedTest
	@ValueSource(ints = { 20, 10, 10 }) //Se usa para validar un solo valor
	public void testResta(int valor) {
		
		assertNotNull(valor);

		Calculadora c = new Calculadora(10, 5);
		assertEquals(5, c.resta());

	}

	@ParameterizedTest
	@CsvSource({ "2, 5, 10", "7, 5, 35", "-4, 3, -12" }) //Se usa para validar varios valores 
	public void testMultiplica(int a, int b, int resultadoEsperado) {

		assertEquals(resultadoEsperado, new Calculadora(a, b).multiplica());

	}

	@Test
	public void testDivide() {

		Calculadora c = new Calculadora(30, 2);
		assertEquals(15, c.divide());

	}

	@Test
	public void testValorAbs() {

		Calculadora c = new Calculadora(5, -3);
		assertEquals(8, c.valorAbsoluto());

	}

	@Test
	public void testRestaPositiva() {

		Calculadora c = new Calculadora(5, 3);
		assertTrue(c.restaPositiva());

	}

	@Test
	public void testDivideAcepta0() {

		Calculadora c = new Calculadora(6, 3);
		assertEquals(2, c.divideAcepta0());

	}

	@Test
	public void testDivideAceptaCero() {

		Calculadora c = new Calculadora(6, 0);
		assertNull(c.divideAcepta0());

	}

	@Test
	public void testCuadradoNum() {

		Calculadora c = new Calculadora(6, 3);
		assertEquals(36, c.cuadradoNum());

	}

	@Test
	public void testCuadradoNum2() {

		Calculadora c = new Calculadora(6, 8);
		assertEquals(64, c.cuadradoNum());

	}

	@Test
	public void testPotencia() {

		Calculadora c = new Calculadora(2, 0);
		assertEquals(1, c.potencia());

	}

	@Test
	public void testPotencia1() {

		Calculadora c = new Calculadora(2, 5);
		assertEquals(32, c.potencia());

	}
}