package actProp;

import java.util.TreeSet;

public class ActProp12_05 {

    public static void main(String[] args) {

        // Ordenado por edad
        TreeSet<ClienteComparadoEdad> conjuntoClientesPorEdad = new TreeSet<>();
        conjuntoClientesPorEdad.add(new ClienteComparadoEdad("111", "Marta", "12/02/2000"));
        conjuntoClientesPorEdad.add(new ClienteComparadoEdad("114", "Alonso", "16/03/1999"));
        conjuntoClientesPorEdad.add(new ClienteComparadoEdad("115", "Jorge", "16/03/2002"));
        conjuntoClientesPorEdad.add(new ClienteComparadoEdad("112", "Carlos", "01/10/2002"));

        System.out.println("Ordenado por edad:");
        System.out.println(conjuntoClientesPorEdad);

        // Ordenado por nombre
        TreeSet<ClienteComparadoNombre> conjuntoClientesPorNombre = new TreeSet<>();
        conjuntoClientesPorNombre.add(new ClienteComparadoNombre("111", "Marta", "12/02/2000"));
        conjuntoClientesPorNombre.add(new ClienteComparadoNombre("115", "Jorge", "16/03/2002"));
        conjuntoClientesPorNombre.add(new ClienteComparadoNombre("114", "Alonso", "16/03/1999"));
        conjuntoClientesPorNombre.add(new ClienteComparadoNombre("112", "Carlos", "01/10/2002"));

        System.out.println("\nOrdenado por nombre:");
        System.out.println(conjuntoClientesPorNombre);
    }

}
