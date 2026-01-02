package actRes;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class ActRes12_14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Set<ActRes12_14_Registro> temperaturas = new LinkedHashSet<>();

        int opcion;

        do {
            System.out.println("1. Nuevo registro");
            System.out.println("2. Listar registros del día");
            System.out.println("3. Mostrar estadísticas");
            System.out.println("4. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introducir temperatura: ");
                    double temperatura = sc.nextDouble();
                    temperaturas.add(new ActRes12_14_Registro(temperatura));
                    break;
                case 2:
                    System.out.println(temperaturas);
                    break;
                case 3:
                    Comparator<ActRes12_14_Registro> c = new Comparator<ActRes12_14_Registro>() {
                        @Override
                        public int compare(ActRes12_14_Registro o1, ActRes12_14_Registro o2) {
                            return (int) Math.signum(o1.temperatura - o2.temperatura);
                        }
                    };
                    System.out.println("Máxima: " + Collections.max(temperaturas, c));
                    System.out.print("Mínima: " + Collections.min(temperaturas, c));
                    double suma = 0;
                    for (ActRes12_14_Registro t : temperaturas) {
                        suma += t.temperatura;
                    }
                    System.out.print("Media: " + suma / temperaturas.size());
                    break;
            }

        } while (opcion != 4);

        String nombreArchivo = "registros";
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyyMMdd");
        nombreArchivo += LocalDate.now().format(f);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            out.writeObject(temperaturas);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
