package actApl8_24;

import actApl8_23.Poligono;

class Rectangulo extends Poligono {
	
    public Rectangulo(double base, double altura) {
    	
        super(base, altura);
        
    }

    @Override
    public double area() {
    	
        return base * altura;
        
    }
    
}
