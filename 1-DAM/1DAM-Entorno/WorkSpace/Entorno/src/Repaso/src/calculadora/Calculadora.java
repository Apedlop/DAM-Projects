package calculadora;

public class Calculadora {

	private int num1;
	private int num2;

	public Calculadora(int num1, int num2) {
		
		super();
		this.num1 = num1;
		this.num2 = num2;
		
	}
	
	public int suma() {
		
		return num1 + num2;
		
	}
	
	public int resta() {
		
		return num1 - num2;
		
	}
	
	public int multiplica() {
		
		return num1 * num2;
		
	}
	
	public int divide() {
		
		return num1 / num2;
		
	}
	
	public int valorAbsoluto() {
		
		//Si se cumple la expresión (this.num1 >= this.num2) entonces se hace esa expresión, pero
		//si no se cumple esa condición se hace la otra 
		
		return restaPositiva() ? num1 - num2 : num2 - num1;
		
	}
	
	public boolean restaPositiva() {
		
		return this.num1 >= this.num2;
		
	}
	
	public Integer divideAcepta0() {
		
		//Si se cumple que num2 == 0 entonces el programa devolverá null, si no devolverá la
		//otra expresión (num1 / num2)
		
		return num2 == 0 ? null : num1 / num2;
		
	}
	
	public Integer cuadradoNum() {
		
		return numMayor() ? num1 * num1 : num2 * num2;
		
	}
	
	public boolean numMayor() {
		
		return this.num1 >= this.num2;
		
	}
	
	public int potencia() {
		
		return (int) Math.pow(num1, num2);
		
	}
	
}
