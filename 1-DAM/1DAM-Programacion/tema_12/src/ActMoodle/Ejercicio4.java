package ActMoodle;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        GestionEstudiantes gestion = new GestionEstudiantes();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("1. Agregar Estudiante");
            System.out.println("2. Buscar Estudiante");
            System.out.println("3. Eliminar Estudiante");
            System.out.println("4. Actualizar Promedio");
            System.out.println("5. Mostrar Estudiantes por Carrera");
            System.out.println("6. Mostrar Estudiantes por Promedio");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Edad: ");
                    int edad = scanner.nextInt();
                    System.out.print("Promedio: ");
                    double promedio = scanner.nextDouble();
                    scanner.nextLine();  // Consumir el salto de línea
                    System.out.print("Carrera: ");
                    String carrera = scanner.nextLine();
                    System.out.print("ID Estudiante: ");
                    String idEstudiante = scanner.nextLine();
                    Estudiante2 nuevoEstudiante = new Estudiante2(nombre, edad, promedio, carrera, idEstudiante);
                    gestion.agregarEstudiante(nuevoEstudiante);
                    break;
                case 2:
                    System.out.print("ID Estudiante: ");
                    idEstudiante = scanner.nextLine();
                    Estudiante2 estudiante = gestion.buscarEstudiante(idEstudiante);
                    if (estudiante != null) {
                        System.out.println(estudiante);
                    } else {
                        System.out.println("Estudiante no encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("ID Estudiante: ");
                    idEstudiante = scanner.nextLine();
                    gestion.eliminarEstudiante(idEstudiante);
                    break;
                case 4:
                    System.out.print("ID Estudiante: ");
                    idEstudiante = scanner.nextLine();
                    System.out.print("Nuevo Promedio: ");
                    promedio = scanner.nextDouble();
                    scanner.nextLine();  // Consumir el salto de línea
                    gestion.actualizarPromedio(idEstudiante, promedio);
                    break;
                case 5:
                    System.out.print("Carrera: ");
                    carrera = scanner.nextLine();
                    for (Estudiante2 est : gestion.mostrarEstudiantesPorCarrera(carrera)) {
                        System.out.println(est);
                    }
                    break;
                case 6:
                    for (Estudiante2 est : gestion.mostrarEstudiantesPorPromedio()) {
                        System.out.println(est);
                    }
                    break;
                case 7:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        scanner.close();
    }
}
