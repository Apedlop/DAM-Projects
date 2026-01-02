package actApl;

import java.util.ArrayList;
import java.util.List;

public class Supercola {

    List<Integer> cola1;
    List<Integer> cola2;

    public Supercola() {
        this.cola1 = new ArrayList<>();
        this.cola2 = new ArrayList<>();
    }

    public void encolarCola1(int elemento) {
        cola1.add(elemento);
    }

    public void encolarCola2(int elemento) {
        cola2.add(elemento);
    }

    public String desencolarCola1() {
        if (!cola1.isEmpty()) {
            return "Cola1: " + cola1;
        } else if (!cola2.isEmpty()) {
            return desencolarCola2();
        } else {
            return null;
        }
    }

    public String desencolarCola2() {
        if (!cola2.isEmpty()) {
            return "Cola2: " + cola2;
        } else if (!cola1.isEmpty()) {
            return desencolarCola1() + "\nCola2: " + cola2;
        } else {
            return null;
        }
    }




}
