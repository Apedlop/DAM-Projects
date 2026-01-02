package actAmp8_27;

import java.util.Objects;

public class Punto3D extends Punto {

    private int z;

    public Punto3D(int x, int y, int z) {
    	
        super(x, y);
        this.z = z;
        
    }

    public int getZ() {
    	
        return z;
        
    }

    @Override
    public boolean equals(Object obj) {
    	
        if (this == obj) {
            return true;
        }
        
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        
        if (!super.equals(obj)) {
            return false;
        }
        
        Punto3D punto3D = (Punto3D) obj;
        
        return z == punto3D.z;
        
    }

    @Override
    public int hashCode() {
    	
        return Objects.hash(super.hashCode(), z);
        
    }
    
}
