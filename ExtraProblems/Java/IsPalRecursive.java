class IsPalRecursive {

    public static int pal(int number, int aux) {
        if (number == 0) {
            return aux;
        } else {
            System.out.println("Before: " + number);
            aux = pal(number / 10, aux);

        }
        System.out.println("After: " + aux);
        return 1;

    }

    public static int prepPal(int number) {
        if (number < 0) {
            number = number * -1;
        }
        int aux = number;
        return pal(number, aux);
    }

    public static void main(String args[]) {
        System.out.println(prepPal(12344321));
    }
}