package actRes8_04y05;

import java.util.Arrays;

public abstract class Instrumento {

	protected Nota[] melodia;

    public Instrumento() {
    	
        melodia = new Nota[0];
        
    }

    public void add(Nota n) {
    	
        melodia = Arrays.copyOf(melodia, melodia.length + 1);
        melodia[melodia.length - 1] = n;
        
    }

    abstract void interpretar();
    
}