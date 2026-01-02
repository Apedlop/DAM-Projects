package ex2Ev2;

import java.util.Scanner;

public class Act1_ÁngelaPedrera {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int v[] = new int[10];
		int eliminados = 0;
		int v1[] = new int [10];
		int v2[] = new int [3];
		int k = 2;
		
		System.out.print("Tabla principal: ");
		for (int i = 0; i < v.length; i++) {
			v[i] = (int) (Math.random() * 10 + 1);
			System.out.print(v[i] + " ");
		}
		
		System.out.print("\nTabla desplazada dos pasos a la derecha: ");
		desplDerech(v, k);
		listar(v);
		
		System.out.print("\nTabla sin duplicados: ");
		eliminados = eliminarDuplicado(v);
		listar(v);
		System.out.println("\nEliminados: " + eliminados);
		
		System.out.print("Tabla ordenada: ");
		ordenarParcial(v, k);
		listar(v);
		
		System.out.println("\nTabla subsecuencia: ");
		buscarSubsecuencia(v1, v2);
		
	}
	
	static void desplDerech(int[] v, int k) {

		
		for (int i = v.length - 1; i >= k; i--) {
		    v[i] = v[i - k];
		}

		
		for (int i = 0; i < k; i++) {
		
		    v[i] = v[k];
		}
	}
	
	static int eliminarDuplicado (int[] v) {
		
		 int n = v.length;

		    if (n == 0 || n == 1) {
		        return 0;
		    }

		    int eliminados = 0;

		    for (int i = 0; i < n - 1; i++) {
		        for (int j = i + 1; j < n; j++) {
		            if (v[i] == v[j]) {
		                if (v[i] != 0) {
		                    v[j] = 0;
		                    eliminados++;
		                }
		            }
		        }
		    }
		    
		    int aux = 0;
		    for (int i = 0; i < n; i++) {
		        if (v[i] != 0) {
		            v[aux++] = v[i];
		        }
		    }

		    while (aux < n) {
		        v[aux++] = 0;
		    }

		    return eliminados;
		}
	   
		

	
	static void ordenarParcial (int[] v, int k) {
		
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < (k - i); j++) {
				if (v[j] > v[j + 1]) {
					int aux = v[j];
					v[j] = v[j + 1];
					v[j + 1] = aux;
				}
			}
		}
	}

	static void listar (int[] v) {
		
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " ");
		}
		
	}
	
	static boolean buscarSubsecuencia (int[] v1, int[] v2) {
		
		boolean encontrado;
		
		System.out.print("v1: ");
		for (int i = 0; i < v1.length; i++) {
			v1[i] = (int) (Math.random() * 10 + 1);
			System.out.print(v1[i] + " ");
		}
		System.out.println();
		
		System.out.print("v2: ");
		for (int i = 0; i < v2.length; i++) {
			v2[i] = (int) (Math.random() * 10 + 1);
			System.out.print(v2[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < v1.length; i++) {
			for (int j = 0; j < v2.length; j++) {
				if (v1 == v2) {
					encontrado = true;
				}
			}
		}

		if (encontrado = true) {
			System.out.println("El v2 sí está dentro del v1");
		} else {
			System.out.println("El v2 no está dentro del v1");
		}
		return false;
		
	}
}
