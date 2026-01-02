package Examen10_F;

public class Main {

	public static void main(String[] args) {
		ConjEmpleado c=new ConjEmpleado();
		c.añadirEmpleados();
		System.out.println("El salario medio es "+c.calcularSalarioPromedio());
		c.calcularMasJoven();
		c.calcularSalarioMax();
		System.out.println("LISTADO:");
		c.listadoCompleto();
		
		System.out.println("LISTADO ORDENADO:");
		c.ordenarNombre();
		c.listadoCompleto();
		c.escribirDatos();
	}

}
