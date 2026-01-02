package actRes;

public class ActRes12_13 {

    public static void main(String[] args) {

        ActRes12_13_Sorteo<Integer> s = new ActRes12_13_Sorteo<>();

        for (int i = 0; i < 100; i++) {
            s.add(i);
        }

        System.out.println(s);
        System.out.println("Premiados: " + s.premiados(20));

    }

}
