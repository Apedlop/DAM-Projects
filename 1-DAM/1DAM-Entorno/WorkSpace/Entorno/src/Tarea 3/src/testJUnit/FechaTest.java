package testJUnit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import clases.Fecha;

class FechaTest {
	
	@ParameterizedTest
	@CsvSource ({"1, 1970/01", "2, 01/1970", "3, 01/70", "4, ERROR", "5, ERROR"})
	public void testDevFecha (int tipo, String expected) {
		
		Fecha fecha = new Fecha();
		
		String result = fecha.devuelveFecha(tipo);
		assertEquals(expected, result);
		
	}

}
