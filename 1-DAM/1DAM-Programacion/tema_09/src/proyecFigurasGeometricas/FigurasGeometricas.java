package proyecFigurasGeometricas;

public abstract class FigurasGeometricas implements CompararArea, Imprimible {

    static int numFig = 0;
    String color;

    public abstract double calcularArea();

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public FigurasGeometricas() {
        this.color = "Verde";
        numFig++;
    }

    public FigurasGeometricas(String c) {
        this.color = c;
        numFig++;
    }

    public String toString() {
        return "Color: " + color;
    }
}
