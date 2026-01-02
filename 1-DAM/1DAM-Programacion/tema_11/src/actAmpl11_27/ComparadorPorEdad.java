package actAmpl11_27;

import java.time.LocalDate;
import java.util.Comparator;

public class ComparadorPorEdad implements Comparator {
    
    // Método para calcular la edad dado la fecha de nacimiento en formato dd/mm/yyyy
    private int calcularEdad(String fechaNacimiento) {
        // Dividimos la cadena de fecha en sus componentes
        String[] partes = fechaNacimiento.split("/");
        int añoNacimiento = Integer.valueOf(partes[2]);
        int mesNacimiento = Integer.valueOf(partes[1]);
        int diaNacimiento = Integer.valueOf(partes[0]);
        
        // Obtenemos la fecha actual
        LocalDate fechaActual = LocalDate.now();
        
        // Calculamos la edad
        int edad = fechaActual.getYear() - añoNacimiento;
        
        // Ajustamos la edad si el cumpleaños todavía no ha ocurrido este año
        if (fechaActual.getMonthValue() < mesNacimiento || 
            (fechaActual.getMonthValue() == mesNacimiento && fechaActual.getDayOfMonth() < diaNacimiento)) {
            edad--;
        }
        
        return edad;
    }

    @Override
    public int compare(Object obj1, Object obj2) {
        Deportistas deportista1 = (Deportistas) obj1;
        Deportistas deportista2 = (Deportistas) obj2;
        
        // Obtenemos las fechas de nacimiento de los deportistas
        String fechaNacimiento1 = deportista1.getFecha();
        String fechaNacimiento2 = deportista2.getFecha();
        
        // Calculamos la edad de cada deportista
        int edad1 = calcularEdad(fechaNacimiento1);
        int edad2 = calcularEdad(fechaNacimiento2);
        
        // Comparamos las edades
        return Integer.compare(edad1, edad2);
    }
}
