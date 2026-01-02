package proyecFigurasGeometricas;

public class Circulo extends FigurasGeometricas {

    private double radio;
    private final double PI = Math.PI;

    public Circulo() {
    }

    public Circulo(double r) {
        this.radio = r;
    }

    public Circulo(double r, String c) {
        super(c);
        this.radio = r;
    }

    public double calcularArea() {
        return PI * Math.pow(radio, 2);
    }

    public String toString() {
        return "Círculo: Radio = " + radio + ", Área = " + calcularArea() + ", Color = " + getColor();
    }

    @Override
    public int CompararArea(FigurasGeometricas otraFigura) {
        double areaCirculo = calcularArea();
        double areaOtraFigura = otraFigura.calcularArea();
        if (areaCirculo < areaOtraFigura) {
            return -1;
        } else if (areaCirculo > areaOtraFigura) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public void imprimir() {
        System.out.println(toString());
    }
}
