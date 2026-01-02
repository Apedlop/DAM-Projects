package actApl9_24;

import java.util.Comparator;

public class ComparadorLongitud implements Comparator {

	  public int compare(Object o1, Object o2) {
	        String s1 = (String) o1;
	        String s2 = (String) o2;
	        return Integer.compare(s1.length(), s2.length());
	    }
	
}
