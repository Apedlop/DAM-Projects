package actExtra1;

public class Calificaciones {

    int codigo;
    int numSus, numApr, numBien, numNot, numSob;

    public Calificaciones(int nota) {
        if (nota < 5) {
            this.numSus++;
        } else if (nota == 5) {
            this.numApr++;
        } else if (nota == 6) {
            this.numBien++;
        } else if (nota >= 7 && nota <= 8) {
            this.numNot++;
        } else {
            this.numSob++;
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumSus() {
        return numSus;
    }

    public void setNumSus(int numSus) {
        this.numSus = numSus;
    }

    public int getNumApr() {
        return numApr;
    }

    public void setNumApr(int numApr) {
        this.numApr = numApr;
    }

    public int getNumBien() {
        return numBien;
    }

    public void setNumBien(int numBien) {
        this.numBien = numBien;
    }

    public int getNumNot() {
        return numNot;
    }

    public void setNumNot(int numNot) {
        this.numNot = numNot;
    }

    public int getNumSob() {
        return numSob;
    }

    public void setNumSob(int numSob) {
        this.numSob = numSob;
    }

}
