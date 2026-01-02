package EjerciciosFinales;

public class Ejercicio6 {

    public static void main(String[] args) {
        // Create an array of FiguraGeometrica
        FiguraGeometrica[] figuras = new FiguraGeometrica[3];

        // Create various geometric figures
        Circulo circulo = new Circulo(5);
        Rectangulo rectangulo = new Rectangulo(4, 6);
        Triangulo triangulo = new Triangulo(3, 4);

        // Store figures in the array
        figuras[0] = circulo;
        figuras[1] = rectangulo;
        figuras[2] = triangulo;

        // Print details of each figure
        for (FiguraGeometrica figura : figuras) {
            ((Imprimible) figura).imprimir(); // Cast to Imprimible and call imprimir
        }

        // Print the total number of geometric figures created
        System.out.println("Número total de figuras geométricas creadas: " + FiguraGeometrica.getTotalFiguras());
    }
}

interface Imprimible {
    void imprimir();
}

interface ComparadorArea {
    int compararAreas(FiguraGeometrica otraFigura);
}

abstract class FiguraGeometrica {
    private static int totalFiguras = 0;

    public FiguraGeometrica() {
        totalFiguras++;
    }

    public static int getTotalFiguras() {
        return totalFiguras;
    }

    public abstract double calcularArea();
}

class Circulo extends FiguraGeometrica implements Imprimible, ComparadorArea {
    private int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public void imprimir() {
        System.out.println("Área del círculo: PI * r^2 = " + calcularArea());
    }

    @Override
    public int compararAreas(FiguraGeometrica otraFigura) {
        return Double.compare(this.calcularArea(), otraFigura.calcularArea());
    }
}

class Rectangulo extends FiguraGeometrica implements Imprimible, ComparadorArea {
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double calcularArea() {
        return ancho * alto;
    }

    @Override
    public void imprimir() {
        System.out.println("Área del rectángulo: ancho * alto = " + calcularArea());
    }

    @Override
    public int compararAreas(FiguraGeometrica otraFigura) {
        return Double.compare(this.calcularArea(), otraFigura.calcularArea());
    }
}

class Triangulo extends FiguraGeometrica implements Imprimible, ComparadorArea {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public void imprimir() {
        System.out.println("Área del triángulo: (base * altura) / 2 = " + calcularArea());
    }

    @Override
    public int compararAreas(FiguraGeometrica otraFigura) {
        return Double.compare(this.calcularArea(), otraFigura.calcularArea());
    }
}
