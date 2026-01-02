package proyecTiempo;

public class Tiempo {

    int hora, min, seg;

    public Tiempo(int hora, int min, int seg) {
        this.hora = hora;
        this.min = min;
        this.seg = seg;
    }

    public Tiempo suma(Tiempo t1) {
    	
        int sumSeg = this.seg + t1.seg;
        int sumMin = this.min + t1.min;
        int sumHora = this.hora + t1.hora;

        if (sumSeg >= 60) {
            sumMin += sumSeg / 60;
            sumSeg %= 60;
        }

        if (sumMin >= 60) {
            sumHora += sumMin / 60;
            sumMin %= 60;
        }

        return new Tiempo(sumHora, sumMin, sumSeg);
        
    }

    public Tiempo resta(Tiempo t2) {
    	
        int restSeg = this.seg - t2.seg;
        int restMin = this.min - t2.min;
        int restHora = this.hora - t2.hora;

        if (restSeg < 0) {
            restSeg += 60;
            restMin--;
        }

        if (restMin < 0) {
            restMin += 60;
            restHora--;
        }

        return new Tiempo(restHora, restMin, restSeg);
        
    }

    public String toString() {
    	
        return hora + "h " + min + "m " + seg + "s ";
        
    }
}
