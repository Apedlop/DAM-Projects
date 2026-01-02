package EjerciciosFinales;

import java.util.Arrays;

public class Ejercicio5 {

    public static void main(String[] args) {

        Tiempo t = new Tiempo(1, 50, 30);
        Tiempo t2 = new Tiempo(0, 20, 40);

        System.out.println(t.suma(t2));
        System.out.println(t.resta(t2));
    }

}

class Tiempo {

    int hora;
    int minutos;
    int segundos;

    public Tiempo(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public Tiempo suma(Tiempo t) {
        int h = this.hora + t.hora;
        int min = this.minutos + t.minutos;
        int s = this.segundos + t.segundos;

        if (s > 60) {
            min += s / 60;
            s %= 60;
        }

        if (min > 60) {
            h += min / 60;
            min %= 60;
        }

        return new Tiempo(h, min, s);
    }

    public Tiempo resta(Tiempo t) {
        int h = this.hora - t.hora;
        int min = this.minutos - t.minutos;
        int s = this.segundos - t.segundos;

        if (s < 0) {
            min--; // Reducir un minuto
            s += 60; // Ajustar segundos
        }

        if (min < 0) {
            h--; // Reducir una hora
            min += 60; // Ajustar minutos
        }

        if (h < 0) {
            h += 24; // Ajustar horas si es negativo
        }

        return new Tiempo(h, min, s);
    }

    public String toString() {
        return hora + "h " + minutos + "m " + segundos + "s";
    }

}