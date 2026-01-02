package proyecFigurasGeometricas;

public class Rectangulo extends FigurasGeometricas {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo(double base, double altura, String c) {
        super(c);
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
    }

    @Override
    public int CompararArea(FigurasGeometricas otraFigura) {
        double areaRectangulo = calcularArea();
        double areaOtraFigura = otraFigura.calcularArea();
        if (areaRectangulo < areaOtraFigura) {
            return -1;
        } else if (areaRectangulo > areaOtraFigura) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public void imprimir() {
        System.out.println("Rectángulo: Base = " + base + ", Altura = " + altura + ", Área = " + calcularArea() + ", Color = " + getColor());
    }
}
