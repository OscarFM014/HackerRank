public class StarsOne {

    public static int recursive(int number) {
        if (number == 1) {
            System.out.println('*' * number);
            return number;
        }
        System.out.println('*' * number);
    }

    public static void main(String args[]) {
        System.out.println('s' * 2);
    }
}