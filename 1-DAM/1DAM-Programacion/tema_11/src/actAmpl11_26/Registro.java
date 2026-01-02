package actAmpl11_26;

import java.io.Serializable;

class Registro implements Serializable {
	
    private double tempMin, tempMax;
    private String fecha;

    Registro(double tempMin, double tempMax, String fecha) {
        this.tempMin = tempMin;
        this.tempMax = tempMax;
        this.fecha = fecha;
    }

    double getTempMin() {
        return tempMin;
    }

    double getTempMax() {
        return tempMax;
    }

    String getFecha() {
        return fecha;
    }

    double getVariacion() {
        return tempMax - tempMin;
    }
}