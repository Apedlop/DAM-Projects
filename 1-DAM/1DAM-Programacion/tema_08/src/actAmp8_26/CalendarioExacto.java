package actAmp8_26;

import java.util.Objects;

public class CalendarioExacto extends Calendario {

    private int hora;
    private int minuto;

    public CalendarioExacto(int año, int mes, int dia, int hora, int minuto) {
        super(año, mes, dia);
        if (esHoraValida(hora) && esMinutoValido(minuto)) {
            this.hora = hora;
            this.minuto = minuto;
        }
    }

	@Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CalendarioExacto that = (CalendarioExacto) obj;
        return super.equals(obj) && hora == that.hora && minuto == that.minuto;
    } 

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hora, minuto);
    }

    private boolean esHoraValida(int hora) {
        return hora >= 0 && hora <= 23;
    }

    private boolean esMinutoValido(int minuto) {
        return minuto >= 0 && minuto <= 59;
    }
}
