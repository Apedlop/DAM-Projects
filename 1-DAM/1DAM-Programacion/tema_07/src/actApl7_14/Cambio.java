package actApl7_14;

public class Cambio {

	private double importeCompra;
	private double importePagado;

	public Cambio(double importeCompra, double importePagado) {

		this.importeCompra = importeCompra;
		this.importePagado = importePagado;

	}

	public void setImporteCompra(double importeCompra) {

		this.importeCompra = importeCompra;

	}

	public void setImportePagado(double importePagado) {

		this.importePagado = importePagado;

	}

	public void calcularCambio() {

		if (importePagado < importeCompra) {
			System.out.println("El importe pagado es insuficiente.");
			return;
		}

		double cambio = importePagado - importeCompra;

		System.out.println("Importe del cambio: " + cambio);

		desglosarCambio(cambio);

	}

	private void desglosarCambio(double cambio) {

		double[] denominaciones = { 500, 200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.20, 0.10, 0.05, 0.02, 0.01};
		String[] nombresDenominaciones = { "500€", "200€", "100€", "50€", "20€", "10€", "5€", "2€", "1€", "0.50€",
										   "0.20€", "0.10€", "0.05€", "0.02€", "0.01€" };

		int[] cantidades = new int[denominaciones.length];

		for (int i = 0; i < denominaciones.length; i++) {

			int cantidad = (int) (cambio / denominaciones[i]);

			if (cantidad > 0) {
				cantidades[i] = cantidad;
				cambio -= cantidad * denominaciones[i];

			}

		}

		System.out.println("Cambio desglosado:");

		for (int i = 0; i < cantidades.length; i++) {

			if (cantidades[i] > 0) {
				System.out.println(nombresDenominaciones[i] + ": " + cantidades[i]);
			}

		}

	}

}
