package actRes;

public class ActRes12_16_Academico implements Comparable<ActRes12_16_Academico> {

    String nombre;
    int aIngreso;

    public ActRes12_16_Academico(String nombre, int aIngreso) {
        this.nombre = nombre;
        this.aIngreso = aIngreso;
    }

    @Override
    public int compareTo (ActRes12_16_Academico o) {
        return nombre.compareTo(o.nombre);
    }

    @Override
    public String toString() {
        return "Academico {" + nombre + ", año de ingreso = " + aIngreso+ "}\n";
    }

}
