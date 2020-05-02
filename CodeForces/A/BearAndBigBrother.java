
//!Problem:
//https://codeforces.com/contest/791/problem/A
import java.util.*;

public class BearAndBigBrother {

    public static int yearsToBeBigger(int Limak, int Bob) {
        int years = 0;
        while (Limak <= Bob) {
            Limak *= 3;
            Bob *= 2;
            years++;
            // System.out.println(Limak + " " + Bob + " " + years);
        }

        return years;
    }

    public static void main(String args[]) {
        Scanner res = new Scanner(System.in);
        int Limak = res.nextInt();
        int Bob = res.nextInt();
        System.out.println(yearsToBeBigger(Limak, Bob));
        res.close();
    }
}
// Oscar