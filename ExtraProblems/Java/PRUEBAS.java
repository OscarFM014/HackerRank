public class PRUEBAS {
    public static <E extends Comparable<E>> int binarySearchRec(E[] arreglo, E valor) {
        int min = 0, max = arreglo.length - 1;
        return binarySearchRec(arreglo, min, max, valor);
    }

    private static <E extends Comparable<E>> int binarySearchRec(E[] arreglo, int min, int max, E valor) {

        if (min <= max) {
            int avg = (min + max) / 2;
            if (valor.equals(arreglo[avg])) {
                return avg;
            } else if (valor.compareTo(arreglo[avg]) < 0) {
                max = avg - 1;
            } else {
                min = avg + 1;
            }
        } else {
            return -1;
        }
        return binarySearchRec(arreglo, min, max, valor);
    }

    public static void main(String args[]) {
        Integer[] valores = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(binarySearchRec(valores, 1));
        System.out.println(binarySearchRec(valores, 5));
        System.out.println(binarySearchRec(valores, 9));
        System.out.println(binarySearchRec(valores, 8));
        System.out.println(binarySearchRec(valores, 10));
        System.out.println(binarySearchRec(valores, 0));
    }
}