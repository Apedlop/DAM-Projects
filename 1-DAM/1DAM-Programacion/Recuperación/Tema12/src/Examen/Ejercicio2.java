package Examen;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Ejercicio2 {

    public static void main(String[] args) {

        // Crear equipo 1
        Map<String, List<Equipo>> equipos = new TreeMap<>();
        List<Equipo> equipo1 = new ArrayList<>();

        equipo1.add(new Equipo("Julieta", "10/02/2005", Posicion.BASE));
        equipo1.add(new Equipo("Juan", "15/05/2010", Posicion.PIVOT));
        equipo1.add(new Equipo("Julio", "11/12/2007", Posicion.ALERO_PIVOT));
        equipo1.add(new Equipo("Janne", "21/09/2008", Posicion.ESCOLTA));

        equipos.put("Lakers", equipo1);

        // Crear equipo 2
        List<Equipo> equipo2 = new ArrayList<>();

        equipo2.add(new Equipo("Ana", "12/03/2002", Posicion.BASE));
        equipo2.add(new Equipo("Maria", "22/07/2003", Posicion.ESCOLTA));
        equipo2.add(new Equipo("Carlos", "18/09/2004", Posicion.PIVOT));
        equipo2.add(new Equipo("Luis", "05/11/2006", Posicion.ALERO));

        equipos.put("Warriors", equipo2);

        // Cambiar posicion
        System.out.println("Cambio de posicion a Ana: ");
        for (Map.Entry<String, List<Equipo>> entry : equipos.entrySet()) {
            for (Equipo jugador : entry.getValue()) {
                if (jugador.getNombre().equalsIgnoreCase("Ana")) {
                    jugador.setPosicion(Posicion.ESCOLTA);
                    System.out.println("La nueva posición de Ana es ESCOLTA.");
                    return;
                }
            }
        }

        // Orden por nombre del equipo
        for (Map.Entry<String, List<Equipo>> entry : equipos.entrySet()) {
            String nombreEquipo = entry.getKey();
            List<Equipo> jugadores = entry.getValue();

            System.out.println("Equipo: " + nombreEquipo);
            for (Equipo jugador : jugadores) {
                System.out.println(jugador);
            }
            System.out.println();
        }

        // Jugadores que ocupan la posicion BASE, ordenado alfabeticamente
        List<Equipo> jugadoresPorPosicion = new ArrayList<>();

        for (List<Equipo> equipo : equipos.values()) {
            for (Equipo jugador : equipo) {
                if (jugador.getPosicion() == Posicion.BASE) {
                    jugadoresPorPosicion.add(jugador);
                }
            }
        }

        Collections.sort(jugadoresPorPosicion, new Comparator<Equipo>() {
            @Override
            public int compare(Equipo o1, Equipo o2) {
                return 0;
            }
        });

        for (Equipo jugador : jugadoresPorPosicion) {
            System.out.println(jugador);
        }

        // Listado por antigüedad
        List<Map.Entry<String, List<Equipo>>> equiposOrdenados = new ArrayList<>(equipos.entrySet());
        Collections.sort(equiposOrdenados, new Comparator<Map.Entry<String, List<Equipo>>>() {
            @Override
            public int compare(Map.Entry<String, List<Equipo>> o1, Map.Entry<String, List<Equipo>> o2) {
                LocalDate fechaEquipo1 = o1.getValue().get(0).getFechaIncor();
                LocalDate fechaEquipo2 = o2.getValue().get(0).getFechaIncor();
                return fechaEquipo1.compareTo(fechaEquipo2);
            }
        });

        System.out.println("Equipos ordenados por antigüedad:");
        for (Map.Entry<String, List<Equipo>> entry : equiposOrdenados) {
            System.out.println(entry.getKey());
        }

        jugadoresPorPosicion.sort(new Comparator<Equipo>() {
            @Override
            public int compare(Equipo o1, Equipo o2) {
                return o1.antiguedad() - o2.antiguedad();
            }
        });

        System.out.println(jugadoresPorPosicion);

    }

}

class Equipo implements Comparable<Equipo> {

    static int contador = 1;
    String nombre;
    int dorsal;
    LocalDate fechaIncor;
    Posicion posicion;

    public Equipo(String nombre, String fechaIncor, Posicion posicion) {
        this.nombre = nombre;
        this.dorsal = contador++;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaIncor = LocalDate.parse(fechaIncor, f);
        this.posicion = posicion;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Equipo.contador = contador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public LocalDate getFechaIncor() {
        return fechaIncor;
    }

    public void setFechaIncor(LocalDate fechaIncor) {
        this.fechaIncor = fechaIncor;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    int antiguedad() {
        return (int) fechaIncor.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", dorsal=" + dorsal +
                ", antiguedad=" + fechaIncor +
                ", posicion=" + posicion +
                '}';
    }

    @Override
    public int compareTo(Equipo o) {
        return nombre.compareTo(o.nombre);
    }
}

enum Posicion {
    BASE, PIVOT, ALERO, ALERO_PIVOT, ESCOLTA
}