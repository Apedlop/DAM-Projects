package actAmpl11_26;

import java.io.*;
import java.util.*;

public class ActAmpl11_26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Registro[] reg = new Registro[0];
        int opcion;

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("TemMaxMin.dat"))) {

            reg = (Registro[]) in.readObject();

        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }

        do {
            System.out.println("1. Nuevo registro.");
            System.out.println("2. Mostrar historial.");
            System.out.println("3. Mostrar estadísticas.");
            System.out.println("4. Salir.");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Introduce la temperatura máxima:");
                    double tempMax = sc.nextDouble();
                    System.out.println("Introduce la temperatura mínima:");
                    double tempMin = sc.nextDouble();
                    System.out.println("Introduce la fecha (formato dd/mm/yyyy):");
                    sc.nextLine(); // Limpiar el buffer del scanner
                    String fecha = sc.nextLine();
                    Registro nuevo = new Registro(tempMin, tempMax, fecha);
                    reg = Arrays.copyOf(reg, reg.length + 1);
                    reg[reg.length - 1] = nuevo;
                    break;

                case 2:
                    System.out.printf("%-15s %-15s %-15s %-15s\n", "Fecha", "Temp Mínima", "Temp Máxima", "Variación");
                    for (int i = 0; i < reg.length; i++) {
                        Registro r = reg[i];
                        System.out.printf("%-15s %-15.2f %-15.2f %-15.2f\n", r.getFecha(), r.getTempMin(), r.getTempMax(), r.getVariacion());
                    }
                    break;

                case 3:
                    double tempMaxMedia = 0, tempMinMedia = 0, variacionMedia = 0, tempMaxMax = 0, tempMinMin = 100;
                    for (int i = 0; i < reg.length; i++) {
                        Registro r = reg[i];
                        tempMaxMedia += r.getTempMax();
                        tempMinMedia += r.getTempMin();
                        variacionMedia += r.getVariacion();
                        if (r.getTempMax() > tempMaxMax) {
                        	tempMaxMax = r.getTempMax();
                        }
                        if(r.getTempMin() < tempMinMin) {
                        	tempMinMin = r.getTempMin();
                        }
                    }
                    tempMaxMedia /= reg.length;
                    tempMinMedia /= reg.length;
                    variacionMedia /= reg.length;
                    System.out.println("Temperatura máxima media: " + tempMaxMedia);
                    System.out.println("Temperatura mínima media: " + tempMinMedia);
                    System.out.println("Variación media: " + variacionMedia);
                    System.out.println("Temperatura más alta: " + tempMaxMax);
                    System.out.println("Temperatura más baja: " + tempMinMin);
                    break;

            }

        } while (opcion != 4);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("TemMaxMin.dat"))) {
            out.writeObject(reg);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}