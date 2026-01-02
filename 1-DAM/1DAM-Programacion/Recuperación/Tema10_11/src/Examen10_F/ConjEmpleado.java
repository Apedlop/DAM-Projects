package Examen10_F;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ConjEmpleado {
	Empleado empleados[]=new Empleado[0];
	
	static int calcularEdad(String fechaNacimiento[]) {
		int año=Integer.valueOf(fechaNacimiento[2]);
		return 2024-año;
	}
	
	public void añadirEmpleados() {
		try (BufferedReader in=new BufferedReader(new FileReader("src/Examen10_F/FMMent.txt"));){
			Integer salario = null;
			String nombre = null;
			String departamento = null;
			String fechaNacimiento[]=new String[0];
			String datosCompletos[]=new String[0];
			Integer edad=0;
			String l=in.readLine();
			while (l!=null) {
				Scanner s=new Scanner(l);
				String prefijo=s.next();
				if (prefijo.equals("Nombre:")) {
					nombre=l.substring(8);
				} else if (prefijo.equals("Fecha")) {
					String fechaCompleta[]=l.substring(21).split("-");
					edad=calcularEdad(fechaCompleta);
				}else if (prefijo.equals("Departamento:")) {
					departamento=l.substring(14);
				}else if (prefijo.equals("Salario:")) {
					salario=Integer.valueOf(l.substring(9));
				}
				l=in.readLine();
				if (prefijo.equals("---")) {
					empleados=Arrays.copyOf(empleados, empleados.length+1);
					empleados[empleados.length-1]=new Empleado(nombre, edad, departamento, salario);
				}
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public int calcularSalarioPromedio() {
		int salarioPromedio=0;
		for (int i=0; i<empleados.length; i++) {
			salarioPromedio+=empleados[i].salario;
		}
		return salarioPromedio/empleados.length;
	}

	
	public void calcularSalarioMax() {
		int salarioMax=0;
		int indiceMax=-1;
		for (int i=0; i<empleados.length; i++) {
			if (empleados[i].salario>salarioMax) {
				indiceMax=i;
				salarioMax=empleados[i].salario;
			}
		}
		System.out.println("SALARIO MÁS ALTO:");
		System.out.println("Nombre: "+empleados[indiceMax].nombre+", Edad: "+empleados[indiceMax].edad+", Departamento: "+empleados[indiceMax].departamento+", Salario (es el más alto): "+empleados[indiceMax].nombre);
	}
	
	
	public void calcularMasJoven() {
		int edadMin=1000;
		int indiceMin=-1;
		for (int i=0; i<empleados.length; i++) {
			if (empleados[i].edad<edadMin) {
				indiceMin=i;
				edadMin=empleados[i].edad;
			}
		}
		
		System.out.println("EDAD MÁS BAJA:");
		System.out.println("Nombre: "+empleados[indiceMin].nombre+", Edad (es el más joven): "+empleados[indiceMin].edad+", Departamento: "+empleados[indiceMin].departamento+", Salario: "+empleados[indiceMin].nombre);
	}
	
	public void ordenarNombre() {
		Arrays.sort(empleados);
	}
	
	public void listadoCompleto() {
		for (int i=0; i<empleados.length; i++) {
			System.out.println(empleados[i].toString());
		}
	}
	
	public void escribirDatos() {
		try (BufferedWriter out=new BufferedWriter(new FileWriter("src/pack/FMMsal.txt"));){
			for (int i=0; i<empleados.length; i++) {
				out.write("NOMBRE: "+empleados[i].nombre);
				out.write(" EDAD: "+empleados[i].edad);
				out.newLine();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
