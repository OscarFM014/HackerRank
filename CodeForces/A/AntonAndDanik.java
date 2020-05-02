//!Problem:
//https://codeforces.com/contest/734/problem/A

import java.util.*;

public class AntonAndDanik {

    public static String theWinner(int games, String results) {
        if (games <= 0 || results.length() == 0) {
            return "Friendship";
        }
        int Anton = 0;
        int Danik = 0;

        for (int i = 0; i < results.length(); i++) {
            if (results.charAt(i) == 'A') {
                Anton++;
            } else if (results.charAt(i) == 'D') {
                Danik++;
            }

            if (games - Anton < Anton) {
                return "Anton";
            }
            if (games - Danik < Danik) {
                return "Danik";
            }
        }

        if (Anton < Danik) {
            return "Danik";
        } else if (Anton > Danik) {
            return "Anton";
        }
        return "Friendship";
    }

    public static void main(String args[]) {
        Scanner res = new Scanner(System.in);
        int games = res.nextInt();
        res.nextLine();
        String results = res.nextLine();
        System.out.println(theWinner(games, results));
        res.close();
    }
}
// Oscar