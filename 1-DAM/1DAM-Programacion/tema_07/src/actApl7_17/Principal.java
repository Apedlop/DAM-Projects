package actApl7_17;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String textoOriginal = "abc...xyz";

		int paso = 3;
		String textoCifrado = CifradoCesar.cifrar(textoOriginal, paso);

		System.out.println("Texto original: " + textoOriginal);
		System.out.println("Texto cifrado: " + textoCifrado);

	}

}
