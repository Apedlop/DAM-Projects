package actApl7_11;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcaPagina m = new MarcaPagina(85, 84);
        System.out.println("Página actual: " + m.obtenerPagActual());

        m.incrementarPagina();
        m.incrementarPagina();
        System.out.println("Última página leída: " + m.obtenerUltLeida());

        m.comenzarNuevaLectura();
        System.out.println("Página actual después de comenzar nueva lectura: " + m.obtenerPagActual());
    
		
	}

}
