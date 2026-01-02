package actExtra1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Asignatura programacion = new Asignatura(0, "Programación");
		Asignatura baseDatos = new Asignatura(1, "Base de Datos");
		Asignatura lenguajeMarcas = new Asignatura(2, "Lenguaje");
		Asignatura entorno = new Asignatura(3, "Entorno\t");
		Asignatura fol = new Asignatura(4, "FOL\t");
		Asignatura sistemasInformaticos = new Asignatura(5, "Sistemas");

		Alumno juan = new Alumno("12345678A", "Juan",
				new AsignaturaNota[] { new AsignaturaNota(programacion, new Calificaciones(5)),
						new AsignaturaNota(baseDatos, new Calificaciones(1)),
						new AsignaturaNota(lenguajeMarcas, new Calificaciones(8)),
						new AsignaturaNota(sistemasInformaticos, new Calificaciones(6)),
						new AsignaturaNota(fol, new Calificaciones(9)),
						new AsignaturaNota(entorno, new Calificaciones(4)) });

		Alumno maria = new Alumno("87654321B", "Maria",
				new AsignaturaNota[] { new AsignaturaNota(programacion, new Calificaciones(8)),
						new AsignaturaNota(baseDatos, new Calificaciones(6)),
						new AsignaturaNota(lenguajeMarcas, new Calificaciones(4)),
						new AsignaturaNota(sistemasInformaticos, new Calificaciones(5)),
						new AsignaturaNota(fol, new Calificaciones(3)),
						new AsignaturaNota(entorno, new Calificaciones(7)) });

		String[][] tabla = contarCalificaciones(new Alumno[] { juan, maria });

		// Imprimir la tabla
		for (int i = 0; i < tabla.length; i++) {
			String[] fila = tabla[i];
			for (int j = 0; j < fila.length; j++) {
				String dato = fila[j];
				System.out.print(dato + "\t");
			}
			System.out.println();
		}

	}

	private static String[][] contarCalificaciones(Alumno[] alumnos) {
		
		// Obtener el número total de asignaturas
		int numAsignaturas = alumnos[0].getAsignaturasNotas().length;

		// Crear la tabla con filas para cada tipo de calificación y columnas para cada
		// asignatura
		String[][] tabla = new String[numAsignaturas + 1][6];

		tabla[0][0] = "Asignatura\t";
		for (int i = 0; i < numAsignaturas; i++) {
			tabla[i + 1][0] = alumnos[0].getAsignaturasNotas()[i].getAsignatura().getAsignatura() + "\t";
		}

		tabla[0][1] = "Sus";
		tabla[0][2] = "Apr";
		tabla[0][3] = "Bien";
		tabla[0][4] = "Not";
		tabla[0][5] = "Sobr";

		// Iterar sobre todas las asignaturas para contar las calificaciones
		for (int i = 0; i < alumnos.length; i++) {
			Alumno alumno = alumnos[i];
			AsignaturaNota[] asignaturasNotas = alumno.getAsignaturasNotas();

			// Contar las calificaciones para cada asignatura
			for (int j = 0; j < asignaturasNotas.length; j++) {
				AsignaturaNota asignaturaNota = asignaturasNotas[j];
				Calificaciones calificaciones = asignaturaNota.getCalificaciones();

//				// Calcular el tipo de calificación (suspensos, aprobados, etc.)
//				int sus = 0, apr = 0, bien = 0, not = 0, sobr = 0;
//				int[] notas = { calificaciones.getNumSus(), calificaciones.getNumApr(), calificaciones.getNumBien(),
//						calificaciones.getNumNot(), calificaciones.getNumSob() };
//				for (int k = 0; k < notas.length; k++) {
//					int nota = notas[k];
//					if (nota < 5) {
//						sus++;
//					} else if (nota == 5) {
//						apr++;
//					} else if (nota == 6) {
//						bien++;
//					} else if (nota >= 7 && nota <= 8) {
//						not++;
//					} else {
//						sobr++;
//					}
//
//				} // Agregar los contadores a la tabla
				tabla[j + 1][1] = String.valueOf(calificaciones.getNumSus());
				tabla[j + 1][2] = String.valueOf(calificaciones.getNumApr());
				tabla[j + 1][3] = String.valueOf(calificaciones.getNumBien());
				tabla[j + 1][4] = String.valueOf(calificaciones.getNumNot());
				tabla[j + 1][5] = String.valueOf(calificaciones.getNumSob());
			}
		}
		return tabla;

	}

}
