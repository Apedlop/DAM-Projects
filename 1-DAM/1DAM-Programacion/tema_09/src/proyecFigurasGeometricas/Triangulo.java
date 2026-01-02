package proyecFigurasGeometricas;

public class Triangulo extends FigurasGeometricas {

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(double base, double altura, String c) {
        super(c);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public int CompararArea(FigurasGeometricas otraFigura) {
        double areaTriangulo = calcularArea();
        double areaOtraFigura = otraFigura.calcularArea();
        if (areaTriangulo < areaOtraFigura) {
            return -1;
        } else if (areaTriangulo > areaOtraFigura) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public void imprimir() {
        System.out.println("Triángulo: Base = " + base + ", Altura = " + altura + ", Área = " + calcularArea() + ", Color = " + getColor());
    }
}
