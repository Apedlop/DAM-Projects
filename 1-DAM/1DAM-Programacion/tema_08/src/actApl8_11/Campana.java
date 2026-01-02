package actApl8_11;

public class Campana extends Instrumento {

    public Campana() {
        
    	super(); 
    	
    }

    @Override
    void interpretar() {
    	
        System.out.println("Interpretando la campana...");
        
        for (Nota nota : melodia) {
            System.out.println("Tocando la nota: " + nota);
        }
        
    }

}