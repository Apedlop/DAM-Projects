package Act2_07;

public class CompartirHilos {

    public static void main(String[] args) {
        Contador cont = new Contador(0); // Inicializamos el contador en 0
        int iteraciones = 5000; // Total de iteraciones a realizar entre todos los hilos

        HiloA hiloA = new HiloA("HiloA", cont, iteraciones);
        HiloB hiloB = new HiloB("HiloB", cont, iteraciones);
        HiloC hiloC = new HiloC("HiloC", cont, iteraciones);
        HiloD hiloD = new HiloD("HiloD", cont, iteraciones);
        HiloE hiloE = new HiloE("HiloE", cont, iteraciones);

        hiloA.start();
        hiloB.start();
        hiloC.start();
        hiloD.start();
        hiloE.start();

        try {
            /* Esperamos a que todos los hilos terminen su ejecución mediante el método join(), que asegura que el hilo principal (main)
             * no continúe hasta que cada uno de estos hilos haya finalizado. */
            hiloA.join(); // Espera a que hiloA termine
            hiloB.join(); // Espera a que hiloB termine
            hiloC.join(); // Espera a que hiloC termine
            hiloD.join(); // Espera a que hiloD termine
            hiloE.join(); // Espera a que hiloE termine
        } catch (InterruptedException e) {
            // Si el hilo actual es interrumpido mientras espera, se lanza una excepción.
            e.printStackTrace();
        }

        System.out.println("Resultado sin sincronización: " + cont.valor());

        /* ¿Se optiene el resultado correcto?
        *  Si no sincronizamos el contador el resultado simepre será o menor a 5000 o mayor. Sin embargo, si sincronizamos el contador
        *  simepre nos saldrá el valor correcto.
        *  Si hacemos la sincronización con Thread y con Runnable el valor siempre será correcto, lo que diferencia al Thread de la interfaz
        *  Runnable es:
        *  - Thread: Es útil para tareas simples cuano no necesitamos mucha flexibilidad o cuando necesitamos heredar de otra clase.
        *  - Runnable: Es más adecuado para una solución flexible, sobre todo cuando trabajamos con varios hilos o cuando usamos codigos distintos
        *   en hilos diferentes.  */
    }
}
