package actRes;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class ActRes12_14_Registro implements Serializable {

    LocalTime hora;
    double temperatura;

    public ActRes12_14_Registro(double temperatura) {
        this.temperatura = temperatura;
        this.hora = LocalTime.now();
    }

    public boolean equals(Object o) {
        return hora.equals(((ActRes12_14_Registro) o).hora);
    }

    @Override
    public String toString() {
        // MEDIUM nos muestra un estilo medio es un formato que muestra la hora con cierto grado de detalle pero no excesivamente detallado. Ej: 12:34:56 AM
        // Locale.getDefault() obtiene el localizador predeterminado del sistema en el que se está ejecutando el código.
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM).withLocale(Locale.getDefault());
        return "Registro {" + hora.format(f) + ", temperatura = " + temperatura + "ºC}\n";
    }

}
