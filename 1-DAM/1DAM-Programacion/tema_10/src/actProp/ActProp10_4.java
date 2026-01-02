package actProp;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ActProp10_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		try (BufferedWriter out = new BufferedWriter(new FileWriter("ActProp10_8.txt"))) {
			
			System.out.println("Escribe varias frases: ");
			String cad = sc.nextLine();
			out.write(cad);
			
			while (cad != "fin") {
				cad = sc.nextLine();
				out.write(cad);
			}
			
		} catch (IOException ex) {
			
			System.out.println(ex.getMessage());
			
		}
		
	}

}
