package actRes;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Registro implements Serializable {

	double temperatura;
	LocalDateTime fechaYHora;
	
	Registro(double temperatura) {
		
		this.temperatura = temperatura;
		fechaYHora = LocalDateTime.now();
		
	}
	
	@Override
	public String toString() {
		
		//Mostramos la fecha y hora en formato local (en España, el español) corto
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(Locale.getDefault());
		
		return "Registro {" + "temperatura = " + temperatura + ", Fecha y Hora = " + f.format(fechaYHora) + "}\n";
		
	}
	
}
