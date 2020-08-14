
import java.util.*;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        if (x == 0) {
            return true;
        }

        LinkedList<Integer> list = new LinkedList<>();
        int right = 0;
        int left = 0;

        while (x > 0) {
            list.add(x % 10);
            x = x / 10;
        }

        right = list.size() - 1;

        while (left < right) {
            if (list.get(left) != list.get(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}