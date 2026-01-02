package proyecFigurasGeometricas;

public class Principal {

    public static void main(String[] args) {
        // Crear varias figuras geométricas y almacenarlas en un array
        FigurasGeometricas[] figuras = new FigurasGeometricas[3];
        figuras[0] = new Circulo(5, "Rojo");
        figuras[1] = new Rectangulo(3, 4, "Azul");
        figuras[2] = new Triangulo(4, 5, "Amarillo");

        // Imprimir las figuras geométricas y calcular su área
        for (int i = 0; i < figuras.length; i++) {
            figuras[i].imprimir();
        }

        // Comparar áreas entre diferentes figuras geométricas
        if (figuras[0].CompararArea(figuras[1]) < 0) {
            System.out.println("El círculo tiene un área menor que el rectángulo.");
        } else if (figuras[0].CompararArea(figuras[1]) > 0) {
            System.out.println("El círculo tiene un área mayor que el rectángulo.");
        } else {
            System.out.println("El círculo tiene el mismo área que el rectángulo.");
        }
    }
}
