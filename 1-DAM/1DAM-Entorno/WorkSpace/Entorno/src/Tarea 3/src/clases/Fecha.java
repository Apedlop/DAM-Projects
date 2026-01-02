package clases;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Fecha {

	SimpleDateFormat formato;
	Date hoy;

	public Fecha() {
		
		hoy = new Date(0);
		
	}

	public String devuelveFecha(int tipo) {
		
		String cad = "";
		
		switch (tipo) {
		
			case 1: {
				formato = new SimpleDateFormat("yyyy/MM");
				cad = formato.format(hoy);
				break;
			}
		
			case 2: {
				formato = new SimpleDateFormat("MM/yyyy");
				cad = formato.format(hoy);
				break;
			}
		
			case 3: {
				formato = new SimpleDateFormat("MM/yy");
				cad = formato.format(hoy);
				break;
			}
		
			default: {
				cad = "ERROR";
			}
		
		}
		
		return cad;
		
	}
	
}
