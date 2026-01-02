package actApl7_15;

public class Calendario {

	private int año, mes, dia;

	public Calendario(int año, int mes, int dia) {
		
        if (esFechaValida(año, mes, dia)) {
            this.año = año;
            this.mes = mes;
            this.dia = dia;
        }
        
    }

    public int getAño() {
        return año;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

	public void incrementarDia() {

		dia++;

		if (dia > diasEnMes()) {
			dia = 1;
			incrementarMes();
		}

	}

	public void incrementarMes() {
		
		mes++;
		
		if (mes > 12) {
			mes = 1;
			incrementarAño();
		}
		
	}

	public void incrementarAño() {
		
		año++;

	}

	public void mostrar() {
		
		System.out.println("Fecha original: " + dia + "/" + mes + "/" + año);
		
		incrementarDia();
		
		System.out.println("Fecha incrementada: " + dia + "/" + mes + "/" + año);
		
		System.out.println("");
	
	}

	public boolean iguales(Calendario otraFecha) {
		
		return this.año == otraFecha.año && this.mes == otraFecha.mes && this.dia == otraFecha.dia;
	
	}

	private boolean esFechaValida(int año, int mes, int dia) {
		
		return año > 0 && mes >= 1 && mes <= 12 && dia >= 1 && dia <= diasEnMes();
	
	}

	private int diasEnMes() {
		
		return (mes == 2) ? 28 : ((mes == 4 || mes == 6 || mes == 9 || mes == 11) ? 30 : 31);
	
	}

}
