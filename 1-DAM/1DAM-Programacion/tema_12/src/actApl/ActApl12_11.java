package actApl;

import actRes.ActRes12_02_Contenedor;

public class ActApl12_11 {

    public static void main(String[] args) {

        Contenedor<Integer> c = new Contenedor<>(new Integer[0]);

        // Lista sin ordenar
        for (int i = 0; i < 30; i++) {
            c.insertarAlFinal((int) (Math.random() * 10 + 1));
        }

        System.out.println("Lista sin ordenar: " + c);

        // Lista ordenada
        c.ordenar();
        System.out.println("Lista ordenada: " + c);

    }

}
