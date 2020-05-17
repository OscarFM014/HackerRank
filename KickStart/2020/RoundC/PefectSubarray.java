import java.util.*;

public class PefectSubarray {

    public static int solution(int[] array) {
        int result = 0;
        int sum = 0;
        double resD = 0;
        int resI = 0;
        int cur = 0;
        int pos = 0;

        for (int i = 0; i < array.length; i++) {
            cur = array[i];
            resD = Math.sqrt(cur);
            resI = (int) resD;
            if ((resD - resI) == 0) {
                result++;
            }
            sum = sum + cur;
            for (int j = i + 1; j < array.length; j++) {
                pos = array[j];
                sum = sum + pos;
                resD = Math.sqrt(sum);
                resI = (int) resD;
                if ((resD - resI) == 0) {
                    result++;
                }
            }
            sum = 0;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner res = new Scanner(System.in);
        int cases = res.nextInt();
        int elements = 0;
        int[] n = new int[elements];
        System.out.println();
        for (int i = 0; i < cases; i++) {
            elements = res.nextInt();
            n = new int[elements];
            for (int j = 0; j < elements; j++) {
                n[j] = res.nextInt();
            }
            System.out.println("Case #" + (i + 1) + ": " + solution(n));
        }
    }
}