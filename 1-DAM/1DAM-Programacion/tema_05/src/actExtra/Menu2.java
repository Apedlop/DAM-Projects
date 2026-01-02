package actExtra;

import java.util.Arrays;
import java.util.Scanner;

public class Menu2 {

	    static Scanner sc = new Scanner(System.in);

	    public static void main(String[] args) {
	    	
	        int[] t = new int[0];
	        int opcion;
	        
	        do {
	            System.out.println("\n1. Insertar");
	            System.out.println("2. Eliminar");
	            System.out.println("3. Modificar");
	            System.out.println("4. Listar");
	            System.out.println("5. Ordenar");
	            System.out.println("6. Buscar");
	            System.out.println("7. Salir");
	            opcion = sc.nextInt();

	            switch (opcion) {
                case 1:
                    t = insertar(t);
                    break;
                case 2:
                    t = eliminar(t);
                    break;
                case 3:
                    modificar(t);
                    break;
                case 4:
                    listar(t);
                    break;
                case 5:
                    ordenar(t);
                    break;
                case 6:
                    buscar(t);
                    break;
            }

        } while (opcion < 7);
	        
	    }

	    static int[] insertar(int[] t) {
	    	
	        System.out.println("1. Al principio");
	        System.out.println("2. Al final");
	        System.out.println("3. En una posición concreta");
	        int opcion = sc.nextInt();

	        switch (opcion) {
	            case 1:
	                t = insertarAlPrincipio(t);
	                break;
	            case 2:
	                t = insertarAlFinal(t);
	                break;
	            case 3:
	                t = insertarEnPosicionConcreta(t);
	                break;
	        }
	        
	        return t;
	        
	    }

	    static int[] insertarAlPrincipio(int[] t) {

	        int[] nuevoArray = new int[t.length + 1];
	        
	        System.out.println("Introduce el número a insertar al principio: ");
	        int num = sc.nextInt();
	        
	        nuevoArray[0] = num;
	        
	        System.arraycopy(t, 0, nuevoArray, 1, t.length);
	        
	        return nuevoArray;
	        
	    }

	    static int[] insertarAlFinal(int[] t) {
	    	
	        System.out.println("Introduce el número a insertar al final: ");
	        int num = sc.nextInt();
	        
	        int[] nuevoArray = Arrays.copyOf(t, t.length + 1);
	        
	        nuevoArray[t.length] = num;
	        
	        return nuevoArray;
	        
	    }

	    static int[] insertarEnPosicionConcreta(int[] t) {
	    	
	        System.out.println("Introduce la posición donde insertar: ");
	        int posicion = sc.nextInt();
	        
	        System.out.println("Introduce el número a insertar: ");
	        int num = sc.nextInt();

	        if (posicion < 0 || posicion > t.length) {
	            System.out.println("Posición no válida.");
	            return t;
	        }

	        int[] nuevoArray = new int[t.length + 1];

	        for (int i = 0, j = 0; i < nuevoArray.length; i++) {
	            if (i == posicion) {
	                nuevoArray[i] = num;
	            } else {
	                nuevoArray[i] = t[j++];
	            }
	        }

	        return nuevoArray;
	        
	    }

	    static int[] eliminar(int[] t) {
	    	
	        System.out.println("1. Al principio");
	        System.out.println("2. Al final");
	        System.out.println("3. En una posición concreta");
	        int opcionEliminar = sc.nextInt();

	        switch (opcionEliminar) {
	            case 1:
	                t = eliminarAlPrincipio(t);
	                break;
	            case 2:
	                t = eliminarAlFinal(t);
	                break;
	            case 3:
	                t = eliminarEnPosicionConcreta(t);
	                break;
	        }
	        
	        return t;
	        
	    }

	    static int[] eliminarAlPrincipio(int[] t) {
	    	
	        if (t.length == 0) {
	            System.out.println("No hay elementos para eliminar al principio.");
	            return t;
	        }

	        int[] nuevoArray = Arrays.copyOfRange(t, 1, t.length);
	        
	        return nuevoArray;
	        
	    }

	    static int[] eliminarAlFinal(int[] t) {
	    	
	        if (t.length == 0) {
	            System.out.println("No hay elementos para eliminar al final.");
	            return t;
	        }

	        int[] nuevoArray = Arrays.copyOf(t, t.length - 1);
	        
	        return nuevoArray;
	        
	    }

	    static int[] eliminarEnPosicionConcreta(int[] t) {
	    	
	        System.out.println("Introduce la posición a eliminar: ");
	        int posicion = sc.nextInt();

	        if (posicion < 0 || posicion >= t.length) {
	            System.out.println("Posición no válida.");
	            return t;
	        }

	        int[] nuevoArray = new int[t.length - 1];

	        for (int i = 0, j = 0; i < t.length; i++) {
	            if (i != posicion) {
	                nuevoArray[j++] = t[i];
	            }
	        }

	        return nuevoArray;
	    }

	    static void modificar(int[] t) {
	    	
	        if (t.length == 0) {
	            System.out.println("No hay elementos para modificar.");
	            return;
	        }

	        System.out.println("Introduce la posición a modificar: ");
	        int posicion = sc.nextInt();

	        if (posicion < 0 || posicion >= t.length) {
	            System.out.println("Posición no válida.");
	            return;
	        }

	        System.out.println("Introduce el nuevo valor: ");
	        int nuevoValor = sc.nextInt();

	        t[posicion] = nuevoValor;
	        System.out.println("Elemento modificado.");
	    }

	    static void listar(int[] t) {
	        
	    	System.out.println(Arrays.toString(t));
	    }

	    static void ordenar(int[] t) {
	    	
	        Arrays.sort(t);
	        
	        System.out.println("Tabla ordenada: " + Arrays.toString(t));
	        
	    }

	    static void buscar(int[] t) {
	    	
	        if (t.length == 0) {
	            System.out.println("El array está vacío.");
	            return;
	        }

	        System.out.println("1. Buscar en tabla ordenada");
	        System.out.println("2. Buscar en tabla desordenada");
	        int opcionBuscar = sc.nextInt();

	        System.out.println("Introduce el número a buscar: ");
	        int num = sc.nextInt();

	        switch (opcionBuscar) {
	            case 1:
	                buscarEnTablaOrdenada(t, num);
	                break;
	            case 2:
	                buscarEnTablaDesordenada(t, num);
	                break;
	            default:
	                System.out.println("Opción no válida.");
	        }
	        
	    }

	    static void buscarEnTablaOrdenada(int[] t, int num) {
	    	
	        int indice = Arrays.binarySearch(t, num);
	        
	        if (indice >= 0) {
	            System.out.println("El número " + num + " está en la posición " + indice + " de la tabla ordenada.");
	        } else {
	            System.out.println("El número " + num + " no se encuentra en la tabla ordenada.");
	        }
	        
	    }

	    static void buscarEnTablaDesordenada(int[] t, int num) {
	    	
	        boolean encontrado = false;
	        
	        for (int i = 0; i < t.length; i++) {
	            if (t[i] == num) {
	                System.out.println("El número " + num + " está en la posición " + i + " de la tabla desordenada.");
	                encontrado = true;
	                break;
	            }
	        }
	        
	        if (!encontrado) {
	            System.out.println("El número " + num + " no se encuentra en la tabla desordenada.");
	        }
	        
	    }
	    
	}
