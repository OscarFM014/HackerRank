import java.util.*;

public class HappyNumber {

    public static boolean isHappy(int n) {
        HashSet<Integer> same = new HashSet<Integer>();
        while (n != 1) {
            int aux = 0;
            while (n > 0) {
                aux = aux + (n % 10) * (n % 10);
                n = n / 10;
            }
            if (same.contains(aux)) {
                return false;
            }
            same.add(aux);
            n = aux;
        }
        return true;
    }

    public static void main(String args[]) {
        System.out.println(isHappy(20));
    }
}