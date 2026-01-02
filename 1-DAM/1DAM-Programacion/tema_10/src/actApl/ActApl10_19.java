package actApl;

import java.awt.geom.Point2D;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.PopupFactory;

public class ActApl10_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String texto = " ";
		
		try (BufferedReader in = new BufferedReader(new FileReader("Carta.txt"));
			 BufferedWriter out = new BufferedWriter(new FileWriter("codec.txt"))){
			
			String linea = in.readLine();
			
			while(linea != null) {
				
				final char conj1[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
				final char conj2[] = {'e', 'm', 's', 'r', 'c', 'y', 'j', 'n', 'ñ', 'x', 'i', 'w', 't', 'f', 'a', 'k', 'o', 'z', 'd', 'l', 'q', 'v', 'b', 'h', 'u', 'p', 'g'};
				char cod[];
				
				texto = texto + linea + '\n';
				
				texto = texto.toLowerCase();
				cod = new char[texto.length()];
				
				for (int i = 0; i < texto.length(); i++) {
					cod[i] = codifoca(conj1, conj2, texto.charAt(i));
				}
				
				texto = String.valueOf(cod);
				
				out.write(texto);
				
				linea = in.readLine();
				
			}
			
			System.out.println("Texto introducido correctamente.");
			
		} catch (IOException ex) {
			
			System.out.println(ex.getMessage());
			
		}
		
	}
	
	static char codifoca(char conjunto1[], char conjunto2[], char c) {
		
		final String conj1 = String.valueOf(conjunto1);
		char codificado;
		int pos = conj1.indexOf(c);
		
		if (pos == -1) {
			codificado = c;
		} else {
			codificado = conjunto2[pos];
		}
		
		return codificado;
		
	}

}
