package actApl9_14;

public class CompararNombre {

	public int compare(Object o1, Object o2) {
		
		return ((Futbolista) o1).nombre.compareTo (((Futbolista) o2).nombre);
		
	}
	
}
