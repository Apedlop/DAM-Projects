package actRes8_03;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HoraExacta h1 = new HoraExacta(1, 2, 3);
		HoraExacta h2 = new HoraExacta(1, 2, 3);
		HoraExacta h3 = new HoraExacta(10, 20, 30);
		
		System.out.println("¿1:2:3 = 1:2:3? " + h1.equals(h2));
		System.out.println("¿1:2:3 = 10:20:30? " + h2.equals(h3));
		
	}

}
