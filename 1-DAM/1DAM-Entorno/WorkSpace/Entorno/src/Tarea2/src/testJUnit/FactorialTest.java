package testJUnit;

import clases.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class FactorialTest {

	@ParameterizedTest
    @ValueSource(ints = {0, 1, 1})
    public void testCalculoPositivo(int n) {
		
        assertEquals(1, Factorial.calculo(n));
        
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, -5, -10})
    public void testCalculoNegativo(int n) {
    	
    	try {
    		Factorial.calculo(-5);
    		fail("Es esperaba una excepcion de tipo IllegalArgumentException");
    	} catch (IllegalArgumentException e) {
    		//Expeción esperada
    	}
        
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 5, 10})
    public void testCalculoDesbordamiento(int n, String expectedMessage) {
    
    	try {
    		Factorial.calculo(13);
    		fail("Se esperaba una exepción de tipo ArithmeticException");
    	} catch (ArithmeticException e) {
    		//Excepción esperada
		}
    	
    }

}
