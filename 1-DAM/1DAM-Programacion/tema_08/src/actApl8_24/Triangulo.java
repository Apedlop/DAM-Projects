package actApl8_24;

import actApl8_23.Poligono;

class Triangulo extends Poligono {
	
    public Triangulo(double base, double altura) {
    	
        super(base, altura);
        
    }

    @Override
    public double area() {
    	
        return (base * altura) / 2;
        
    }
    
}
