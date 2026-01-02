package actExtra1;

public class AsignaturaNota {
	
    private Asignatura asignatura;
    private Calificaciones calificaciones;

    public AsignaturaNota(Asignatura asignatura, Calificaciones calificaciones) {
        this.asignatura = asignatura;
        this.calificaciones = calificaciones;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public Calificaciones getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(Calificaciones calificaciones) {
        this.calificaciones = calificaciones;
    }
}
