package actRes;

public class ActRes12_02 {

    public static void main(String[] args) {

        ActRes12_02_Contenedor<Integer> c = new ActRes12_02_Contenedor<>(new Integer[0]);

        for (int i = 0; i < 20; i++) {
            c.insertarAlFinal((int) (Math.random() * 20 + 1));
        }

        System.out.println("Sin ordenar: " + c);
        c.ordenar();
        System.out.println("Ordenado: " + c);
        Integer n = c.extraerDelPrincipio();
        System.out.println("Elemento extraido del principio: " + n);
        Integer n2 = c.extraerDelFinal();
        System.out.println("Elemento extraido del final: " + n2);
        System.out.println("Después de extraer: " + c);

    }

}
