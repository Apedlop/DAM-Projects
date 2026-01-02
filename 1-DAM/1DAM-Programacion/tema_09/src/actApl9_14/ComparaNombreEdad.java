//package actApl9_14;
//
//public class ComparaNombreEdad implements Comparable {
//
//    public int compareTo(Futbolista o1, Futbolista o2) {
//        int res = o1.getEdad() - o2.getEdad();
//        if (res == 0) {
//            res = o1.getNombre().compareTo(o2.getNombre());
//        }
//        return res;
//    }
//
//    @Override
//    public int compareTo(Futbolista futbolista) {
//        // La implementación de este método depende de cómo quieras comparar los objetos
//        // Si quieres usar la comparación por edad y nombre, puedes reutilizar la lógica del otro compareTo
//        // Aquí se muestra un ejemplo simple comparando solo por la edad
//        return Integer.compare(this.getEdad(), futbolista.getEdad());
//    }
//}
