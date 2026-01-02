package ActMoodle;

import java.io.*;
import java.util.*;

public class GestionEstudiantes {
    private Map<String, Estudiante2> estudiantes;
    private final String filename = "estudiantes.ser";

    public GestionEstudiantes() {
        this.estudiantes = new HashMap<>();
        loadData();
    }

    public void agregarEstudiante(Estudiante2 estudiante) {
        if (estudiantes.containsKey(estudiante.getIdEstudiante())) {
            System.out.println("Error: Estudiante con ID " + estudiante.getIdEstudiante() + " ya existe.");
        } else {
            estudiantes.put(estudiante.getIdEstudiante(), estudiante);
            saveData();
        }
    }

    public Estudiante2 buscarEstudiante(String idEstudiante) {
        return estudiantes.get(idEstudiante);
    }

    public void eliminarEstudiante(String idEstudiante) {
        if (estudiantes.remove(idEstudiante) != null) {
            saveData();
        } else {
            System.out.println("Error: Estudiante con ID " + idEstudiante + " no encontrado.");
        }
    }

    public void actualizarPromedio(String idEstudiante, double nuevoPromedio) {
        Estudiante2 estudiante = estudiantes.get(idEstudiante);
        if (estudiante != null) {
            estudiante.setPromedio(nuevoPromedio);
            saveData();
        } else {
            System.out.println("Error: Estudiante con ID " + idEstudiante + " no encontrado.");
        }
    }

    public List<Estudiante2> mostrarEstudiantesPorCarrera(String carrera) {
        List<Estudiante2> result = new ArrayList<>();
        for (Estudiante2 est : estudiantes.values()) {
            if (est.getCarrera().equalsIgnoreCase(carrera)) {
                result.add(est);
            }
        }
        result.sort(Comparator.comparing(Estudiante2::getNombre));
        return result;
    }

    public List<Estudiante2> mostrarEstudiantesPorPromedio() {
        List<Estudiante2> result = new ArrayList<>(estudiantes.values());
        result.sort((e1, e2) -> Double.compare(e2.getPromedio(), e1.getPromedio()));
        return result;
    }

    private void saveData() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(estudiantes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadData() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            estudiantes = (HashMap<String, Estudiante2>) in.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo de datos no encontrado, iniciando con un sistema vacío.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
