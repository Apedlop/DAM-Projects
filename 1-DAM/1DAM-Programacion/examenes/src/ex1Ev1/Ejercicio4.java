package ex1Ev1;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nota, maxClase = 1, minClase = 10, maxTodo = 0, minTodo = 10, clase = 0, alumnoMax = 0, alumnoMin = 0;
		double media = 0, mediaTodo = 0;

		for (int i = 1; i <= 3; i++) {
			System.out.println("Clase " + i);
			for (int j = 1; j <= 5; j++) {
				nota = (int) (Math.random() * 10 + 1);
				media += nota;
				if (nota > maxClase) {
					maxClase = nota;
					maxTodo = nota;
					clase = i;
					alumnoMax = j;
				}
				if (nota < minClase) {
					minClase = nota;
					minTodo = nota;
					clase = i;
					alumnoMin = j;
				}
				System.out.println("Alumno " + j + " : " + nota);
			}
			
			mediaTodo += media;
			media = media / 5;
			
			System.out.println("La nota máxima de la clase " + i + " es: " + maxClase);
			System.out.println("La nota mínima de la clase " + i + " es: " + minClase);
			System.out.println("La nota media de la clase es: " + media);

			maxClase = 0;
			minClase = 10;

			System.out.println();

		}

		mediaTodo = mediaTodo / 15; // entre 15 porque es la cantidad de alumnos.
		System.out.println("\nLa nota mínima de todas las clases es: " + maxTodo + " de la clase: " + clase
				+ " del alumno " + alumnoMax + "\nLa nota máxima de todas las clases es: " + minTodo + " de la clase: "
				+ clase + " del alumno " + alumnoMin);
		System.out.println("La media de nota de todas las clases es: " + mediaTodo);
	}

}
