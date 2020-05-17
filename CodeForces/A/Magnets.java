
//Problem:
//https://codeforces.com/contest/344/problem/A
import java.util.*;

public class Magnets {

    public static int magnetsTogether(int[] magnets) {
        int count = 1;
        int current = 0;
        for (int magnet = 0; magnet < magnets.length - 1; magnet++) {
            current = magnets[magnet];
            if (current != magnets[magnet + 1]) {
                count++;
            }

        }

        return count;
    }

    public static void main(String args[]) {
        Scanner res = new Scanner(System.in);
        int numberMagnets = res.nextInt();
        int[] magnets = new int[numberMagnets];

        for (int i = 0; i < numberMagnets; i++) {
            magnets[i] = res.nextInt();
        }

        System.out.println(magnetsTogether(magnets));
        res.close();
    }
}
// Oscar