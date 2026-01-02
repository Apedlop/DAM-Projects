package actApl7_11;

public class MarcaPagina {

	private int pagActual;
	private int ultLeida;

	public MarcaPagina(int pagActual, int ultLeida) {
		
		this.pagActual = pagActual;
		this.ultLeida = ultLeida;
	
	}

	public void incrementarPagina() {
		
		ultLeida = pagActual;
		pagActual++;
		
	}

	public int obtenerUltLeida() {
		
		return ultLeida;
		
	}

	public void comenzarNuevaLectura() {
		
		pagActual = 1;
		ultLeida = 0;
		
	}

	public int obtenerPagActual() {
		
		return pagActual;
		
	}

}
