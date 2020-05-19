
//Problem
//http://codeforces.com/contest/381/problem/A
import java.util.*;

public class SerejaandDima {

    public static void game(int[] cards) {
        int s = 0;
        int d = 0;
        int right = cards.length - 1;
        int left = 0;
        boolean flag = true;
        while (right >= left) {
            if (flag) {
                if (cards[left] >= cards[right]) {
                    s = s + cards[left];
                    left++;
                } else {
                    s = s + cards[right];
                    right--;
                }
                flag = false;
            } else {
                if (cards[left] >= cards[right]) {
                    d = d + cards[left];
                    left++;
                } else {
                    d = d + cards[right];
                    right--;
                }
                flag = true;
            }
        }
        System.out.println(s + " " + d);
    }

    public static void main(String args[]) {
        Scanner res = new Scanner(System.in);
        int numberCards = res.nextInt();
        int[] cards = new int[numberCards];

        for (int i = 0; i < numberCards; i++) {
            cards[i] = res.nextInt();
        }

        game(cards);
        res.close();
    }
}
// Oscar