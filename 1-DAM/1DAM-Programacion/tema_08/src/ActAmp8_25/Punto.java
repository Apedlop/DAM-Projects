package ActAmp8_25;

public class Punto {

	protected int x;
	protected int y;

    public Punto(int x, int y) {
    	
        this.x = x;
        this.y = y;
        
    }

    public double distancia(Punto otroPunto) {
    	
        int dx = this.x - otroPunto.x;
        int dy = this.y - otroPunto.y;
        
        return Math.sqrt(dx * dx + dy * dy);
        
    }
	
}
