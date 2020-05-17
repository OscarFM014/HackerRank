import java.util.*;

public class Countdown {

    public static int solution(int[] n, int K) {
        if (n.length == 1 && n[0] == K) {
            return 1;
        }
        int curr = 0;
        int pos = 0;
        boolean first = false;
        int result = 0;

        for (int i = 0; i < n.length - 1; i++) {
            curr = n[i];

            if (curr == K) {
                first = true;
            }
            pos = n[i + 1];
            if (first) {
                if (curr - 1 == pos) {
                    if (pos == 1) {
                        result++;
                        first = false;
                    }
                } else {
                    first = false;
                }
            }

        }

        return result;
    }

    public static void main(String args[]) {

        Scanner res = new Scanner(System.in);
        int cases = res.nextInt();
        int N = 0;
        int K = 0;
        int[] n = new int[N];
        System.out.println();
        for (int i = 0; i < cases; i++) {
            N = res.nextInt();
            K = res.nextInt();
            n = new int[N];
            for (int j = 0; j < N; j++) {
                n[j] = res.nextInt();
            }
            System.out.println("Case #" + (i + 1) + ": " + solution(n, K));
        }
        res.close();
    }
}