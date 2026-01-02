import java.time.LocalDateTime;
import java.time.Duration;

public class DuracionLlamada {
    public static void main(String[] args) {
        // Supongamos que tienes la fecha y hora de inicio y fin de la llamada
        LocalDateTime inicioLlamada = LocalDateTime.of(2024, 6, 12, 10, 30, 33);
        LocalDateTime finLlamada = LocalDateTime.of(2024, 6, 12, 11, 49, 45);

        // Calcular la duración de la llamada
        Duration duracion = Duration.between(inicioLlamada, finLlamada);

        // Obtener la duración en horas, minutos y segundos
        long horas = duracion.toHours();
        long minutos = duracion.toMinutesPart();
        long segundos = duracion.toSecondsPart();

        // Imprimir la duración de la llamada
        System.out.println("Duración de la llamada: " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos.");
    }
}
