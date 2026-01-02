package actAmpl9_28;

import java.time.LocalDateTime;

public class Jornada {

	Object dni, horaEntrada, horaSalida, fecha;

	public Jornada(Object dni, Object horaEntrada, Object horaSalida, Object fecha) {

		this.dni = dni;
		this.horaEntrada = horaEntrada;
		this.horaSalida = horaSalida;
		this.fecha = fecha;

	}

	public int contarMin() {

		LocalDateTime entrada = (LocalDateTime) horaEntrada;
		LocalDateTime salida = (LocalDateTime) horaSalida;
		
		// Calcular la diferencia en minutos entre horaEntrada y horaSalida
		long difMin = salida.toLocalTime().toSecondOfDay() / 60 - entrada.toLocalTime().toSecondOfDay() / 60;
		return (int) difMin;

	}

	public int compareTo(Object otraJornada) {
		
		// Comparar por DNI
		int comparacionPorDNI = this.dni.toString().compareTo(((Jornada) otraJornada).dni.toString());
		
		if (comparacionPorDNI != 0) {
			return comparacionPorDNI;
		}
		
		// Si los DNI son iguales, comparar por fecha de jornada
		LocalDateTime fecha1 = (LocalDateTime) this.fecha;
		LocalDateTime fecha2 = (LocalDateTime) ((Jornada) otraJornada).fecha;
		
		return fecha1.compareTo(fecha2);
	}

	@Override
	public String toString() {
		
		// Calcular la duración de la jornada
		int duracionMinutos = contarMin();
		
		// Formatear la fecha
		LocalDateTime fechaJornada = (LocalDateTime) fecha;
		String fechaFormateada = fechaJornada.toLocalDate().toString();
		
		// Retornar la información formateada
		return "DNI: " + dni + ", fecha: " + fechaFormateada + ", duración de la jornada (minutos): " + duracionMinutos;
	
	}
	
}